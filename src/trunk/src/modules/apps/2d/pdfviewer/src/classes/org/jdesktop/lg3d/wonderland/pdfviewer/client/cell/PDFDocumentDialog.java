/*
 * VNCConnectionDialog.java
 *
 * Created on January 28, 2008, 11:47 AM
 */
package org.jdesktop.lg3d.wonderland.pdfviewer.client.cell;

import java.awt.event.ActionListener;

/**
 *
 * @author  nsimpson
 */
public class PDFDocumentDialog extends javax.swing.JDialog {

    /** Creates new form VNCConnectionDialog */
    public PDFDocumentDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void setDocumentURL(String docURL) {
        documentTextField.setText(docURL);
    }

    public String getDocumentURL() {
        return documentTextField.getText();
    }

    public void addActionListener(ActionListener listener) {
        okButton.addActionListener(listener);
        cancelButton.addActionListener(listener);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descriptionLabel = new javax.swing.JLabel();
        documentLabel = new javax.swing.JLabel();
        documentTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Open Document");

        descriptionLabel.setFont(new java.awt.Font("Dialog", 1, 12));
        descriptionLabel.setText("Enter the URL of the PDF Document:");

        documentLabel.setFont(new java.awt.Font("Dialog", 1, 12));
        documentLabel.setText("Document URL:");

        documentTextField.setFont(new java.awt.Font("DialogInput", 0, 12));
        documentTextField.setText("http://");
        documentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentTextFieldActionPerformed(evt);
            }
        });

        okButton.setFont(new java.awt.Font("Dialog", 1, 12));
        okButton.setText("OK");

        cancelButton.setFont(new java.awt.Font("Dialog", 1, 12));
        cancelButton.setText("Cancel");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(documentLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(documentTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                            .add(descriptionLabel)))
                    .add(layout.createSequentialGroup()
                        .add(122, 122, 122)
                        .add(okButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cancelButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(descriptionLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(documentLabel)
                    .add(documentTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelButton)
                    .add(okButton))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void documentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentTextFieldActionPerformed
        okButton.doClick();
}//GEN-LAST:event_documentTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                PDFDocumentDialog dialog = new PDFDocumentDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel documentLabel;
    private javax.swing.JTextField documentTextField;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
