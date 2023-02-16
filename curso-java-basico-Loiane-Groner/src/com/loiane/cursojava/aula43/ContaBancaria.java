package com.loiane.cursojava.aula43;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;


	public void sacar() {
	}

	public void depositar(double valorDeposito) {
					
		setSaldo(getSaldo() + valorDeposito);

	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

}
