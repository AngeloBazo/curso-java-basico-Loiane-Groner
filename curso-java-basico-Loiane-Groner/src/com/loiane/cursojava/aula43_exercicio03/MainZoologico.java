package com.loiane.cursojava.aula43_exercicio03;

public class MainZoologico {

	public static void main(String[] args) {

		Animal camelo = new Animal("Camelo", 150, "Amarelo", "Terra", 2);
		System.out.println("ZOO:");
		System.out.println(camelo.toString());

		Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");
  		System.out.println(tubarao.toString());

		Mamifero urso = new Mamifero("Urso do Canadá", 180, "Vermelho", "Terra", 0.5, "Mel");
		System.out.println(urso.toString());
		System.out.println("Alimento: \t" + urso.getAlimentoMamifero());
		
		
		

	}

}
