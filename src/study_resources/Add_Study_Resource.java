/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package study_resources;

import arraylist_handler.ArrayListHandler;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author jdev1
 */
public class Add_Study_Resource extends javax.swing.JFrame {

    /**
     * Creates new form Add_Study_Resource
     */
    public Add_Study_Resource() {
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

        tiltle_label = new javax.swing.JLabel();
        enter_resource_name_label = new javax.swing.JLabel();
        enter_resource_textfield = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();
        back_to_resource_management_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tiltle_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tiltle_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiltle_label.setText("Add Study Resource");

        enter_resource_name_label.setText("Enter Resource Name");

        submit_button.setText("Submit");
        submit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit_buttonMouseClicked(evt);
            }
        });

        back_to_resource_management_button.setText("Back to Resource Mangement");
        back_to_resource_management_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_to_resource_management_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tiltle_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(enter_resource_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enter_resource_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(back_to_resource_management_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit_button))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tiltle_label)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter_resource_name_label)
                    .addComponent(enter_resource_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_button)
                    .addComponent(back_to_resource_management_button)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_to_resource_management_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_to_resource_management_buttonMouseClicked
        // TODO add your handling code here:
        Resource_Management resource_management = new Resource_Management();
        this.setVisible(false);
        resource_management.setVisible(true);
    }//GEN-LAST:event_back_to_resource_management_buttonMouseClicked

    private void submit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_buttonMouseClicked
        // TODO add your handling code here:
        
           
        String resource_information = enter_resource_textfield.getText();
      
        
        ArrayListHandler.addResource(resource_information);
        
         JDialog dialog = new JDialog(this, "Resource entered");
                dialog.add(new JLabel("Your resource has been entered into your task management:" + resource_information ));
                dialog.setSize(400, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
        // Informs the user that they have entered a duplicate class
        
        if(ArrayListHandler.getResourceMatched() == true){
            JDialog dialog1 = new JDialog(this, "Resource Duplicated");
                dialog1.add(new JLabel("Your have entered a duplicated resoource."));
                dialog1.setSize(250, 100);
                dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog1.setVisible(true);
                dialog1.setResizable(false);
        }
        
             
    }//GEN-LAST:event_submit_buttonMouseClicked

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
            java.util.logging.Logger.getLogger(Add_Study_Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Study_Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Study_Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Study_Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Study_Resource().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_resource_management_button;
    private javax.swing.JLabel enter_resource_name_label;
    private javax.swing.JTextField enter_resource_textfield;
    private javax.swing.JButton submit_button;
    private javax.swing.JLabel tiltle_label;
    // End of variables declaration//GEN-END:variables
}
