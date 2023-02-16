package com.loiane.cursojava.aula26;

public class Aula26MetodoComRetorno2Main {

	public static void main(String[] args) {
	
		Aula26MetodoComRetorno jogador = new Aula26MetodoComRetorno();
		
		jogador.exibirCombustivel(1000, 88, "Angelo");
		
		System.out.println("Comb 02 = " + jogador.comb02);
		
		System.out.println(jogador.toString());
	
	}

}
