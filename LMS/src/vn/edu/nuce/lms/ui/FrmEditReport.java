/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmEditReport.java
 *
 * Created on Dec 16, 2011, 10:10:22 PM
 */

package vn.edu.nuce.lms.ui;

/**
 *
 * @author Administrator
 */
public class FrmEditReport extends javax.swing.JFrame {

    /** Creates new form FrmEditReport */
    public FrmEditReport() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextAreaReason = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDateChooserTo = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jDateChooserFrom = new com.toedter.calendar.JDateChooser();
        jTextFieldNumberDay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextAreaAddress = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        jComboBoxLeave = new javax.swing.JComboBox();
        btnReset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaReason.setName("jTextAreaReason"); // NOI18N
        jTextAreaReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAreaReasonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Loại nghỉ phép:");
        jLabel3.setName("jLabel3"); // NOI18N

        jDateChooserTo.setName("jDateChooserTo"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Sửa đơn xin nghỉ");
        jLabel2.setName("jLabel2"); // NOI18N

        jDateChooserFrom.setName("jDateChooserFrom"); // NOI18N

        jTextFieldNumberDay.setName("jTextFieldNumberDay"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Địa chỉ:");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Số ngày nghỉ:");
        jLabel4.setName("jLabel4"); // NOI18N

        jTextAreaAddress.setName("jTextAreaAddress"); // NOI18N

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 255));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/edu/nuce/lms/image/delete.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.setName("btnClose"); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jComboBoxLeave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nghỉ ốm", "Nghỉ đẻ", "Nghỉ cưới", "Nghỉ phép" }));
        jComboBoxLeave.setName("jComboBoxLeave"); // NOI18N

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/edu/nuce/lms/image/refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setName("btnReset"); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Lý do:");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Đến ngày:");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Nghỉ từ ngày:");
        jLabel5.setName("jLabel5"); // NOI18N

        jButton1.setText("Edit");
        jButton1.setName("jButton1"); // NOI18N

        jButton2.setText("Edit");
        jButton2.setName("jButton2"); // NOI18N

        jButton3.setText("Edit");
        jButton3.setName("jButton3"); // NOI18N

        jButton4.setText("Edit");
        jButton4.setName("jButton4"); // NOI18N

        jButton5.setText("Edit");
        jButton5.setName("jButton5"); // NOI18N

        jButton6.setText("Edit");
        jButton6.setName("jButton6"); // NOI18N

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon("D:\\DA cnpm\\LMS\\leave-management-system-java\\LMS\\src\\vn\\edu\\nuce\\lms\\image\\ok.png")); // NOI18N
        btnAdd.setText("OK");
        btnAdd.setToolTipText("");
        btnAdd.setName("btnAdd"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxLeave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextAreaReason, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(jTextAreaAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(jTextFieldNumberDay, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(165, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLeave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumberDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextAreaReason, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextAreaAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClose)
                            .addComponent(btnReset)
                            .addComponent(btnAdd)))
                    .addComponent(jButton6))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(jLabel3)
                    .addGap(22, 22, 22)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel6)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7)
                    .addGap(58, 58, 58)
                    .addComponent(jLabel8)
                    .addContainerGap(122, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAreaReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAreaReasonActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextAreaReasonActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        jComboBoxLeave.setSelectedIndex(0);
        jTextFieldNumberDay.setText("");
        jDateChooserFrom.setDate(null);
        jDateChooserTo.setDate(null);
        jTextAreaReason.setText("");
        jTextAreaAddress.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBoxLeave;
    private com.toedter.calendar.JDateChooser jDateChooserFrom;
    private com.toedter.calendar.JDateChooser jDateChooserTo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextAreaAddress;
    private javax.swing.JTextField jTextAreaReason;
    private javax.swing.JTextField jTextFieldNumberDay;
    // End of variables declaration//GEN-END:variables

}