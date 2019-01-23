/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securityimie;

/**
 *
 * @author antoi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        String myPassword = "myPassword123";
        
        // Generate Salt. The generated value can be stored in DB. 
        String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
        
        // Protect user's password. The generated value can be stored in DB.
        String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);
        
        // Print out protected password 
        System.out.println("My secure password = " + mySecurePassword);
        System.out.println("Salt value = " + salt);
        
        
        
        // User provided password to validate
        String providedPassword = "myPassword123";
                
        // Encrypted and Base64 encoded password read from database
        String securePassword = "HhaNvzTsVYwS/x/zbYXlLOE3ETMXQgllqrDaJY9PD/U=";
        
        // Salt value stored in database 
        //String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
        
        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);
        
        if(passwordMatch) 
        {
            System.out.println("Provided user password " + providedPassword + " is correct.");
        } else {
            System.out.println("Provided password is incorrect");
        }
        
        
        
        // TODO code application logic here*
        //System.out.println("UPDATE user SET mail = \""+"e"+"\", nom = \""+"r"+"\" , prenom = \""+"z"+"\" , tel = \""+"a"+"\" WHERE pil =" +"1"+";");
        BDD bdd = new BDD();
        bdd.getConnection();
        Connexion connexion = new Connexion();
    }
    
}
