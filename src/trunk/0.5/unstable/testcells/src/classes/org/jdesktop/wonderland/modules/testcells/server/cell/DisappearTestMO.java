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
package org.jdesktop.wonderland.modules.testcells.server.cell;

import org.jdesktop.wonderland.server.cell.*;
import com.jme.bounding.BoundingBox;
import com.jme.math.Vector3f;
import org.jdesktop.wonderland.server.comms.WonderlandClientID;
import org.jdesktop.wonderland.common.cell.state.CellServerState;
import org.jdesktop.wonderland.common.ExperimentalAPI;
import org.jdesktop.wonderland.common.cell.CellTransform;
import org.jdesktop.wonderland.common.cell.ClientCapabilities;
import org.jdesktop.wonderland.common.cell.state.CellClientState;


/**
 * Simple test for cell dragging.
 *
 * @author paulby
 * @deprecated
 */
@ExperimentalAPI
public class DisappearTestMO extends SimpleShapeCellMO {
    
    /** Default constructor, used when cell is created via WFS */
    public DisappearTestMO () {
        this(new Vector3f(), 50);
    }

    public DisappearTestMO (Vector3f center, float size) {
        super(center, size);
        //addComponent(new ChannelComponentImplMO(this), ChannelComponentMO.class);
        addComponent(new MovableComponentMO(this));
    }
    
    @Override 
    protected String getClientCellClassName(WonderlandClientID clientID, ClientCapabilities capabilities) {
        return "org.jdesktop.wonderland.modules.testcells.client.cell.DisappearTest";
    }

    @Override
    public void setServerState(CellServerState serverState) {
        super.setServerState(serverState);
    }
}
