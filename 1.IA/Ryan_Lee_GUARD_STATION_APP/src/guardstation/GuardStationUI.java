/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardstation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import guardstation.StudentTableModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chrl98
 */
public class GuardStationUI extends javax.swing.JFrame { //in charge of notifying the Table Model that something has changed.

    /**
     * Creates new form entryExitForm
     */
    public GuardStationUI() {
        initComponents();
        resultTable.setModel(new StudentTableModel());

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        searchButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        exportLogButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        exitFreeButton = new javax.swing.JButton();
        exitLunchButton = new javax.swing.JButton();
        entryLunchButton = new javax.swing.JButton();
        showLogButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entryFreeButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        searchButton5.setText("Entry (Free)");
        searchButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Time In", "Time out", "Purpose"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setResizable(false);
            resultTable.getColumnModel().getColumn(1).setResizable(false);
            resultTable.getColumnModel().getColumn(2).setResizable(false);
            resultTable.getColumnModel().getColumn(3).setResizable(false);
            resultTable.getColumnModel().getColumn(4).setResizable(false);
        }

        exportLogButton.setText("Export Log");
        exportLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportLogButtonActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        exitFreeButton.setText("EXIT (Free)");
        exitFreeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitFreeButtonMousePressed(evt);
            }
        });
        exitFreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFreeButtonActionPerformed(evt);
            }
        });

        exitLunchButton.setText("EXIT (Lunch)");
        exitLunchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitLunchButtonActionPerformed(evt);
            }
        });

        entryLunchButton.setText("RETURN (Lunch)");
        entryLunchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryLunchButtonActionPerformed(evt);
            }
        });

        showLogButton.setText("Show Log");
        showLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLogButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("ID:");

        entryFreeButton.setText("RETURN (Free)");
        entryFreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryFreeButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitLunchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitFreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(entryFreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(showLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(entryLunchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exportLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryFreeButton)
                    .addComponent(exitFreeButton)
                    .addComponent(showLogButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitLunchButton)
                    .addComponent(entryLunchButton)
                    .addComponent(exportLogButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportLogButtonActionPerformed
        Database conn = new Database();
        
        try{
            conn.exportLog();
            
        }
        
        catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_exportLogButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
      
        // need to validate ID and name
        
        String name = nameField.getText();
        String id   = idField.getText();  
        
        System.out.println("name = " + name);
        
        if(name == null)
        {
            System.out.println("name equals null");
        }
        else if (name.equals(""))
        { 
            System.out.println("name is not null");  
        }
        
        if (nameField.getText().equals("") && idField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "No name or student ID received.", "Error", JOptionPane.OK_OPTION);
        }
        else
        {
            Database conn = new Database();
            
            
            try {          
                
                // Read database.
                ArrayList<Student> data = conn.read(name, id);  // a variable that can point to an ArrayList object.
                
                // Update table model.
                StudentTableModel model = (StudentTableModel)resultTable.getModel();
                model.add(data);                
            }
            catch (Exception e) {   
                JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.OK_OPTION);
            }
        }        
            
          //  conn.close();      

    }//GEN-LAST:event_searchButtonActionPerformed

    private void exitFreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFreeButtonActionPerformed

        Database conn = new Database();
         
        int row = resultTable.getSelectedRow();

        String name = (String)(resultTable.getValueAt(row, 0));
        String id   = (String)(resultTable.getValueAt(row, 1));
        String status = "exit_free";
        System.out.println(name);
        System.out.println(id);
        
        
        try {    
            conn.writeToLog(name,id, status);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Database write failed: " + e.toString(), "Error", JOptionPane.OK_OPTION);
        }
       
        
    }//GEN-LAST:event_exitFreeButtonActionPerformed

    private void exitLunchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitLunchButtonActionPerformed
        
        Database conn = new Database();
         
        int row = resultTable.getSelectedRow();

        String name = (String)(resultTable.getValueAt(row, 0));
        String id   = (String)(resultTable.getValueAt(row, 1));
        String status = "exit_lunch";
        System.out.println(name);
        System.out.println(id);
        
        
        try {    
            conn.writeToLog(name,id, status);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Database write failed: " + e.toString(), "Error", JOptionPane.OK_OPTION);
        }
       
        
    }//GEN-LAST:event_exitLunchButtonActionPerformed

    private void searchButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton5ActionPerformed
        
    }//GEN-LAST:event_searchButton5ActionPerformed

    private void entryLunchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryLunchButtonActionPerformed
       
        Database conn = new Database();
         
        int row = resultTable.getSelectedRow();

        String name = (String)(resultTable.getValueAt(row, 0));
        String id   = (String)(resultTable.getValueAt(row, 1));
        String status = "entry_lunch";
        System.out.println(name);
        System.out.println(id);
        
        
        try {    
            conn.writeToLog(name,id, status);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Database write failed: " + e.toString(), "Error", JOptionPane.OK_OPTION);
        }
       
    }//GEN-LAST:event_entryLunchButtonActionPerformed

    private void showLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLogButtonActionPerformed
                       
        Database conn = new Database();
        
        try {    
            
            // retrieves studentlog.
            ArrayList<Student> data = conn.getLog();  // a variable that can point to an ArrayList object.

            // Update table model.
            StudentTableModel model = (StudentTableModel)resultTable.getModel();
            model.add(data);   
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
            "Database write failed: " + e.toString(), "Error", JOptionPane.OK_OPTION);
        }
        
    }//GEN-LAST:event_showLogButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
                // Check to see if user selected a row
        int row = resultTable.getSelectedRow();
        
        if (row != -1) {            // -1 means no row selected
            // Get the table model
            StudentTableModel model = (StudentTableModel)resultTable.getModel();
            // Remove the selected student from the table
            model.delete(row);
        }
    }//GEN-LAST:event_clearButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void entryFreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryFreeButtonActionPerformed
         Database conn = new Database();
         
        int row = resultTable.getSelectedRow();

        String name = (String)(resultTable.getValueAt(row, 0));
        String id   = (String)(resultTable.getValueAt(row, 1));
        String status = "entry_free";
        System.out.println(name);
        System.out.println(id);
        
        
        try {    
            conn.writeToLog(name,id, status);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Database write failed: " + e.toString(), "Error", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_entryFreeButtonActionPerformed

    private void exitFreeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitFreeButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitFreeButtonMousePressed

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
                if ("Modern".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuardStationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardStationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardStationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardStationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardStationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton entryFreeButton;
    private javax.swing.JButton entryLunchButton;
    private javax.swing.JButton exitFreeButton;
    private javax.swing.JButton exitLunchButton;
    private javax.swing.JButton exportLogButton;
    private javax.swing.JTextField idField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchButton5;
    private javax.swing.JButton showLogButton;
    // End of variables declaration//GEN-END:variables
}
