/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.ui;

import lk.edu.ijse.thogakadefinal.entity.Customer;
import lk.edu.ijse.thogakadefinal.entity.Item;
import lk.edu.ijse.thogakadefinal.entity.OrderDetail;
import lk.edu.ijse.thogakadefinal.entity.OrderDetail_PK;
import lk.edu.ijse.thogakadefinal.entity.Orders;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.edu.ijse.thogakadefinal.controlleer.CustomerController;
import lk.edu.ijse.thogakadefinal.controlleer.InvoiceController;
import lk.edu.ijse.thogakadefinal.controlleer.ItemController;
import lk.edu.ijse.thogakadefinal.controller.impl.CustomerControllerImpl;
import lk.edu.ijse.thogakadefinal.controller.impl.InvoiceControllerImpl;
import lk.edu.ijse.thogakadefinal.controller.impl.ItemControllerImpl;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.dto.ItemDTO;
import lk.edu.ijse.thogakadefinal.dto.OrderDetailDTO;
import lk.edu.ijse.thogakadefinal.dto.OrdersDTO;


import lk.edu.ijse.thogakadefinal.service.OrderService;
import lk.edu.ijse.thogakadefinal.service.OrderdetailService;

/**
 *
 * @author Lenovo™
 */
public class Invoice extends javax.swing.JFrame {
    double grandTotal=0.00;
    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        setOrderDate();
        loadCustomerNames();
        loadItemNames();
    }
    CustomerController cs=(CustomerController)new CustomerControllerImpl();
    ItemController itemC=(ItemController)new ItemControllerImpl();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOrderDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbCustomerNames = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCustId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cmbItemNames = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtItemcode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtQtyOnHand = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtOrderQty = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtNetTotal = new javax.swing.JTextField();
        btnAddCusForm = new javax.swing.JButton();
        btnAddItemForm = new javax.swing.JButton();
        txtCash = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCancelOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Place Order");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("New Order");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setText("Date");

        txtOrderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderDateActionPerformed(evt);
            }
        });

        jLabel4.setText("Customer");

        cmbCustomerNames.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerNamesItemStateChanged(evt);
            }
        });

        jLabel5.setText("Customer Id");

        txtCustId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustIdActionPerformed(evt);
            }
        });

        jLabel6.setText("Contact");

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        jLabel7.setText("Items");

        cmbItemNames.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemNamesItemStateChanged(evt);
            }
        });

        jLabel8.setText("Item Code");

        txtItemcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemcodeActionPerformed(evt);
            }
        });

        jLabel9.setText("QtyOnHand");

        jLabel10.setText("Unit Price");

        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });

        jLabel11.setText("Order Oty");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");

        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Description", "Order Qty", "Unit Price", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tblOrderDetail);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel12.setText("Net Total");

        txtNetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetTotalActionPerformed(evt);
            }
        });

        btnAddCusForm.setText("Add New");
        btnAddCusForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCusFormActionPerformed(evt);
            }
        });

        btnAddItemForm.setText("Add New");
        btnAddItemForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddItemFormMouseClicked(evt);
            }
        });
        btnAddItemForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemFormActionPerformed(evt);
            }
        });

        txtCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashActionPerformed(evt);
            }
        });

        jLabel13.setText("Cash");

        jLabel14.setText("Balance");

        btnCancelOrder.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCustomerNames, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddCusForm))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbItemNames, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrderQty, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtItemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnAdd)
                                .addGap(25, 25, 25)
                                .addComponent(btncancel)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddItemForm))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtyOnHand, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtCash))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelOrder))
                            .addComponent(txtNetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCustomerNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCusForm))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbItemNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtyOnHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrderQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd)
                        .addComponent(btncancel)
                        .addComponent(btnAddItemForm)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancelOrder))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderDateActionPerformed

    private void txtCustIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustIdActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtItemcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemcodeActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void cmbCustomerNamesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerNamesItemStateChanged
        try {
            String cName=(String) cmbCustomerNames.getSelectedItem();
            
            CustomerDTO c1=cs.getCustomerByName(cName);
            txtCustId.setText(Integer.toString(c1.getcId()));
            txtContact.setText(c1.getContact());
        } catch (Exception ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }//GEN-LAST:event_cmbCustomerNamesItemStateChanged

    private void cmbItemNamesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemNamesItemStateChanged

        
        try {
            String itemName=(String) cmbItemNames.getSelectedItem();
            
            ItemDTO item=itemC.getItemByName(itemName);
            txtItemcode.setText(Integer.toString(item.getiId()));
            txtQtyOnHand.setText(Integer.toString(item.getQtyOnHand()));
            txtUnitPrice.setText(Double.toString(item.getUnitPrice()));
            txtOrderQty.requestFocus();
        } catch (Exception ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbItemNamesItemStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String code=txtItemcode.getText();
        String description=(String) cmbItemNames.getSelectedItem();
        int qty=Integer.parseInt(txtOrderQty.getText());
        double unitPrice=Double.parseDouble(txtUnitPrice.getText());
        double amount=unitPrice*qty;
        
        grandTotal+=amount;
        txtNetTotal.setText(Double.toString(grandTotal));
        Object[] rowData={code,description,qty,unitPrice,amount};
        DefaultTableModel dtm=(DefaultTableModel) tblOrderDetail.getModel();
        dtm.addRow(rowData);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
            

        
        try {
            InvoiceController ic=(InvoiceController)new InvoiceControllerImpl();
            
            String custName=(String) cmbCustomerNames.getSelectedItem();
            CustomerDTO custDTO=cs.getCustomerByName(custName);
            
            OrdersDTO order=new OrdersDTO();
            order.setOrderDate(txtOrderDate.getText());
            
            DefaultTableModel dtm=(DefaultTableModel) tblOrderDetail.getModel();
            int orderDeCount=0;
            
            ArrayList<ItemDTO> itemDTOList=new ArrayList<>();
            ArrayList<OrderDetailDTO> odDTOList=new ArrayList<>();
            
            for(int i=0;i<dtm.getRowCount();i++){
                try {
                    String itemName=(String) dtm.getValueAt(i, 1);
                    ItemDTO itemDTO=itemC.getItemByName(itemName);
                    int orderQty=(int) dtm.getValueAt(i, 2);
                    double unitPrice=(double) dtm.getValueAt(i, 3);
                    
                    OrderDetailDTO od=new OrderDetailDTO();
                    od.setOrderQuantity(orderQty);
                    od.setUnitPrice(unitPrice);
                    
                    itemDTOList.add(itemDTO);
                    odDTOList.add(od);
                    
                    
                    
                    
                   
                } catch (Exception ex) {
                    Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            int i=0;
            int orderQty=0;
            if(ic.saveOrderDetails(custDTO, itemDTOList, order, odDTOList)){
                JOptionPane.showMessageDialog(this, " All OrderDetails has been successfully added");
                for (ItemDTO item : itemDTOList) {
                    
                    orderQty=odDTOList.get(i).getOrderQuantity();
                    boolean isQtyUpdated=itemC.updateItemQty(item,orderQty);
                    i++;
                }if(i++==itemDTOList.size()){
                    JOptionPane.showMessageDialog(this, " All Items has been successfully updated");
                    loadItemNames();
                }else{
                    JOptionPane.showMessageDialog(this, " All items hasn't been successfully updated");
                }
            }else{
                JOptionPane.showMessageDialog(this, " All OrderDetails hasn't been successfully added");
                
            }
            
            
            /*InvoiceController ic=(InvoiceController)new InvoiceControllerImpl();
            
            String custName=(String) cmbCustomerNames.getSelectedItem();
            
            
            OrdersDTO order=new OrdersDTO();
            order.setOrderDate(txtOrderDate.getText());
            
            DefaultTableModel dtm=(DefaultTableModel) tblOrderDetail.getModel();
            int orderDeCount=0;
            
            for(int i=0;i<dtm.getRowCount();i++){
            try {
            String itemName=(String) dtm.getValueAt(i, 1);
            
            int orderQty=(int) dtm.getValueAt(i, 2);
            double unitPrice=(double) dtm.getValueAt(i, 3);
            OrderDetailDTO od=new OrderDetailDTO();
            od.setOrderQuantity(orderQty);
            od.setUnitPrice(unitPrice);
            
            if(ic.saveOrderDetails(custName, itemName, order, od)){
            orderDeCount+=1;
            }
            } catch (Exception ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            if(orderDeCount==dtm.getRowCount()){
            JOptionPane.showMessageDialog(this, " All OrderDetails has been successfully added");
            }else{
            JOptionPane.showMessageDialog(this, " All OrderDetails hasn't been successfully added");
            
            }*/
            
            /*Customer customer=CustomerService.getCustomerByName((String) cmbCustomerNames.getSelectedItem());
            Orders order=new Orders();
            order.setOrderDate(txtOrderDate.getText());
            order.setCustomer(customer);
            boolean isAdded=OrderService.addOrders(order);
            if(isAdded){
            System.err.println("Order is added");
            }
            DefaultTableModel dtm=(DefaultTableModel) tblOrderDetail.getModel();
            int orderDeCount=0;
            
            for(int i=0;i<dtm.getRowCount();i++){
            String itemName=(String) dtm.getValueAt(i, 1);
            Item item=ItemService.getItemByName(itemName);
            int orderQty=(int) dtm.getValueAt(i, 2);
            double unitPrice=(double) dtm.getValueAt(i, 3);
            OrderDetail od=new OrderDetail();
            od.setItem(item);
            od.setOrders(order);
            od.setOrderQuantity(orderQty);
            od.setUnitPrice(unitPrice);
            od.setOrderDetail_PK(new OrderDetail_PK(order.getoId(), item.getiId()));
            if(OrderdetailService.addOrderDetail(od)){
            orderDeCount+=1;
            }
            }
            if(orderDeCount==dtm.getRowCount()){
            JOptionPane.showMessageDialog(this, " All OrderDetails has been successfully added");
            }else{
            JOptionPane.showMessageDialog(this, " All OrderDetails hasn't been successfully added");
            }*/
        } catch (Exception ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       DefaultTableModel dtm=(DefaultTableModel) tblOrderDetail.getModel();
       dtm.setRowCount(0);
       grandTotal=0.00;
       txtNetTotal.setText("");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnAddCusFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCusFormActionPerformed
       AddCustomer adCus=new AddCustomer();
       adCus.setLocationRelativeTo(this);
       adCus.setVisible(true);
    }//GEN-LAST:event_btnAddCusFormActionPerformed

    private void btnAddItemFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemFormActionPerformed
        AddItem adItem=new AddItem();
        adItem.setLocationRelativeTo(this);
        adItem.setVisible(true);
        System.out.println("lkmmkmkl");
    }//GEN-LAST:event_btnAddItemFormActionPerformed

    private void btnAddItemFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddItemFormMouseClicked
        AddItem adItem=new AddItem();
        adItem.setLocationRelativeTo(this);
        adItem.setVisible(true);
        System.out.println("lkmmkmkl");
    }//GEN-LAST:event_btnAddItemFormMouseClicked

    private void txtNetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetTotalActionPerformed
        txtCash.requestFocus();
    }//GEN-LAST:event_txtNetTotalActionPerformed

    private void txtCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashActionPerformed
        double balance=0.00;
        balance=Double.parseDouble(txtCash.getText())-Double.parseDouble(txtNetTotal.getText());
        txtBalance.setText(Double.toString(balance));
    }//GEN-LAST:event_txtCashActionPerformed

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCusForm;
    private javax.swing.JButton btnAddItemForm;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btncancel;
    private javax.swing.JComboBox<String> cmbCustomerNames;
    private javax.swing.JComboBox<String> cmbItemNames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblOrderDetail;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtItemcode;
    private javax.swing.JTextField txtNetTotal;
    private javax.swing.JTextField txtOrderDate;
    private javax.swing.JTextField txtOrderQty;
    private javax.swing.JTextField txtQtyOnHand;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void setOrderDate() {
        Date d1=new Date(); //request current data
        SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
        String fDate=df.format(d1);
        txtOrderDate.setText(fDate);
    }

    private void loadCustomerNames() {
        try {
            ArrayList<CustomerDTO> allCustomerNames=cs.getAllCustomers();
            if(allCustomerNames!=null){
                for(CustomerDTO customer:allCustomerNames){
                    cmbCustomerNames.addItem(customer.getcName());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadItemNames() {
        try {
            ArrayList<ItemDTO> allItemNames=itemC.getAllItems();
            if(allItemNames!=null){
                for(ItemDTO item:allItemNames){
                    cmbItemNames.addItem(item.getDescription());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
