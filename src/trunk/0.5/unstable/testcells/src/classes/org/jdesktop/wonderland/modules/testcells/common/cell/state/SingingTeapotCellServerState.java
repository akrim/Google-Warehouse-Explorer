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
package org.jdesktop.wonderland.modules.testcells.common.cell.state;

import javax.xml.bind.annotation.XmlRootElement;
import org.jdesktop.wonderland.common.cell.state.annotation.ServerState;

/**
 *
 * @author jordanslott
 */
@XmlRootElement(name="singing-teapot-cell")
@ServerState
public class SingingTeapotCellServerState extends SimpleShapeCellServerState {

    /** Default constructor */
    public SingingTeapotCellServerState() {
    }
    
    @Override
    public String getServerClassName() {
        return "org.jdesktop.wonderland.modules.testcells.server.cell.SingingTeapotCellMO";
    }
}
