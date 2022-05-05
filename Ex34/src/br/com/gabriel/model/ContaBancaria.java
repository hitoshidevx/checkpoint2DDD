package br.com.gabriel.model;

public class ContaBancaria {
	
	protected int id;
	protected String agencia;
	protected String numero;
	protected double saldo;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ContaBancaria() {}
	
	public ContaBancaria(String agencia, String numero, double saldo) {
		
	}
	
}
