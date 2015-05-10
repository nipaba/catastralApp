/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pv168Web.gui;

import cz.pv168Web.model.Land;
import cz.pv168Web.model.Ownership;
import cz.pv168Web.model.Person;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Tomas
 */
public class OwnershipDetail extends javax.swing.JFrame {

    /**
     * Creates new form OwnershipDetail
     */
    public OwnershipDetail() {
        initComponents();
    }
    
    public OwnershipDetail(Person p, Land l, Ownership o) {
        initComponents();
        
        if (p==null || o==null || l==null){
            dispose();;
            
        }
        else {
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            //PERSON
            labelPersonIDvalue.setText(p.getPersonId()+"");
            labelPersonNameValue.setText(p.getName());
            labelPersonSurnameValue.setText(p.getSurname());
            labelPersonBirthNumberValue.setText(p.getBirthNumber());
            labelPersonStateValue.setText(p.getState());
            
            Date birthDate = p.getBirthDate();
            labelPersonBirthdate.setText(format.format(p.getBirthDate()));
//           
//            LocalDate birth = LocalDateTime.ofInstant(birthDate.toInstant(), ZoneId.systemDefault()).toLocalDate();
//            LocalDate today = LocalDate.now();
            
//            Period period = Period.between(birth, today);    
//            labelPersonAgeValue.setText(period.getYears()+"");
            
            //LAND
            labelLandIDvalue.setText(l.getLandID()+"");
            labelLandBuildUpAreaValue.setText(l.getBuildUpArea()+"");
            labelLandCatastralAreaValue.setText(l.getCatastralArea());
            labelLandNotesValue.setText(l.getNotes());
            labelLandSizeValue.setText(l.getSize()+"");
            labelLandTypeValue.setText(l.getType());
            
            //OWNERSHIP
//            labelOwnershipEndValue.setText(format.format(o.getEndDate()));
//            labelOwnershipStartValue.setText(format.format(o.getStartDate()));
                    
            
        }
        
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

        jLabel1 = new javax.swing.JLabel();
        labelPersonState = new javax.swing.JLabel();
        labelPersonBirthNumber = new javax.swing.JLabel();
        labelPersonId = new javax.swing.JLabel();
        labelPersonDetailTitle = new javax.swing.JLabel();
        labelPersonName = new javax.swing.JLabel();
        labelPersonSurname = new javax.swing.JLabel();
        labelPersonBirthdate = new javax.swing.JLabel();
        labelPersonAge = new javax.swing.JLabel();
        labelPersonIDvalue = new javax.swing.JLabel();
        labelPersonNameValue = new javax.swing.JLabel();
        labelPersonSurnameValue = new javax.swing.JLabel();
        labelPersonBirthdateValue = new javax.swing.JLabel();
        labelPersonBirthNumberValue = new javax.swing.JLabel();
        labelPersonStateValue = new javax.swing.JLabel();
        labelPersonAgeValue = new javax.swing.JLabel();
        labelLandDetail = new javax.swing.JLabel();
        labelLandID = new javax.swing.JLabel();
        labelLandSize = new javax.swing.JLabel();
        labelLandCatastralArea = new javax.swing.JLabel();
        labelLandCatastralAreaValue = new javax.swing.JLabel();
        labelLandBuildUpArea = new javax.swing.JLabel();
        labelLandType = new javax.swing.JLabel();
        labelLandNotes = new javax.swing.JLabel();
        labelLandIDvalue = new javax.swing.JLabel();
        labelLandSizeValue = new javax.swing.JLabel();
        labelLandBuildUpAreaValue = new javax.swing.JLabel();
        labelLandTypeValue = new javax.swing.JLabel();
        labelLandNotesValue = new javax.swing.JLabel();
        labelOwnershipDetail1 = new javax.swing.JLabel();
        labelOwnershipStart = new javax.swing.JLabel();
        labelOwnershipEnd = new javax.swing.JLabel();
        labelOwnershipStartValue = new javax.swing.JLabel();
        labelOwnershipEndValue = new javax.swing.JLabel();
        labelOwnershipDetail = new javax.swing.JLabel();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("cz/pv168Web/gui/OwnershipDetail"); // NOI18N
        jLabel1.setText(bundle.getString("OwnershipDetail.jLabel1.text")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelPersonState.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonState.setText(bundle.getString("OwnershipDetail.labelPersonState.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonState, gridBagConstraints);

        labelPersonBirthNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonBirthNumber.setText(bundle.getString("OwnershipDetail.labelPersonBirthNumber.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonBirthNumber, gridBagConstraints);

        labelPersonId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonId.setText(bundle.getString("OwnershipDetail.labelPersonId.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 85;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonId, gridBagConstraints);

        labelPersonDetailTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPersonDetailTitle.setText(bundle.getString("OwnershipDetail.labelPersonDetailTitle.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonDetailTitle, gridBagConstraints);

        labelPersonName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonName.setText(bundle.getString("OwnershipDetail.labelPersonName.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonName, gridBagConstraints);

        labelPersonSurname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonSurname.setText(bundle.getString("OwnershipDetail.labelPersonSurname.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonSurname, gridBagConstraints);

        labelPersonBirthdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonBirthdate.setText(bundle.getString("OwnershipDetail.labelPersonBirthdate.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonBirthdate, gridBagConstraints);

        labelPersonAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonAge.setText(bundle.getString("OwnershipDetail.labelPersonAge.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 122;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonAge, gridBagConstraints);

        labelPersonIDvalue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonIDvalue.setText(bundle.getString("OwnershipDetail.labelPersonIDvalue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonIDvalue, gridBagConstraints);

        labelPersonNameValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonNameValue.setText(bundle.getString("OwnershipDetail.labelPersonNameValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonNameValue, gridBagConstraints);

        labelPersonSurnameValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonSurnameValue.setText(bundle.getString("OwnershipDetail.labelPersonSurnameValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonSurnameValue, gridBagConstraints);

        labelPersonBirthdateValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonBirthdateValue.setText(bundle.getString("OwnershipDetail.labelPersonBirthdateValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonBirthdateValue, gridBagConstraints);

        labelPersonBirthNumberValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonBirthNumberValue.setText(bundle.getString("OwnershipDetail.labelPersonBirthNumberValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonBirthNumberValue, gridBagConstraints);

        labelPersonStateValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonStateValue.setText(bundle.getString("OwnershipDetail.labelPersonStateValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonStateValue, gridBagConstraints);

        labelPersonAgeValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPersonAgeValue.setText(bundle.getString("OwnershipDetail.labelPersonAgeValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelPersonAgeValue, gridBagConstraints);

        labelLandDetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelLandDetail.setText(bundle.getString("OwnershipDetail.labelLandDetail.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandDetail, gridBagConstraints);

        labelLandID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandID.setText(bundle.getString("OwnershipDetail.labelLandID.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandID, gridBagConstraints);

        labelLandSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandSize.setText(bundle.getString("OwnershipDetail.labelLandSize.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandSize, gridBagConstraints);

        labelLandCatastralArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandCatastralArea.setText(bundle.getString("OwnershipDetail.labelLandCatastralArea.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandCatastralArea, gridBagConstraints);

        labelLandCatastralAreaValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandCatastralAreaValue.setText(bundle.getString("OwnershipDetail.labelLandCatastralAreaValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandCatastralAreaValue, gridBagConstraints);

        labelLandBuildUpArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandBuildUpArea.setText(bundle.getString("OwnershipDetail.labelLandBuildUpArea.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandBuildUpArea, gridBagConstraints);

        labelLandType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandType.setText(bundle.getString("OwnershipDetail.labelLandType.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandType, gridBagConstraints);

        labelLandNotes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandNotes.setText(bundle.getString("OwnershipDetail.labelLandNotes.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandNotes, gridBagConstraints);

        labelLandIDvalue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandIDvalue.setText(bundle.getString("OwnershipDetail.labelLandIDvalue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandIDvalue, gridBagConstraints);

        labelLandSizeValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandSizeValue.setText(bundle.getString("OwnershipDetail.labelLandSizeValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandSizeValue, gridBagConstraints);

        labelLandBuildUpAreaValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandBuildUpAreaValue.setText(bundle.getString("OwnershipDetail.labelLandBuildUpAreaValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandBuildUpAreaValue, gridBagConstraints);

        labelLandTypeValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandTypeValue.setText(bundle.getString("OwnershipDetail.labelLandTypeValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandTypeValue, gridBagConstraints);

        labelLandNotesValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLandNotesValue.setText(bundle.getString("OwnershipDetail.labelLandNotesValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelLandNotesValue, gridBagConstraints);

        labelOwnershipDetail1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelOwnershipDetail1.setText(bundle.getString("OwnershipDetail.labelOwnershipDetail1.text")); // NOI18N
        getContentPane().add(labelOwnershipDetail1, new java.awt.GridBagConstraints());

        labelOwnershipStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelOwnershipStart.setText(bundle.getString("OwnershipDetail.labelOwnershipStart.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelOwnershipStart, gridBagConstraints);

        labelOwnershipEnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelOwnershipEnd.setText(bundle.getString("OwnershipDetail.labelOwnershipEnd.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelOwnershipEnd, gridBagConstraints);

        labelOwnershipStartValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelOwnershipStartValue.setText(bundle.getString("OwnershipDetail.labelOwnershipStartValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelOwnershipStartValue, gridBagConstraints);

        labelOwnershipEndValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelOwnershipEndValue.setText(bundle.getString("OwnershipDetail.labelOwnershipEndValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelOwnershipEndValue, gridBagConstraints);

        labelOwnershipDetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelOwnershipDetail.setText(bundle.getString("OwnershipDetail.labelOwnershipDetail.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(labelOwnershipDetail, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(OwnershipDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnershipDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnershipDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnershipDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnershipDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelLandBuildUpArea;
    private javax.swing.JLabel labelLandBuildUpAreaValue;
    private javax.swing.JLabel labelLandCatastralArea;
    private javax.swing.JLabel labelLandCatastralAreaValue;
    private javax.swing.JLabel labelLandDetail;
    private javax.swing.JLabel labelLandID;
    private javax.swing.JLabel labelLandIDvalue;
    private javax.swing.JLabel labelLandNotes;
    private javax.swing.JLabel labelLandNotesValue;
    private javax.swing.JLabel labelLandSize;
    private javax.swing.JLabel labelLandSizeValue;
    private javax.swing.JLabel labelLandType;
    private javax.swing.JLabel labelLandTypeValue;
    private javax.swing.JLabel labelOwnershipDetail;
    private javax.swing.JLabel labelOwnershipDetail1;
    private javax.swing.JLabel labelOwnershipEnd;
    private javax.swing.JLabel labelOwnershipEndValue;
    private javax.swing.JLabel labelOwnershipStart;
    private javax.swing.JLabel labelOwnershipStartValue;
    private javax.swing.JLabel labelPersonAge;
    private javax.swing.JLabel labelPersonAgeValue;
    private javax.swing.JLabel labelPersonBirthNumber;
    private javax.swing.JLabel labelPersonBirthNumberValue;
    private javax.swing.JLabel labelPersonBirthdate;
    private javax.swing.JLabel labelPersonBirthdateValue;
    private javax.swing.JLabel labelPersonDetailTitle;
    private javax.swing.JLabel labelPersonIDvalue;
    private javax.swing.JLabel labelPersonId;
    private javax.swing.JLabel labelPersonName;
    private javax.swing.JLabel labelPersonNameValue;
    private javax.swing.JLabel labelPersonState;
    private javax.swing.JLabel labelPersonStateValue;
    private javax.swing.JLabel labelPersonSurname;
    private javax.swing.JLabel labelPersonSurnameValue;
    // End of variables declaration//GEN-END:variables
}
