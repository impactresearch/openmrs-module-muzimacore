/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.muzima.model.handler;

import org.openmrs.module.muzima.exception.QueueProcessorException;
import org.openmrs.module.muzima.model.QueueData;

/**
 */
public interface QueueDataHandler {
    /**
     * Implementation of how the queue data should be processed.
     *
     * @param queueData the queued data.
     */
    void process(final QueueData queueData) throws QueueProcessorException;

    /**
     * Flag whether the current queue data handler can handle the queue data.
     *
     * @param queueData the queue data.
     * @return true when the handler can handle the queue data.
     */
    boolean accept(final QueueData queueData);

    /**
     * Validating the the payload before processing the data
     *
     * @param queueData the queue data.
     * @return true when payload can be process
     */
    boolean validate(final QueueData queueData);

    /**
     * Get the discriminator for this handler
     *
     * @return String the discriminator type
     */
    String getDiscriminator();
}
