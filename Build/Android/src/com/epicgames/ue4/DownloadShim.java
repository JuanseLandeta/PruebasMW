package com.epicgames.ue4;

import Blau.Pruebas_Miniwheels.OBBDownloaderService;
import Blau.Pruebas_Miniwheels.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

