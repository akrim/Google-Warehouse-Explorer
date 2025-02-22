/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CommandPanel.java
 *
 * Created on Feb 21, 2011, 8:46:24 PM
 */

package org.jdesktop.wonderland.modules.ezscript.client;

import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.io.PrintStream;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

/**
 *
 * @author JagWire
 */
public class CommandPanel extends javax.swing.JPanel {

    /** Creates new form CommandPanel */
    private TextAreaOutputStream redirectedOutput;
    private PrintStream originalOut;
    public CommandPanel() {
        initComponents();
        jTextArea1.getInputMap().put(KeyStroke.getKeyStroke(">"), "none");
        jTextArea1.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "pressed");
        jTextArea1.getInputMap().put(KeyStroke.getKeyStroke("UP"), "none");
        jTextArea1.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "none");
        jTextArea1.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "backPressed");
        jTextArea1.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT,0), "leftPressed");


        jTextArea1.getActionMap().put("pressed", new EnterAction());
        jTextArea1.getActionMap().put("backPressed", new BackspaceAction());
        jTextArea1.getActionMap().put("leftPressed", new LeftKeyAction());
        
        String s = jTextArea1.getText();
        s += " ";
        jTextArea1.setText(s);
        redirectedOutput = new TextAreaOutputStream(jTextArea1);
        //System.setOut(new PrintStream(redirectedOutput, true));
        jTextArea1.addFocusListener(new CustomFocusListener());
    }

    public void evaluate(String string) {
        // before we evaluate the string for scripts, let's do some of our
        // own command line processing first
        if(string.equals("clear")) {
            jTextArea1.setText("> ");
        }

        //after processing our own commands, let's evaluate the script...

       ScriptManager.getInstance().evaluate(string);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(">");
        jScrollPane1.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    class EnterAction extends AbstractAction {

        public void actionPerformed(ActionEvent ae) {
            String s = jTextArea1.getText();
            int index = s.lastIndexOf("> ");
            int length = s.length();
            String subS = s.substring(index+2, length);
            System.setOut(new PrintStream(redirectedOutput, true));
            evaluate(subS);
        
            for(MouseListener ml : jTextArea1.getMouseListeners()) {
                jTextArea1.removeMouseListener(ml);
            }

            System.setOut(originalOut);
            if(!jTextArea1.getText().endsWith("> ")) {
                jTextArea1.append("\n> ");
            }
        }
    }

    class BackspaceAction extends AbstractAction {
        private boolean check() {
            String s = jTextArea1.getText();
            if(s.endsWith("> ")) {
                return true;
            } else {
                return false;
            }
        }
        public void actionPerformed(ActionEvent ae) {
            if(check()) {

                //do nothing
            } else {
                String s = jTextArea1.getText();
                jTextArea1.setText(s.substring(0, s.length() - 1));
            }
        }
    }

    class LeftKeyAction extends AbstractAction {

        int position;
        private boolean check() {
            String s = jTextArea1.getText();
            s = s.substring(0, position);
            if(s.endsWith("> ")) {
                return true;
            } else {
                return false;
            }
        }
        public void actionPerformed(ActionEvent ae) {
            position = jTextArea1.getCaretPosition();
            if(check()) {
                //do nothing
            } else {
                jTextArea1.setCaretPosition(position - 1);
            }
        }
    }

    class CustomFocusListener implements FocusListener {
        private PrintStream original = System.out;
        public void focusGained(FocusEvent fe) {

            //System.setOut(new PrintStream(redirectedOutput, true));
        }

        public void focusLost(FocusEvent fe) {
            //System.setOut(original);

        }
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
