package com.loiane.cursojava.aula26;

public class Aula26MetodoComRetorno {

	public String comb02;
	public int oi = 10;
	public double oii = 100;
	public char xxx = 'x';
	public String lll = "lll";
		
		
	public String exibirCombustivel(int comb01, double comb03, String comb04) {

		comb02 = (int) (comb01 + comb03) + " --- " + comb04;

		return comb02;
	}

	
	@Override
	public String toString() {
		return "TO STRING : \nAula26MetodoComRetorno \n[comb02=" + comb02 + ", \noi=" + oi + ", \noii=" + oii + ", \nxxx=" + xxx + ", \nlll="
				+ lll + "]";
	}

	
}
