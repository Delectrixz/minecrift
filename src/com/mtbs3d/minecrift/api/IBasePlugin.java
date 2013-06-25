/**
 * Copyright 2013 Mark Browning, StellaArtois
 * Licensed under the LGPL 3.0 or later (See LICENSE.md for details)
 */
package com.mtbs3d.minecrift.api;

import java.io.File;

public interface IBasePlugin {

	float PIOVER180 = (float)(Math.PI/180); 

	/** 
	 * Plugin ID: should be fixed per plugin! Used in optionsvr.txt
	 */
	public String getID();

	/**
	 * Printable name
	 */
	public String getName();

	public String getInitializationStatus();

	public String getVersion();

	public boolean init(File nativeDir);

	public boolean init();

	public boolean isInitialized();

	public void poll();

	public void destroy();

	public boolean isCalibrated();
	
	public String getCalibrationStep();
}