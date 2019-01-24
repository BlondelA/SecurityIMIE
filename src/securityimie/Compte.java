/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securityimie;

import javax.swing.JOptionPane;

/**
 *
 * @author antoi
 */
public class Compte extends javax.swing.JFrame {

    /**
     * Creates new form Compte
     */
   
    public int user = 0;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public String mail;
    public String nom;
    public String prenom;
    public String tel;
    public String mdp;
    public String sel;
    public int roleid;
    public String role;
    
    public Compte(int usr, int rolid) {
        initComponents();
        user = usr;
        roleid = rolid;
        
        pfMdp.setVisible(false);
        pfMdpV.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        
        BDD bdd = new BDD();
        bdd.getConnection();
        bdd.getUser(this);
        bdd.getRole(this);
        
        tfNom.setText(nom);
        tfPrenom.setText(prenom);
        tfMail.setText(mail);
        tfTel.setText(tel);
        pfMdp.setText("");
        pfMdpV.setText("");
        
        status.setText("Status : " + role);
        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNom = new javax.swing.JTextField();
        tfPrenom = new javax.swing.JTextField();
        pfMdp = new javax.swing.JPasswordField();
        pfMdpV = new javax.swing.JPasswordField();
        tfTel = new javax.swing.JTextField();
        tfMail = new javax.swing.JTextField();
        btValider = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        btListUser = new javax.swing.JButton();
        btMDP = new javax.swing.JButton();
        btSuppr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenue");

        btValider.setBackground(new java.awt.Color(102, 102, 102));
        btValider.setForeground(new java.awt.Color(255, 255, 255));
        btValider.setText("Modifier");
        btValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValiderActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Déconnexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nom");

        jLabel3.setText("Prenom");

        jLabel4.setText("Mail");

        jLabel5.setText("Tel");

        jLabel6.setText("Mdp");

        jLabel7.setText("Confirmer");

        jLabel8.setText("+33");

        status.setText("Status :");

        btListUser.setBackground(new java.awt.Color(102, 102, 102));
        btListUser.setForeground(new java.awt.Color(255, 255, 255));
        btListUser.setText("Liste des utilisateurs");
        btListUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListUserActionPerformed(evt);
            }
        });

        btMDP.setBackground(new java.awt.Color(102, 102, 102));
        btMDP.setForeground(new java.awt.Color(255, 255, 255));
        btMDP.setText("changer de mot de passe");
        btMDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMDPActionPerformed(evt);
            }
        });

        btSuppr.setBackground(new java.awt.Color(102, 102, 102));
        btSuppr.setForeground(new java.awt.Color(255, 255, 255));
        btSuppr.setText("Supprimer compte");
        btSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupprActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(100, 100, 100)
                                                        .addComponent(jLabel3)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tfMail)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfTel, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                            .addComponent(pfMdp)
                                            .addComponent(pfMdpV)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(status)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(btListUser))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(btMDP))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(btValider))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btSuppr)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(status))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btMDP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfMdpV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btValider)
                .addGap(18, 18, 18)
                .addComponent(btListUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btSuppr)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Connexion connexion = new Connexion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValiderActionPerformed
        // TODO add your handling code here:
        
        String password = new String(pfMdp.getPassword());
        String passwordV = new String(pfMdpV.getPassword());
        
        if (!tfMail.getText().matches(EMAIL_PATTERN)) {
            JOptionPane.showMessageDialog(null,"L'adresse mail n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);

        }else if (password.length()<8 && password.length()!=0){
            JOptionPane.showMessageDialog(null,"Le mot de passe doit contenir 8 charactères minimum)", "Attention", JOptionPane.WARNING_MESSAGE);
            
        }else if (password != "" && passwordV == ""){
            JOptionPane.showMessageDialog(null,"La confirmation du mot de passe n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);
        }else if (password.length()!=0 && passwordV.length()<8){
            JOptionPane.showMessageDialog(null,"La confirmation du mot de passe n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);
            
        }else if (!password.equals(passwordV)){
            JOptionPane.showMessageDialog(null,"Les mots de passes doivent etre identiques)", "Attention", JOptionPane.WARNING_MESSAGE);
            
        }else if(tfNom.getText().length()<2){
            JOptionPane.showMessageDialog(null,"Le nom n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);
            
        }else if(tfPrenom.getText().length()<2){
            JOptionPane.showMessageDialog(null,"Le prenom n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);
 
        }else if(tfTel.getText().length()<9){
            JOptionPane.showMessageDialog(null,"Le Telephone n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);
        
        }else {
        
        String myPassword = password;
        // Generate Salt. The generated value can be stored in DB. ;
        String salt = PasswordUtils.getSalt(30);
        // Protect user's password. The generated value can be stored in DB.
        String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);
            
        nom = tfNom.getText();
        prenom = tfPrenom.getText();
        mail = tfMail.getText();
        tel = tfTel.getText();
        if(password.length()==0){;
            sel = null;
        }else{
            mdp = mySecurePassword;
            sel = salt; 
        }
        
        BDD bdd = new BDD();
        bdd.getConnection();
        bdd.getMail(mail);
            if(bdd.MailValide = true){
                bdd.modif(this);

                tfNom.setText(nom);
                tfPrenom.setText(prenom);
                tfTel.setText(tel);
                tfMail.setText(mail);
                pfMdp.setText("");
                pfMdpV.setText("");
            }
        }  
    }//GEN-LAST:event_btValiderActionPerformed

    private void btListUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListUserActionPerformed
        // TODO add your handling code here:
        ListeUser listeuser = new ListeUser(roleid);
    }//GEN-LAST:event_btListUserActionPerformed

    private void btMDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMDPActionPerformed
        // TODO add your handling code here:
        btMDP.setVisible(false);
        pfMdp.setVisible(true);
        pfMdpV.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
    }//GEN-LAST:event_btMDPActionPerformed

    private void btSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupprActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog (null, "Etes-vous certains de vouloir supprimer votre compte ?","Attention",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            BDD bdd = new BDD();
            bdd.getConnection();
            bdd.delete(user);
            dispose();
            Connexion conn = new Connexion();
        }
    }//GEN-LAST:event_btSupprActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compte(0, 2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btListUser;
    private javax.swing.JButton btMDP;
    private javax.swing.JButton btSuppr;
    private javax.swing.JButton btValider;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfMdp;
    private javax.swing.JPasswordField pfMdpV;
    private javax.swing.JLabel status;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfNom;
    private javax.swing.JTextField tfPrenom;
    private javax.swing.JTextField tfTel;
    // End of variables declaration//GEN-END:variables
}
