/**
 * Project Wonderland
 *
 * Copyright (c) 2004-2009, Sun Microsystems, Inc., All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * Sun designates this particular file as subject to the "Classpath" 
 * exception as provided by Sun in the License file that accompanied 
 * this code.
 */
package org.jdesktop.wonderland.modules.swingtest.client;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * A standalone program for the TestPanel (outside of Wonderland).
 */

public class TestTestPanel extends JFrame {

    public static void main(String[] args) {
        TestTestPanel testTestPanel = new TestTestPanel();
    }
    
    public TestTestPanel () {
        Frame frame = new Frame();
        // center the frame
        frame.setLocationRelativeTo(null);
        // show frame
        frame.setVisible(true);
    }

    class Frame extends JFrame {

        JPanel contentPane;
	TestPanel testPanel = new TestPanel();
	
        // Construct the frame
        public Frame () {
	    testPanel.setFrame(this);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    dispose();
                    System.exit(0);
                }
            });

            contentPane = (JPanel) this.getContentPane();
            contentPane.setLayout(new BorderLayout());
            setTitle("TestTestPanel");

            contentPane.add(testPanel, BorderLayout.NORTH);

            pack();
        }
    }
}
