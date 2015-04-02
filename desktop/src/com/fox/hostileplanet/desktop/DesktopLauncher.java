package com.fox.hostileplanet.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.fox.hostileplanet.Launcher;

public class DesktopLauncher
{
	public static void main(String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Hostile Planet";
		config.width = 1080;
		config.height = 720;
		config.resizable = false;
		new LwjglApplication(new Launcher(), config);
	}
}
