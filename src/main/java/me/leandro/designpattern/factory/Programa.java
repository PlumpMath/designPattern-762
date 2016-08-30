package me.leandro.designpattern.factory;

import java.sql.Connection;

public class Programa {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println(connection);
	}
}
