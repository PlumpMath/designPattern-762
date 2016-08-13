package me.leandro.designpattern.chainofresponsability.serializacao;

public class Conta {

	private double saldo;
	private String nome;

	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
}
