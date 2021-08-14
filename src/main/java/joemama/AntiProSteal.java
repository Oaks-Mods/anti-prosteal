package joemama;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

import java.net.URL;
import java.net.URLClassLoader;

public class AntiProSteal implements PreLaunchEntrypoint {
	@Override
	public void onPreLaunch() {
		System.out.println("tele jigsaw grunt pathic telepathic st'ructure processorjigsaw worldgenjson");
		try {
			try (URLClassLoader classLoader = new URLClassLoader(new URL[]{AntiProSteal.class.getProtectionDomain().getCodeSource().getLocation()})) {
				classLoader.loadClass("io.github.coolmineman.prosteal.ProSteal");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
