/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.test.performance;

import org.eclipse.test.internal.performance.InternalDimensions;

/**
 * Some predefined dimensions most likely supported on all platforms.
 *
 * This interface is not intended to be implemented by clients.
 * 
 * @since 3.1
 */
public interface Dimension {

    /**
     * The elapsed time this process is running.
     */
    public Dimension ELAPSED_PROCESS= InternalDimensions.ELAPSED_PROCESS;

    /**
     * Runtime.totalMemory() - Runtime.freeMemory().
     */
    public Dimension USED_JAVA_HEAP= InternalDimensions.USED_JAVA_HEAP;

}
