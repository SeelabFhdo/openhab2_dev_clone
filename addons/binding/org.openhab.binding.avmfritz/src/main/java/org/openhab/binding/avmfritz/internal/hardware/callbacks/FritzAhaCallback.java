/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.avmfritz.internal.hardware.callbacks;

/**
 * Interface for callbacks in asynchronous requests.
 * 
 * @author Robert Bausdorf
 * 
 */
public interface FritzAhaCallback {
	/**
	 * Runs callback code after response completion.
	 */
	void execute(int status, String response);
	
	/**
	 * Get the URI path
	 * @return URI path as String
	 */
	public String getPath();
	
	/**
	 * Get the query String
	 * @return Query string as String
	 */
	public String getArgs();
}
