package me.leandro.designpattern.template.relatorio;

public class Conta {

	private String titular;
	private double saldo;

	private String agencia;
	private String numero;

	public Conta(String titular, double saldo, String agencia, String numero) {
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

}
