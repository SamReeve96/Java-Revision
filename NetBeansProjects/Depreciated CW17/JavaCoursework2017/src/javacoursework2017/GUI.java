/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework2017;

/**
 *
 * @author Samuel
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        lblLength = new javax.swing.JLabel();
        tfdLength = new javax.swing.JTextField();
        tfdDiameter = new javax.swing.JTextField();
        lblDiameter = new javax.swing.JLabel();
        cbxGrade = new javax.swing.JComboBox<>();
        lblGrade = new javax.swing.JLabel();
        lblColour = new javax.swing.JLabel();
        cbxColourPrint = new javax.swing.JComboBox<>();
        lbl_InnerInsulation = new javax.swing.JLabel();
        cbxInnerInsulation = new javax.swing.JCheckBox();
        lblOuterReinforcement = new javax.swing.JLabel();
        cbxOuterReinforcement = new javax.swing.JCheckBox();
        lblChemResistance = new javax.swing.JLabel();
        cbxChemResistance = new javax.swing.JCheckBox();
        btnAddToBasket = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pipe Ordering System");
        setMaximumSize(new java.awt.Dimension(1200, 400));
        setMinimumSize(new java.awt.Dimension(1200, 400));
        setPreferredSize(new java.awt.Dimension(1200, 400));

        lblLength.setText("Length:");

        lblDiameter.setText("Diameter:");

        cbxGrade.setMaximumRowCount(5);
        cbxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        lblGrade.setText("Plastic Grade:");

        lblColour.setText("Colour Print:");

        cbxColourPrint.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        cbxColourPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxColourPrintActionPerformed(evt);
            }
        });

        lbl_InnerInsulation.setText("Inner insulation:");

        cbxInnerInsulation.setSelected(true);
        cbxInnerInsulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxInnerInsulationActionPerformed(evt);
            }
        });

        lblOuterReinforcement.setText("Outer reinforcement:");

        cbxOuterReinforcement.setSelected(true);
        cbxOuterReinforcement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOuterReinforcementActionPerformed(evt);
            }
        });

        lblChemResistance.setText("Chemical resistance");

        cbxChemResistance.setSelected(true);
        cbxChemResistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxChemResistanceActionPerformed(evt);
            }
        });

        btnAddToBasket.setText("Add Pipe to Basket");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Plastic Type", "Plastic Grade", "Colour Print", "Inner Insulation", "Outer Reinforcement", "Chem Resist", "Length (M)", "Diameter (\")", "Pipe Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOuterReinforcement, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiameter, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLength, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGrade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblColour, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_InnerInsulation, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChemResistance, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfdDiameter)
                                    .addComponent(tfdLength, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbxColourPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxInnerInsulation)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cbxChemResistance))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cbxOuterReinforcement)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE))
                    .addComponent(btnAddToBasket))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLength)
                            .addComponent(tfdLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiameter)
                            .addComponent(tfdDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGrade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColour)
                            .addComponent(cbxColourPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_InnerInsulation)
                    .addComponent(cbxInnerInsulation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOuterReinforcement)
                    .addComponent(cbxOuterReinforcement))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChemResistance)
                    .addComponent(cbxChemResistance))
                .addGap(19, 19, 19)
                .addComponent(btnAddToBasket)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        lblLength.getAccessibleContext().setAccessibleName("Length");
        tfdLength.getAccessibleContext().setAccessibleName("Length Text Box");
        tfdDiameter.getAccessibleContext().setAccessibleName("Diameter text box");
        lblDiameter.getAccessibleContext().setAccessibleName("Diameter");
        cbxGrade.getAccessibleContext().setAccessibleName("Plastic Grade combo box");
        lblGrade.getAccessibleContext().setAccessibleName("Plastic Grade");
        lblColour.getAccessibleContext().setAccessibleName("Colour Print");
        cbxColourPrint.getAccessibleContext().setAccessibleName("Colour print Combo box");
        lbl_InnerInsulation.getAccessibleContext().setAccessibleName("Inner insulation");
        cbxInnerInsulation.getAccessibleContext().setAccessibleName("Inner insulation check box");
        lblOuterReinforcement.getAccessibleContext().setAccessibleName("Outer Reinforcement");
        cbxOuterReinforcement.getAccessibleContext().setAccessibleName("Outer Reinforcement check box");
        cbxChemResistance.getAccessibleContext().setAccessibleName("Chemical Resistance check box");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxColourPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxColourPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxColourPrintActionPerformed

    private void cbxInnerInsulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxInnerInsulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxInnerInsulationActionPerformed

    private void cbxOuterReinforcementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOuterReinforcementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOuterReinforcementActionPerformed

    private void cbxChemResistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxChemResistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxChemResistanceActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToBasket;
    private javax.swing.JCheckBox cbxChemResistance;
    private javax.swing.JComboBox<String> cbxColourPrint;
    private javax.swing.JComboBox<String> cbxGrade;
    private javax.swing.JCheckBox cbxInnerInsulation;
    private javax.swing.JCheckBox cbxOuterReinforcement;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblChemResistance;
    private javax.swing.JLabel lblColour;
    private javax.swing.JLabel lblDiameter;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblOuterReinforcement;
    private javax.swing.JLabel lbl_InnerInsulation;
    private javax.swing.JTextField tfdDiameter;
    private javax.swing.JTextField tfdLength;
    // End of variables declaration//GEN-END:variables
}
