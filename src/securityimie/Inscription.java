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

public class Inscription extends javax.swing.JFrame {

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    public String mail = new String();
    public String mdp = new String();
    public String nom = new String();
    public String prenom = new String();
    public String tel = new String();
    public String sel = new String();
    
    /**
     * Creates new form Inscription
     */
    public Inscription() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfMail = new javax.swing.JTextField();
        btInscrition = new javax.swing.JButton();
        btRetour = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNom = new javax.swing.JTextField();
        tfPrenom = new javax.swing.JTextField();
        tfTel = new javax.swing.JTextField();
        ptfMdp = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(545, 511));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Inscription");

        jLabel2.setText("Mail :");

        jLabel3.setText("Mdp :");

        tfMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMailActionPerformed(evt);
            }
        });

        btInscrition.setBackground(new java.awt.Color(102, 102, 102));
        btInscrition.setForeground(new java.awt.Color(255, 255, 255));
        btInscrition.setText("Inscription");
        btInscrition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscritionActionPerformed(evt);
            }
        });

        btRetour.setBackground(new java.awt.Color(102, 102, 102));
        btRetour.setForeground(new java.awt.Color(255, 255, 255));
        btRetour.setText("Retour");
        btRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetourActionPerformed(evt);
            }
        });

        jLabel4.setText("Nom :");

        jLabel5.setText("Prenom :");

        jLabel6.setText("Tel :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfMail)
                            .addComponent(tfNom)
                            .addComponent(tfPrenom)
                            .addComponent(tfTel)
                            .addComponent(ptfMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btRetour)
                .addGap(34, 34, 34)
                .addComponent(btInscrition)
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ptfMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRetour)
                    .addComponent(btInscrition))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMailActionPerformed

    private void btRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetourActionPerformed
        // TODO add your handling code here:
        dispose();
        Connexion connexion = new Connexion();
    }//GEN-LAST:event_btRetourActionPerformed

    private void btInscritionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscritionActionPerformed
        // TODO add your handling code here:
        
        String password = new String(ptfMdp.getPassword());
        
        if (!tfMail.getText().matches(EMAIL_PATTERN)) {
            JOptionPane.showMessageDialog(null,"L'adresse mail n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);

        }else if (password == ""){
            JOptionPane.showMessageDialog(null,"Le mot de passe n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);
        }else if (password.length()<8){
            JOptionPane.showMessageDialog(null,"Le mot de passe doit contenir 8 charactères minimum)", "Attention", JOptionPane.WARNING_MESSAGE);
            
        }else if(tfNom.getText().length()<2){
            JOptionPane.showMessageDialog(null,"Le nom n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);
            
        }else if(tfPrenom.getText().length()<2){
            JOptionPane.showMessageDialog(null,"Le prenom n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);
 
        }else if(tfTel.getText().length()<10){
            JOptionPane.showMessageDialog(null,"Le Telephone n'est pas valide", "Attention", JOptionPane.WARNING_MESSAGE);
            
        }else{
            if(tfTel.getText().length()>=10){
                try {
                         int int1 = Integer.parseInt(tfTel.getText());   //This was a string coming from a resultset that I changed into and Int
                         tfTel.requestFocusInWindow();
                         } catch (Exception z) { 
                             JOptionPane.showMessageDialog(this, "Nombres uniquement !",
                                "Erreur", JOptionPane.ERROR_MESSAGE);
                             tfTel.setText("");
                             tfTel.requestFocusInWindow();
                             return;
                }

                String myPassword = password;
        
                // Generate Salt. The generated value can be stored in DB. 
                //String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
                String salt = PasswordUtils.getSalt(30);
        
                // Protect user's password. The generated value can be stored in DB.
                String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);
                
                mail = tfMail.getText();
                mdp = mySecurePassword;
                nom = tfNom.getText();
                prenom = tfPrenom.getText();
                tel = tfTel.getText();
                sel = salt;

                BDD bdd = new BDD();
                bdd.getConnection();
                bdd.getMail(mail);
                if(bdd.MailValide == true){
                    bdd.insert(this);
                }else{
                    JOptionPane.showMessageDialog(null,"L'adresse mail est déjà utilisée", "ERREUR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btInscritionActionPerformed

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
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInscrition;
    private javax.swing.JButton btRetour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField ptfMdp;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfNom;
    private javax.swing.JTextField tfPrenom;
    private javax.swing.JTextField tfTel;
    // End of variables declaration//GEN-END:variables
}
