/**
 * Project Wonderland
 *
 * Copyright (c) 2004-2008, Sun Microsystems, Inc., All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * $Revision$
 * $Date$
 * $State$
 */

package org.jdesktop.wonderland.modules.sharedstatetest.client.recorder;

import com.sun.scenario.animation.TimingTarget;
import org.jdesktop.mtgame.Entity;
import org.jdesktop.mtgame.ProcessorCollectionComponent;
import org.jdesktop.mtgame.ProcessorComponent;

/**
 *
 * @author paulby
 */
public abstract class AnimationProcessorComponent extends ProcessorComponent implements TimingTarget {

    public AnimationProcessorComponent(Entity entity) {
        addToEntity(entity);
    }

    /**
     * Add this processor to the entity
     * @param entity
     */
    void addToEntity(Entity entity) {
        ProcessorCollectionComponent coll = (ProcessorCollectionComponent) entity.getComponent(ProcessorCollectionComponent.class);
        if (coll==null) {
            coll = new ProcessorCollectionComponent();
            entity.addComponent(ProcessorCollectionComponent.class, coll);
        }
        coll.addProcessor(this);
    }
}
