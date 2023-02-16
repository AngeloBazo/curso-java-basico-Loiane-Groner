package com.loiane.cursojava.aula33;

public class Exercicio01Aula33ContaCorrente {

	private String nomeCliente;
	private int numeroCC;
	private double saldoCC;
	private boolean especial;
	private double limiteCC;

	public Exercicio01Aula33ContaCorrente(String nomeCliente, int numeroCC, double saldoCC, double limiteCC) {
		this.nomeCliente = nomeCliente;
		this.numeroCC = numeroCC;
		this.saldoCC = saldoCC;
		this.limiteCC = limiteCC;

	}

	public void realizarSaque(double valorSaque) {

		if (valorSaque < (getSaldoCC() + getLimiteCC())) {

			if (valorSaque < getSaldoCC()) {

				setSaldoCC((getSaldoCC() - valorSaque));

			} else {

				double x, y;

				x = valorSaque - getSaldoCC();

				y = getSaldoCC() - getSaldoCC();

				setLimiteCC(getLimiteCC() - x);
				setSaldoCC(y);

			}

		} else
			System.out.println("***Impossível realizar a operação ***\n Valor do saque supera o saldo + limite");
	}

	public void depositarDinheiro(double valorDeposito) {

		if (getLimiteCC() < 1500) {

			double a, b;

			a = 1500 - getLimiteCC();
			b = valorDeposito - a;

			setLimiteCC(a + getLimiteCC());
			setSaldoCC(b);

		} else {

			setSaldoCC(getSaldoCC() + valorDeposito);
		}
	}

	public void consultarSaldo() {

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroCC() {
		return numeroCC;
	}

	public void setNumeroCC(int numeroCC) {
		this.numeroCC = numeroCC;
	}

	public double getSaldoCC() {

		return saldoCC;
	}

	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}

	public boolean isEspecial() {
		if (this.getLimiteCC() < 1500) {
			especial = true;
		}

		return especial;
	}

	public void setEspecial(boolean especial) {

		this.especial = especial;
	}

	public double getLimiteCC() {

		return limiteCC;
	}

	public void setLimiteCC(double limiteCC) {

		this.limiteCC = limiteCC;
	}

	@Override
	public String toString() {
		return "Classe: Exercicio01Aula33ContaCorrente" + "\nNome do cliente = " + nomeCliente + "\nNumero CC = "
				+ numeroCC + "\nSaldo atual CC = " + saldoCC + "\nLimite cheque especial = " + limiteCC
				+ "\nSaldo + limite = " + (saldoCC + limiteCC) + "\nUtilizando cheque especial = " + especial;

	}

}
