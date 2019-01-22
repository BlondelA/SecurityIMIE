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
    ResultSet user = null;
    ResultSet role = null;
    
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
        stm.executeUpdate("INSERT INTO user (id, mail, mdp, nom, prenom, tel, role) VALUES ("+null+",\""+inscr.mail+"\",\""+inscr.mdp+"\",\""+inscr.nom+"\",\""+inscr.prenom+"\",\""+inscr.tel+"\", 2);");
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
            System.out.println ("Erreur");            
            ex.printStackTrace();        
        }
        return mail;
        
    }
    
    public ResultSet getMdp(Connexion conn){ 
        
        try{
        Statement stm = con.createStatement(); 
        mail = stm.executeQuery("SELECT mail, mdp, id, role FROM user WHERE mail = \""+conn.mail+"\" && mdp = \""+conn.mdp+"\";");
        //System.out.println(mail);
        int i = 0;
        String id;
        String role;
        int userid;
        int roleid;
            while(mail.next()){
                id = mail.getString("id");
                userid = Integer.parseInt(id); 
                conn.Utilisateur = userid;
                
                role = mail.getString("role");
                roleid = Integer.parseInt(role);
                
                Compte compte = new Compte(userid, roleid);
                i = i +1;
            }
            
            
            if(i != 1){
                JOptionPane.showMessageDialog(null,"Mail ou mot de passe invalide.", "ERREUR", JOptionPane.ERROR_MESSAGE); 
            }else{
                conn.dispose();
                JOptionPane.showMessageDialog(null,"Bienvenue.", "", JOptionPane.ERROR_MESSAGE);   
            }
        }
        catch (SQLException ex) { 
            System.out.println ("Erreur");            
            ex.printStackTrace();        
        }
        return mail;
        
    }
    
    public ResultSet getUser(Compte com){ 

        try{
        Statement stm = con.createStatement(); 
        user = stm.executeQuery("SELECT mail, mdp, id, tel, nom, prenom, role FROM user WHERE id = \""+com.user+"\";");
        
        while (user.next()){ 
            com.mail = user.getString("mail");
            com.mdp = user.getString("mdp");
            com.nom = user.getString("nom");
            com.prenom = user.getString("prenom");
            com.tel = user.getString("tel");
        }
        
        }
        catch (SQLException ex) { 
            System.out.println ("Erreur");            
            ex.printStackTrace();        
        }
        return user;
       
    }
    public ResultSet getRole(Compte com){ 

        try{
        Statement stm = con.createStatement(); 
        role = stm.executeQuery("SELECT role FROM role WHERE id = "+com.roleid+";");
        
        while (role.next()){ 
            com.role = role.getString("role");
        }
        
        }
        catch (SQLException ex) { 
            System.out.println ("Erreur");            
            ex.printStackTrace();        
        }
        return role;
       
    }
    
    public ResultSet modif(Compte com){ 
 
        try{
        Statement stm = con.createStatement(); 
        stm.executeUpdate("UPDATE user SET mail = \""+com.mail+"\", nom = \""+com.nom+"\" , prenom = \""+com.prenom+"\" , tel = \""+com.tel+"\" WHERE id =" +com.user+";");
        System.out.println ("modifié");
        }
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Une erreur s'est produite, la modification n'a pas été effectuée", "ERREUR", JOptionPane.ERROR_MESSAGE);           
            ex.printStackTrace();        
        }
        return user;
        
    }
            
}
