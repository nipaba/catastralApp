/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pv168Web.gui;

import cz.pv168Web.model.Land;

/**
 *
 * @author Tomas
 */
public class LandInput extends javax.swing.JDialog {

    private Land land;
    private Boolean valid;
    private Boolean update = false;

    /**
     * Creates new form LandInput
     */
    public LandInput(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        labelErrorSize.setVisible(false);
        labelErrorBuildUpArea.setVisible(false);
        labelErrorNotes.setVisible(false);
        
        setTypeComboBox();
        setCatastralAreaComboBox();
    }

    public LandInput(java.awt.Frame parent, boolean modal, Land updateLand) {
        super(parent, modal);
        initComponents();
        update = true;  
        land = updateLand;
        
        System.out.println(land.toString());
        textLandSize.setText(Double.toString(land.getSize()));
        textLandBuildUpArea.setText(Double.toString(land.getBuildUpArea()));
        textLandNotes.setText(land.getNotes());
        
        labelErrorSize.setVisible(false);
        labelErrorBuildUpArea.setVisible(false);
        labelErrorNotes.setVisible(false);
        
        setTypeComboBox();
        setCatastralAreaComboBox();
    }
    public Boolean getValid(){
        return valid;
    }
    
    public Land getLand(){
        return land;
    }
 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonCancel = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        textLandSize = new javax.swing.JTextField();
        labelSize = new javax.swing.JLabel();
        labelBuildUpArea = new javax.swing.JLabel();
        textLandBuildUpArea = new javax.swing.JTextField();
        labelCatastralArea = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox();
        labelType = new javax.swing.JLabel();
        labelTitleNewPerson = new javax.swing.JLabel();
        labelNotes = new javax.swing.JLabel();
        labelErrorBuildUpArea = new javax.swing.JLabel();
        labelErrorSize = new javax.swing.JLabel();
        labelErrorNotes = new javax.swing.JLabel();
        textLandNotes = new javax.swing.JTextField();
        comboCatastralArea = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        getContentPane().add(buttonCancel, gridBagConstraints);

        buttonAdd.setText("Add new Land");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        getContentPane().add(buttonAdd, gridBagConstraints);

        textLandSize.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textLandSizeFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(textLandSize, gridBagConstraints);

        labelSize.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(labelSize, gridBagConstraints);

        labelBuildUpArea.setText("Build-up area");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(labelBuildUpArea, gridBagConstraints);

        textLandBuildUpArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textLandBuildUpAreaFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(textLandBuildUpArea, gridBagConstraints);

        labelCatastralArea.setText("Catastral area");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(labelCatastralArea, gridBagConstraints);

        comboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(comboType, gridBagConstraints);

        labelType.setText("Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(labelType, gridBagConstraints);

        labelTitleNewPerson.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitleNewPerson.setText("New Land");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(labelTitleNewPerson, gridBagConstraints);

        labelNotes.setText("Notes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 33, 0, 33);
        getContentPane().add(labelNotes, gridBagConstraints);

        labelErrorBuildUpArea.setText("Error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        getContentPane().add(labelErrorBuildUpArea, gridBagConstraints);

        labelErrorSize.setText("Error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        getContentPane().add(labelErrorSize, gridBagConstraints);

        labelErrorNotes.setText("Error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(labelErrorNotes, gridBagConstraints);

        textLandNotes.setPreferredSize(new java.awt.Dimension(100, 20));
        textLandNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLandNotesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        getContentPane().add(textLandNotes, gridBagConstraints);

        comboCatastralArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCatastralArea.setPreferredSize(new java.awt.Dimension(105, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        getContentPane().add(comboCatastralArea, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        valid = false;
        this.dispose();

    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void textLandSizeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textLandSizeFocusGained


    }//GEN-LAST:event_textLandSizeFocusGained

    private void textLandBuildUpAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textLandBuildUpAreaFocusGained

    }//GEN-LAST:event_textLandBuildUpAreaFocusGained

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTypeActionPerformed

    private void textLandNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLandNotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLandNotesActionPerformed

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
            java.util.logging.Logger.getLogger(PersonInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LandInput dialog = new LandInput(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JComboBox comboCatastralArea;
    private javax.swing.JComboBox comboType;
    private javax.swing.JLabel labelBuildUpArea;
    private javax.swing.JLabel labelCatastralArea;
    private javax.swing.JLabel labelErrorBuildUpArea;
    private javax.swing.JLabel labelErrorNotes;
    private javax.swing.JLabel labelErrorSize;
    private javax.swing.JLabel labelNotes;
    private javax.swing.JLabel labelSize;
    private javax.swing.JLabel labelTitleNewPerson;
    private javax.swing.JLabel labelType;
    private javax.swing.JTextField textLandBuildUpArea;
    private javax.swing.JTextField textLandNotes;
    private javax.swing.JTextField textLandSize;
    // End of variables declaration//GEN-END:variables

    private void setTypeComboBox(){
        
       comboType.setModel(new DefaultComboBoxModel(Type.getStateArray()));
            
        
        
    }
    
    private void setCatastralAreaComboBox(){
        
       comboCatastralArea.setModel(new DefaultComboBoxModel(CatastralArea.getStateArray()));
            
        
        
    }
}
