/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvbuilderfinal;

import java.awt.CardLayout;
import javax.swing.JFileChooser;

/**
 *
 * @author NHBSOHEL
 */
public class MotherFrame extends Variables {

    /**
     * Creates new form MotherFrame
     */
    public MotherFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        skillsButton = new javax.swing.JButton();
        experiencesButton = new javax.swing.JButton();
        pictureButton = new javax.swing.JButton();
        biographyInfoButton = new javax.swing.JButton();
        eduInfoButton = new javax.swing.JButton();
        personalInfoButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        panelBasic = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField(address);
        emailfield = new javax.swing.JTextField(email);
        phonefield = new javax.swing.JTextField(phone);
        jLabel8 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField(name);
        jLabel12 = new javax.swing.JLabel();
        panelBiography = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fatherNamefield = new javax.swing.JTextField(father);
        jLabel2 = new javax.swing.JLabel();
        motherNamefield = new javax.swing.JTextField(mother);
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        religionfield = new javax.swing.JTextField(religion);
        nationalityfield = new javax.swing.JTextField(nationality);
        jLabel13 = new javax.swing.JLabel();
        bloodgfield = new javax.swing.JTextField(bloodg);
        panelImage = new javax.swing.JPanel();
        imageupbtn = new javax.swing.JButton();
        imageup = new javax.swing.JLabel();
        panelExperiences = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        skillsButton.setText("SKILLS");
        skillsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillsButtonActionPerformed(evt);
            }
        });

        experiencesButton.setText("EXPERIENCES");
        experiencesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experiencesButtonActionPerformed(evt);
            }
        });

        pictureButton.setText("PICTURE");
        pictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureButtonActionPerformed(evt);
            }
        });

        biographyInfoButton.setText("BIOGRAPHY");
        biographyInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biographyInfoButtonActionPerformed(evt);
            }
        });

        eduInfoButton.setText("EDUCATIONAL INFORMATION");
        eduInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eduInfoButtonActionPerformed(evt);
            }
        });

        personalInfoButton.setText("PERSONAL INFORMATION");
        personalInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalInfoButtonActionPerformed(evt);
            }
        });

        mainPanel.setLayout(new java.awt.CardLayout());

        panelBasic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Address:");
        panelBasic.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 40));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Email Address:");
        panelBasic.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 40));

        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        panelBasic.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 30));
        panelBasic.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 200, 30));

        phonefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonefieldActionPerformed(evt);
            }
        });
        panelBasic.add(phonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 30));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Phone Number:");
        panelBasic.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 40));

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        panelBasic.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 200, 30));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("Full Name:");
        panelBasic.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 40));

        mainPanel.add(panelBasic, "panelBasic");

        panelBiography.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        panelBiography.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));
        panelBiography.add(fatherNamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 270, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Father's Name:");
        panelBiography.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));
        panelBiography.add(motherNamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 270, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Mothers's Name:");
        panelBiography.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("Religion:");
        panelBiography.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("Nationality:");
        panelBiography.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));
        panelBiography.add(religionfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 270, 30));
        panelBiography.add(nationalityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 270, 30));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setText("Blood Group:");
        panelBiography.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 30));

        bloodgfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodgfieldActionPerformed(evt);
            }
        });
        panelBiography.add(bloodgfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 270, 30));

        mainPanel.add(panelBiography, "panelUnivInfo");

        panelImage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageupbtn.setText("Upload Image");
        imageupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageupbtnActionPerformed(evt);
            }
        });
        panelImage.add(imageupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 110, 40));

        try {
            imageup.setIcon(new javax.swing.ImageIcon(ImageProcess.toBufferedImage()));
        }

        catch(Exception x) {

        }
        panelImage.add(imageup, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -170, 670, 470));

        mainPanel.add(panelImage, "panelImage");

        panelExperiences.setLayout(new java.awt.BorderLayout());
        final JFXPanel bioPanel = new JFXPanel();

        panelExperiences.add(bioPanel);
        // Code of sub-components and layout - not shown here
        Platform.runLater(() -> {
            bioInfo = new HTMLEditor();
            Scene bioScene = new Scene(bioInfo);
            bioInfo.setPrefHeight(245);
            bioInfo.setPrefWidth(245);
            bioInfo.setHtmlText(experience);
            bioPanel.setScene(bioScene);
        });

        jLabel22.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        jLabel22.setText("Experiences:");
        panelExperiences.add(jLabel22, java.awt.BorderLayout.PAGE_START);

        mainPanel.add(panelExperiences, "panelBiography");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(personalInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(biographyInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pictureButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(experiencesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eduInfoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(skillsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(personalInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(biographyInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(pictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(experiencesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eduInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skillsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personalInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalInfoButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelBasic");
    }//GEN-LAST:event_personalInfoButtonActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void phonefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonefieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void biographyInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biographyInfoButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelUnivInfo");
    }//GEN-LAST:event_biographyInfoButtonActionPerformed

    private void bloodgfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodgfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodgfieldActionPerformed

    private void pictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pictureButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelImage");
    }//GEN-LAST:event_pictureButtonActionPerformed

    private void imageupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageupbtnActionPerformed
        // TODO add your handling code here:
        JFileChooser choose = new JFileChooser();

        choose.showOpenDialog(null);

        String path = choose.getSelectedFile().getPath();
        String filename=choose.getSelectedFile().getName();
        imgExtension = filename.substring(filename.lastIndexOf("."),filename.length());
        imgExtension = imgExtension.replace(".", "");

        try {
            imgString = ImageProcess.toImageString(path);
        } catch (IOException ex) {
            Logger.getLogger(MotherFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //    System.out.println(path);
        imageup.setIcon(new javax.swing.ImageIcon(path));
    }//GEN-LAST:event_imageupbtnActionPerformed

    private void experiencesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experiencesButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelBiography");
    }//GEN-LAST:event_experiencesButtonActionPerformed

    private void eduInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eduInfoButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelEduInfo");
    }//GEN-LAST:event_eduInfoButtonActionPerformed

    private void skillsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillsButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelProfInfo");
    }//GEN-LAST:event_skillsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MotherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton biographyInfoButton;
    private javax.swing.JTextField bloodgfield;
    private javax.swing.JButton eduInfoButton;
    private javax.swing.JTextField emailfield;
    private javax.swing.JButton experiencesButton;
    private javax.swing.JTextField fatherNamefield;
    private javax.swing.JLabel imageup;
    private javax.swing.JButton imageupbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField motherNamefield;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nationalityfield;
    private javax.swing.JPanel panelBasic;
    private javax.swing.JPanel panelBiography;
    private javax.swing.JPanel panelExperiences;
    private javax.swing.JPanel panelImage;
    private javax.swing.JButton personalInfoButton;
    private javax.swing.JTextField phonefield;
    private javax.swing.JButton pictureButton;
    private javax.swing.JTextField religionfield;
    private javax.swing.JButton skillsButton;
    // End of variables declaration//GEN-END:variables
}
