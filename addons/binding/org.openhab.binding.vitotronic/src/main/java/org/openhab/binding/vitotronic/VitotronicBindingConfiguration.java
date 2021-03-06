/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.vitotronic;

/**
 * The {@link VitotronicBindingConfiguration} class defines variables which are 
 * used for the binding configuration.
 * 
 * @author Stefan Andres - Initial contribution
 */

public class VitotronicBindingConfiguration {
	
	public String ipAddress;
	public Integer port;
	public String adapterId;
	public Integer refreshInterval;

}
