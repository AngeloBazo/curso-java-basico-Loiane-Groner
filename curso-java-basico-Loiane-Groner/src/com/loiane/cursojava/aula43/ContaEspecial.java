package com.loiane.cursojava.aula43;

public class ContaEspecial extends ContaBancaria {

	protected double limite;
		
	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		this.setNomeCliente(nomeCliente);
		this.setNumConta(numConta);
		this.setSaldo(saldo);
		this.limite = limite;
	}

	public void sacar(double valorSaque) {

		if (valorSaque > getSaldo() + getLimite()) {

			System.out.println("Não pode sacar esse valor - saldo insuficiente");

		} else if (valorSaque <= getSaldo()) {
		
			setSaldo(-(valorSaque) + getSaldo());
			
		} else if (valorSaque > getSaldo()) {
			
			setLimite(-(valorSaque) + getLimite());
			
		}

	}
	

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}


	@Override
	public String toString() {
		return "ContaBancaria: \n NomeCliente = \t" + getNomeCliente() + " \n NumConta = \t" + getNumConta() + " \n Saldo = \t"
				+ getSaldo() + "\n Limite = \t" + this.limite;
	}
	
	
}
