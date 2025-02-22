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
package org.jdesktop.wonderland.modules.colladaavatar.client;

import org.jdesktop.wonderland.modules.avatarbase.client.loader.annotation.AvatarLoaderFactory;
import org.jdesktop.wonderland.modules.avatarbase.client.loader.spi.AvatarLoaderFactorySPI;
import org.jdesktop.wonderland.modules.avatarbase.client.loader.spi.AvatarLoaderSPI;

/**
 * Generates loaders to load the basic avatars on the client.
 *
 * @author Jordan Slott <jslott@dev.java.net>
 */
@AvatarLoaderFactory(isDefault=true)
public class ColladaAvatarLoaderFactory implements AvatarLoaderFactorySPI {

    /**
     * {@inheritDoc}
     */
    public AvatarLoaderSPI getAvatarLoader() {
        return new ColladaAvatarLoader();
    }
}
