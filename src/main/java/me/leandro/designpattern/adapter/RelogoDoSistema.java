package me.leandro.designpattern.adapter;

import java.util.Calendar;

public class RelogoDoSistema implements Relogio {

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
