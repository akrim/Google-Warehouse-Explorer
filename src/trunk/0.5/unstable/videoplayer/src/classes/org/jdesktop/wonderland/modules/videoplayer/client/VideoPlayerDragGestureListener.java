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
/*
 * Project Wonderland
 * 
 * Copyright (c) 2004-2010, Sun Microsystems, Inc., All Rights Reserved
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
package org.jdesktop.wonderland.modules.videoplayer.client;

import java.awt.Image;
import java.awt.Point;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.util.logging.Logger;

/**
 * A listener for drag events.
 * 
 * @author nsimpson
 */
public class VideoPlayerDragGestureListener implements DragGestureListener {

    private static final Logger logger = Logger.getLogger(VideoPlayerDragGestureListener.class.getName());
    public Image previewImage = null;
    private VideoPlayerWindow window;

    public VideoPlayerDragGestureListener(VideoPlayerWindow window) {
        super();
        this.window = window;
    }

    /**
     * {@inheritDoc}
     */
    public void dragGestureRecognized(DragGestureEvent dge) {
        logger.fine("drag started: " + dge);

        Point dragOrigin = dge.getDragOrigin();
        dragOrigin.setLocation(-dragOrigin.x, -dragOrigin.y);

        //Transferable t = new VideoPlayerStateTransferable(window.getFrame());
        //dge.startDrag(DragSource.DefaultCopyDrop, previewImage, dragOrigin, t, null);
    }
}
