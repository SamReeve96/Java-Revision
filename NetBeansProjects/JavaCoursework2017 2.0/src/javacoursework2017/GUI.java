/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework2017;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

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
        cmbxGrade = new javax.swing.JComboBox<>();
        lblGrade = new javax.swing.JLabel();
        lblColour = new javax.swing.JLabel();
        cmbxColourPrint = new javax.swing.JComboBox<>();
        lbl_InnerInsulation = new javax.swing.JLabel();
        cbxInnerInsulation = new javax.swing.JCheckBox();
        lblOuterReinforcement = new javax.swing.JLabel();
        cbxOuterReinforcement = new javax.swing.JCheckBox();
        lblChemResistance = new javax.swing.JLabel();
        cbxChemResistance = new javax.swing.JCheckBox();
        btnAddToBasket = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        lblQuantity = new javax.swing.JLabel();
        tfdQuantity = new javax.swing.JTextField();
        btnRemovePipe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pipe Ordering System");
        setMaximumSize(new java.awt.Dimension(1200, 400));
        setMinimumSize(new java.awt.Dimension(1200, 400));
        setPreferredSize(new java.awt.Dimension(1200, 400));

        lblLength.setText("Length (Meters):");

        lblDiameter.setText("Diameter (Inches):");

        cmbxGrade.setMaximumRowCount(5);
        cmbxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        lblGrade.setText("Plastic Grade:");

        lblColour.setText("Colour Print:");

        cmbxColourPrint.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        cmbxColourPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxColourPrintActionPerformed(evt);
            }
        });

        lbl_InnerInsulation.setText("Inner insulation:");

        cbxInnerInsulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxInnerInsulationActionPerformed(evt);
            }
        });

        lblOuterReinforcement.setText("Outer reinforcement:");

        cbxOuterReinforcement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOuterReinforcementActionPerformed(evt);
            }
        });

        lblChemResistance.setText("Chemical resistance");

        cbxChemResistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxChemResistanceActionPerformed(evt);
            }
        });

        btnAddToBasket.setText("Add Pipe to Basket");
        btnAddToBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToBasketActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plastic Grade", "Colour Print", "Inner Insulation", "Outer Reinforcement", "Chem Resist", "Length", "Diameter", "Quantity", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(7).setResizable(false);
        }

        lblQuantity.setText("Quantity");

        tfdQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdQuantityActionPerformed(evt);
            }
        });

        btnRemovePipe.setText("Remove Pipe");
        btnRemovePipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDiameter, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLength, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdLength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(tfdDiameter))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddToBasket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOuterReinforcement)
                                    .addComponent(lblGrade)
                                    .addComponent(lblColour)
                                    .addComponent(lbl_InnerInsulation)
                                    .addComponent(lblChemResistance)
                                    .addComponent(lblQuantity))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbxGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbxColourPrint, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxInnerInsulation, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbxChemResistance, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbxOuterReinforcement, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfdQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnRemovePipe)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLength)
                    .addComponent(tfdLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiameter)
                    .addComponent(tfdDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(tfdQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColour)
                    .addComponent(cmbxColourPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddToBasket)
                    .addComponent(btnClear)
                    .addComponent(btnRemovePipe))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblLength.getAccessibleContext().setAccessibleName("Length");
        tfdLength.getAccessibleContext().setAccessibleName("Length Text Box");
        tfdDiameter.getAccessibleContext().setAccessibleName("Diameter text box");
        lblDiameter.getAccessibleContext().setAccessibleName("Diameter");
        cmbxGrade.getAccessibleContext().setAccessibleName("Plastic Grade combo box");
        lblGrade.getAccessibleContext().setAccessibleName("Plastic Grade");
        lblColour.getAccessibleContext().setAccessibleName("Colour Print");
        cmbxColourPrint.getAccessibleContext().setAccessibleName("Colour print Combo box");
        lbl_InnerInsulation.getAccessibleContext().setAccessibleName("Inner insulation");
        cbxInnerInsulation.getAccessibleContext().setAccessibleName("Inner insulation check box");
        lblOuterReinforcement.getAccessibleContext().setAccessibleName("Outer Reinforcement");
        cbxOuterReinforcement.getAccessibleContext().setAccessibleName("Outer Reinforcement check box");
        cbxChemResistance.getAccessibleContext().setAccessibleName("Chemical Resistance check box");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxColourPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxColourPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxColourPrintActionPerformed

    private void cbxInnerInsulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxInnerInsulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxInnerInsulationActionPerformed

    private void cbxOuterReinforcementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOuterReinforcementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOuterReinforcementActionPerformed

    private void cbxChemResistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxChemResistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxChemResistanceActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddToBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToBasketActionPerformed
        double Length = Double.parseDouble(tfdLength.getText());
        double Diameter = Double.parseDouble(tfdDiameter.getText());
        int quantOfPipe = Integer.parseInt(tfdQuantity.getText());
        int colourPrint = cmbxColourPrint.getSelectedIndex();
        int PlasticGrade = cmbxGrade.getSelectedIndex() + 1;
        boolean InnerIn = false;
        boolean OuterR = false;
        boolean chemResist = false;
        
        if (cbxInnerInsulation.isSelected() == true) {
            InnerIn = true;
        } 
        if (cbxOuterReinforcement.isSelected() == true) {
            OuterR = true;
        }
        if (cbxChemResistance.isSelected() == true) {
            chemResist = true;
        }
        PipeType(PlasticGrade, colourPrint, quantOfPipe, InnerIn, OuterR, chemResist, Length, Diameter);
        addBasketToTable();
        totalCostOfOrder();
        clearForm();
    }//GEN-LAST:event_btnAddToBasketActionPerformed

    private void tfdQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdQuantityActionPerformed

    private void btnRemovePipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePipeActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        int[] rows = tblOrder.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            model.removeRow(rows[i]-i);
            //Needs to account for row 0 (Confirm)
            
            //remove item from basket too!
            basket.remove(i);
        }
        totalCostOfOrder();
    }//GEN-LAST:event_btnRemovePipeActionPerformed

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
    
    //GUI Methods

    public void clearForm(){
        tfdLength.setText("");
        tfdDiameter.setText("");
        tfdQuantity.setText("");
        cmbxColourPrint.setSelectedIndex(0);
        cmbxGrade.setSelectedIndex(0);
        cbxInnerInsulation.setSelected(false);
        cbxOuterReinforcement.setSelected(false);
        cbxChemResistance.setSelected(false);
    }
    
    public void addBasketToTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[9];
        for(int i = 0; i < basket.size(); i++){
            rowData[0] = basket.get(i).getPlasticGrade();
            rowData[1] = basket.get(i).getColourPrint();
            rowData[2] = basket.get(i).getInnerInsulation();
            rowData[3] = basket.get(i).getOuterReinforcement();
            rowData[4] = basket.get(i).getChemicalResistance();
            rowData[5] = basket.get(i).getLength();
            rowData[6] = basket.get(i).getDiameter();
            rowData[7] = basket.get(i).getQuantityOfPipes();
            rowData[8] = basket.get(i).getPipeCost();
            model.addRow(rowData);
        }
    }
    
    //General Methods
    
    public static ArrayList<Pipe> basket = new ArrayList<>();
    
    public static void totalCostOfOrder(){
        double orderTotal = 0;
        for (Pipe p : basket) {
            orderTotal += p.getPipeCost();
            }
        System.out.println("Total Cost is: " + orderTotal );
    }
    
    public static void PipeType(int pGrade, int colourPrint, int quantOfPipe, boolean innerInsul, boolean outerRein, boolean chemResist, double Length, double Diameter) {
        
        if (pGrade <= 3 && colourPrint == 0 && innerInsul == false && outerRein == false){
            //Its pipe one!
            PipeTypeOne pipeOrderType1 = new PipeTypeOne(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe one created");
            pipeOrderType1.calcFullCost();
            basket.add(pipeOrderType1);
        }
        else if (2 <= pGrade && pGrade <= 4 && colourPrint == 1 && innerInsul == false && outerRein == false) {
            //its pipe two!
            PipeTypeTwo pipeOrderType2 = new PipeTypeTwo(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe two created");
            pipeOrderType2.calcFullCost();
            basket.add(pipeOrderType2);
        }
        else if (2 <= pGrade && pGrade <= 5 && colourPrint == 2 && innerInsul == false && outerRein == false) {
            //its pipe three!
            PipeTypeThree pipeOrderType3 = new PipeTypeThree(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe three created");
            pipeOrderType3.calcFullCost();
            basket.add(pipeOrderType3);
        }
        else if (2 <= pGrade && pGrade <= 5 && colourPrint == 2 && innerInsul == true && outerRein == false) {
            //its pipe four!
            PipeTypeFour pipeOrderType4 = new PipeTypeFour(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe four created");
            pipeOrderType4.calcFullCost();
            basket.add(pipeOrderType4);
        }
        else if (3 <= pGrade && pGrade <= 5 && colourPrint == 2 && innerInsul == true && outerRein == true) {
            //its pipe five!
            PipeTypeFive pipeOrderType5 = new PipeTypeFive(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe five created");
            pipeOrderType5.calcFullCost();
            basket.add(pipeOrderType5);
        }
        else{
            //Not valid
            System.out.println("Pipe details invalid, please refer to the table for valid pipe attributes");
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToBasket;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemovePipe;
    private javax.swing.JCheckBox cbxChemResistance;
    private javax.swing.JCheckBox cbxInnerInsulation;
    private javax.swing.JCheckBox cbxOuterReinforcement;
    private javax.swing.JComboBox<String> cmbxColourPrint;
    private javax.swing.JComboBox<String> cmbxGrade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChemResistance;
    private javax.swing.JLabel lblColour;
    private javax.swing.JLabel lblDiameter;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblOuterReinforcement;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lbl_InnerInsulation;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField tfdDiameter;
    private javax.swing.JTextField tfdLength;
    private javax.swing.JTextField tfdQuantity;
    // End of variables declaration//GEN-END:variables
}
