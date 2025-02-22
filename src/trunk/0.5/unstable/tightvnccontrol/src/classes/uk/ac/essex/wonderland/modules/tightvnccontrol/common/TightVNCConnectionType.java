/**
 * Open Wonderland
 *
 * Copyright (c) 2011, Open Wonderland Foundation, All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * The Open Wonderland Foundation designates this particular file as
 * subject to the "Classpath" exception as provided by the Open Wonderland
 * Foundation in the License file that accompanied this code.
 */
package uk.ac.essex.wonderland.modules.tightvnccontrol.common;

import org.jdesktop.wonderland.common.comms.ConnectionType;

/**
 * This class defines the ConnectionType used to send messages between the
 * TightVNCConnection and the TightVNCConnectionHandler. Use
 * TightVNCConnectionType.TYPE for a constant version of this type.
 *
 * @author Bernard Horan
 */
public class TightVNCConnectionType extends ConnectionType {
    /** A unique name for this connection type */
    private static final String NAME = "__TightVNCConnection";

    /** The type constant for this connection type */
    public static final TightVNCConnectionType TYPE =
            new TightVNCConnectionType();

    /**
     * Default constructor
     */
    public TightVNCConnectionType() {
        super (NAME);
    }
}
