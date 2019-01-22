/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securityimie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author antoi
 */
public class BDD {
    public boolean MailValide = false;
    
    Connection con = null;
    ResultSet insert = null;
    ResultSet mail = null;
    
    public Connection getConnection(){
        String url = new String("jdbc:mysql://localhost/securityimie");
        try {            
            String driver = "com.mysql.jdbc.Driver"; 
            String usr = "root";
            String psw = "";
            Class.forName(driver);
            con= DriverManager.getConnection(url, usr, psw);
            System.out.println ("ça marche");
        } 
        catch (SQLException ex) { 
            System.out.println ("Erreur de connexion à la Base");            
            ex.printStackTrace();        
        } 
        catch (ClassNotFoundException ex) { 
            System.out.println ("Erreur initialisation du Driver");             
            ex.printStackTrace();        
        }    
        return con;
    }
    
    public ResultSet insert(Inscription inscr){ 
     
        try{
        Statement stm = con.createStatement(); 
        stm.executeUpdate("INSERT INTO user (id, mail, mdp, nom, prenom, tel) VALUES ("+null+",\""+inscr.mail+"\",\""+inscr.mdp+"\",\""+inscr.nom+"\",\""+inscr.prenom+"\",\""+inscr.tel+"\");");
        System.out.println ("envoyé");
        inscr.dispose();
        JOptionPane.showMessageDialog(null,"Inscription confirmée", "", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Impossible de valider l'inscription", "ERREUR", JOptionPane.ERROR_MESSAGE);           
            ex.printStackTrace();        
        }
        return insert;
        
    }
    
    public ResultSet getMail(Inscription inscr){ 
        
        try{
        Statement stm = con.createStatement(); 
        mail = stm.executeQuery("SELECT mail FROM user WHERE mail = \""+inscr.mail+"\";");
        System.out.println(mail);
        int i = 0;
            while(mail.next()){
                i = i +1;
            }
            
            if(i > 0){
                MailValide = false;
                JOptionPane.showMessageDialog(null,"L'adresse mail existe déja.", "ERREUR", JOptionPane.ERROR_MESSAGE); 
            }else{
                MailValide = true;
            }
        }
        catch (SQLException ex) { 
            System.out.println ("Erreur ta mère");            
            ex.printStackTrace();        
        }
        return mail;
        
    }
    
    public ResultSet getMdp(Connexion conn){ 
        
        try{
        Statement stm = con.createStatement(); 
        System.out.println("SELECT mail, mdp FROM user WHERE mail = \""+conn.mail+"\" && mdp = \""+conn.mdp+"\");");
        mail = stm.executeQuery("SELECT mail, mdp FROM user WHERE mail = \""+conn.mail+"\" && mdp = \""+conn.mdp+"\";");
        //System.out.println(mail);
        int i = 0;
            while(mail.next()){
                i = i +1;
            }
            
            if(i != 1){
                JOptionPane.showMessageDialog(null,"Mail ou mot de passe invalide.", "ERREUR", JOptionPane.ERROR_MESSAGE); 
            }else{
                JOptionPane.showMessageDialog(null,"Bienvenue.", "ERREUR", JOptionPane.ERROR_MESSAGE); 
            }
        }
        catch (SQLException ex) { 
            System.out.println ("Erreur ta mère");            
            ex.printStackTrace();        
        }
        return mail;
        
    }
}
