package org.jdesktop.wonderland.modules.path.common.message;

import java.io.Serializable;
import org.jdesktop.wonderland.common.cell.CellID;
import org.jdesktop.wonderland.common.cell.messages.CellMessage;

/**
 * This is a message used to notify that all PathNode have been removed from a NodePath.
 *
 * @author Carl Jokl
 */
public class AllPathNodesRemovedMessage extends CellMessage implements Serializable {

    /**
     * The version number for serialization.
     */
    private static final long serialVersionUID = 1L;

    /**
     * This is a message to notify of all PathNodes having been removed from a NodePath.
     *
     * @param cellID The id of the cell which is the source of the change.
     */
    public AllPathNodesRemovedMessage(CellID cellID) {
        super(cellID);
    }
}
