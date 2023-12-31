/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package study_tasks;


import arraylist_handler.ArrayListHandler;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author jdev1
 */
public class Create_Task extends javax.swing.JFrame {

    /**
     * Creates new form Create_Schedule
     */
    public Create_Task() {
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

        title_label = new javax.swing.JLabel();
        enterEndDate_label = new javax.swing.JLabel();
        enterTaskInfor_label = new javax.swing.JLabel();
        enterStartDate_label = new javax.swing.JLabel();
        enter_classInformation = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();
        back_to_task_mgmt = new javax.swing.JButton();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        startDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label.setText("Create Task");

        enterEndDate_label.setText("Enter End Date");

        enterTaskInfor_label.setText("Enter Task Information");

        enterStartDate_label.setText("Enter Start Date");

        enter_classInformation.setToolTipText("Enter Class Information");

        submit_button.setText("Submit");
        submit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit_buttonMouseClicked(evt);
            }
        });

        back_to_task_mgmt.setText("Back to Task Management");
        back_to_task_mgmt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_to_task_mgmtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterTaskInfor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enter_classInformation))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterEndDate_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterStartDate_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(back_to_task_mgmt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(submit_button))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title_label)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterTaskInfor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter_classInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterStartDate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterEndDate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_to_task_mgmt)
                    .addComponent(submit_button)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_to_task_mgmtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_to_task_mgmtMouseClicked
        // TODO add your handling code here:
        Task_Management schedule_management = new Task_Management();
        this.setVisible(false);
        schedule_management.setVisible(true);
    }//GEN-LAST:event_back_to_task_mgmtMouseClicked

    private void submit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_buttonMouseClicked
        // Add the text fromt he text boxes to the arraylists handled in ArrayListHandler
        
        //start date
        Date startDate = startDateChooser.getDate();
        SimpleDateFormat start_dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String startText = start_dateFormat.format( startDate);
        
        
        
        // end date 
        Date endDate = endDateChooser.getDate();
        SimpleDateFormat end_dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String endText = end_dateFormat.format(endDate);
        
        
        String classinformation = enter_classInformation.getText();
        String startdate = startText;
        String enddate = endText;
        
        
   
        ArrayListHandler.addTask(classinformation, startdate, enddate);
         JDialog dialog = new JDialog(this, "Task entered");
                dialog.add(new JLabel("Your task has been entered into your task management."));
                dialog.setSize(250, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
        // Informs the user that they have entered a duplicate class
        if(ArrayListHandler.getTaskMatched()== true){
            JDialog dialog1 = new JDialog(this, "Class Duplicated");
                dialog1.add(new JLabel("Your have entered a duplicated class."));
                dialog1.setSize(250, 100);
                dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog1.setVisible(true);
                dialog1.setResizable(false);
        }
        
         // clear the text box when press submit
         
        enter_classInformation.setText("");
        /*
         enter_classStartDate.setText("");
        enter_classEndDate.setText("");
        */
        
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
            java.util.logging.Logger.getLogger(Create_Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Task().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_task_mgmt;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel enterEndDate_label;
    private javax.swing.JLabel enterStartDate_label;
    private javax.swing.JLabel enterTaskInfor_label;
    private javax.swing.JTextField enter_classInformation;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JButton submit_button;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
