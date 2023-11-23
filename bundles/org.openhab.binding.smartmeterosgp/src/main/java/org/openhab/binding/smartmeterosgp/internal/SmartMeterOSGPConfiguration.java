/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.smartmeterosgp.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link SmartMeterOSGPConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Kennet Nielsen - Initial contribution
 */
@NonNullByDefault
public class SmartMeterOSGPConfiguration {
    public String port = "";
    public int userId = 1;
    public String username = "";
    public String password = "";
    public int refreshInterval = 2;
    public int logoffInterval = 9 * 60;
    public String idleStartTime = "02:10:00";
    public int idleSeconds = 8 * 60;
}
