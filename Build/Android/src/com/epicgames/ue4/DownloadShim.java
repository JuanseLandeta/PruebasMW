package com.epicgames.ue4;

import com.YourCompany.PruebasMW.OBBDownloaderService;
import com.YourCompany.PruebasMW.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

