/**
 * Open Wonderland
 *
 * Copyright (c) 2010, Open Wonderland Foundation, All Rights Reserved
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
package org.jdesktop.wonderland.modules.admintools.common;

import org.jdesktop.wonderland.common.messages.MessageID;
import org.jdesktop.wonderland.common.messages.ResponseMessage;

/**
 * Message returning the list of currently connected users
 * @author Jonathan Kaplan <jonathankap@gmail.com>
 */
public class UserListResponseMessage extends ResponseMessage {
    private final UserList users;
    
    public UserListResponseMessage(MessageID requestID,
                                   UserList users)
    {
        super (requestID);
    
        this.users = users;
    }
    
    public UserList getUsers() {
        return users;
    }
}
