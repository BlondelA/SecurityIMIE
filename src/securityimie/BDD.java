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
    public boolean Autorise = false;
    public Connection con = null;
    ResultSet insert = null;
    ResultSet mail = null;
    ResultSet user = null;
    ResultSet role = null;
    ResultSet getMDP = null;
    ResultSet changePass = null;
    
    //Connexion à la BDD
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
    
    //Ajouter un utilisateur
    public ResultSet insert(Inscription inscr){ 
     
        try{
        Statement stm = con.createStatement(); 
        stm.executeUpdate("INSERT INTO user (id, mail, mdp, sel, nom, prenom, tel, role) VALUES ("+null+",\""+inscr.mail+"\",\""+inscr.mdp+"\",\""+inscr.sel+"\",\""+inscr.nom+"\",\""+inscr.prenom+"\",\""+inscr.tel+"\", 3);");
        System.out.println ("envoyé");
        inscr.dispose();
        Connexion conn = new Connexion();
        JOptionPane.showMessageDialog(null,"Inscription confirmée", "", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Impossible de valider l'inscription", "ERREUR", JOptionPane.ERROR_MESSAGE);           
            ex.printStackTrace();        
        }
        return insert;
        
    }
    
    //Verrifier si l'adresse mail est disponible
    public ResultSet getMail(String adrmail){ 
        
        try{
        Statement stm = con.createStatement(); 
        mail = stm.executeQuery("SELECT mail, id FROM user WHERE mail = \""+adrmail+"\";");

        int i = 0;
            while(mail.next()){
                String number = mail.getString("id");
                MDPoublie.id = Integer.parseInt(number);	
                i = i +1;
            }
            
            if(i == 1){
                MailValide = false;
            }else if(i > 1){
                MailValide = false;
            }else if(i == 0){
                MailValide = true;
            }
        }
        catch (SQLException ex) { 
            System.out.println ("Erreur");            
            ex.printStackTrace();        
        }
        return mail;
        
    }
    
    //Verrifier la connexion
    public ResultSet getConnectUser(Connexion conn){ 
        
        String mySecurePassword = "";
        
        try{
        Statement stm = con.createStatement();
        
        mail = stm.executeQuery("SELECT mail, sel FROM user WHERE mail = \""+conn.mail+"\";");
        while(mail.next()){
            String myPassword = conn.mdp;
            // Generate Salt. The generated value can be stored in DB. 
            String salt = mail.getString("sel");
            // Protect user's password. The generated value can be stored in DB.
            mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);
        }
        
        mail = stm.executeQuery("SELECT mail, mdp, id, role FROM user WHERE mail = \""+conn.mail+"\" && mdp = \""+mySecurePassword+"\";");
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
            }
        }
        catch (SQLException ex) { 
            System.out.println ("Erreur");            
            ex.printStackTrace();        
        }
        return mail;
        
    }
    
    //Récupérer toutes les informations d'un utilisateur
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
    
    //Récupérer le nom du role
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
    
    //Récupérer la liste de tout les utilisateurs ayant un role équivalent 
    public ResultSet getAllUsers(ListeUser lu, int roleid){ 

        try{
        Statement stm = con.createStatement(); 
        user = stm.executeQuery("SELECT tel, nom, prenom, role FROM user ;");
        
        
        lu.model.getDataVector().clear();
        
        while (user.next()){ 
            String rol = user.getString("role");
            int egaux = Integer.parseInt(rol);
            
           if(egaux == roleid){
                
                lu.rowData[0] = user.getString("nom");
                lu.rowData[1] = user.getString("prenom");
                //lu.rowData[2] = user.getString("mail");
                lu.rowData[2] = user.getString("tel");
                lu.model.addRow(lu.rowData);
           }
        }
        
        }
        catch (SQLException ex) { 
            System.out.println ("Erreur");            
            ex.printStackTrace();        
        }
        return role;
       
    }
    
    public ResultSet getMDP(int id, String confirmMDP){
        
        try{
            
        Statement stm = con.createStatement(); 
        getMDP = stm.executeQuery("SELECT id, mdp, sel FROM user WHERE id = \""+id+"\";");
            String mySecurePassword = "";
            while(getMDP.next()){
                String myPassword = confirmMDP;
                String salt = getMDP.getString("sel");
                mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);
            }
            
        getMDP = stm.executeQuery("SELECT id, mdp, sel FROM user WHERE id = \""+id+"\" && mdp = \""+mySecurePassword+"\";");   
            int i = 0;
            while(getMDP.next()){
                i = i+1;
            }
        
            if(i == 1){
                Autorise = true;
            }else{
                Autorise = false;
            }
            
        }
        catch (SQLException ex) { 
            System.out.println ("Erreur");            
            ex.printStackTrace();        
        }
        
        return getMDP;
    }
    
    //Changer MDP
    public ResultSet changePass(int id, String pass){
        try{
            Statement stm = con.createStatement(); 
            
            String myPassword = pass;
        
            String sel = PasswordUtils.getSalt(30);
        
            String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, sel);
            
            stm.executeUpdate("UPDATE user SET mdp = \""+mySecurePassword+"\" , sel = \""+sel+"\" WHERE id =" +id+";");
            
        }catch(SQLException ex){
            System.out.println("erreur lors de la modification") ;              
        }
        return changePass;
    }
    
    //Modifier utilisateur
    public ResultSet modif(Compte com){ 
 
        try{
        Statement stm = con.createStatement(); 
        if(com.sel == null){
            stm.executeUpdate("UPDATE user SET mail = \""+com.mail+"\", nom = \""+com.nom+"\" , prenom = \""+com.prenom+"\" , tel = \""+com.tel+"\" WHERE id =" +com.user+";");
        }else{
            stm.executeUpdate("UPDATE user SET mail = \""+com.mail+"\", nom = \""+com.nom+"\" , prenom = \""+com.prenom+"\" , tel = \""+com.tel+"\" , mdp = \""+com.mdp+"\" , sel = \""+com.sel+"\" WHERE id =" +com.user+";");
        }
        System.out.println ("modifié");
        JOptionPane.showMessageDialog(null,"Les modifications ont été enregistrés", "", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Une erreur s'est produite, la modification n'a pas été effectuée", "ERREUR", JOptionPane.ERROR_MESSAGE);           
            ex.printStackTrace();        
        }
        return user;
        
    }
    
    
    //Supprimer utilisateur
    public ResultSet delete(int id){ 
        
        try{ 
        Statement stm = con.createStatement(); 
        stm.executeUpdate("DELETE FROM user WHERE id ="+id+";");
        JOptionPane.showMessageDialog(null,"Votre compte ainsi que toutes vos données ont été éffacées", "", JOptionPane.INFORMATION_MESSAGE );  
        }
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Une erreur s'est produite, la suppression n'a pas été effectuée", "ERREUR", JOptionPane.ERROR_MESSAGE);           
            ex.printStackTrace();        
        }
        return user;
        
    }
            
}
