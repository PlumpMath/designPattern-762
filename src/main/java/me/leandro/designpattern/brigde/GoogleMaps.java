package me.leandro.designpattern.brigde;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String retornaMapa(String rua) {
		try {
			URL url = new URL("http://maps.google.com/q?rua+teste");
			InputStream openStream = url.openStream();
			return "mapa do google";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
