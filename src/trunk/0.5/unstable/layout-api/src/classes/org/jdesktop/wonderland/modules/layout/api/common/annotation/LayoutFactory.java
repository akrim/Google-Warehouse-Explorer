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

package org.jdesktop.wonderland.modules.layout.api.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.jdesktop.wonderland.common.ExperimentalAPI;

/**
 * Annotation that indicates this class is a layout factory. Layout factories
 * must implement the <code>LayoutFactorySPI</code> interface.
 * 
 * @author Jonathan Kaplan <kaplanj@dev.java.net>
 */
@Target(ElementType.TYPE)
@ExperimentalAPI
public @interface LayoutFactory {
}
