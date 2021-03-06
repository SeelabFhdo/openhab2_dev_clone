/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.pioneeravr.internal.handler;

import org.eclipse.smarthome.core.thing.Thing;
import org.openhab.binding.pioneeravr.PioneerAvrBindingConstants;
import org.openhab.binding.pioneeravr.internal.protocol.ip.IpAvrConnection;
import org.openhab.binding.pioneeravr.protocol.AvrConnection;

/**
 * An handler of an AVR connected through an IP connection.
 * 
 * @author Antoine Besnard
 *
 */
public class IpAvrHandler extends AbstractAvrHandler {

	public IpAvrHandler(Thing thing) {
		super(thing);
	}

	@Override
	protected AvrConnection createConnection() {
		String host = (String) this.getConfig().get(PioneerAvrBindingConstants.HOST_PARAMETER);
		Integer tcpPort = ((Number) this.getConfig().get(PioneerAvrBindingConstants.TCP_PORT_PARAMETER)).intValue();

		return new IpAvrConnection(host, tcpPort);
	}

}
