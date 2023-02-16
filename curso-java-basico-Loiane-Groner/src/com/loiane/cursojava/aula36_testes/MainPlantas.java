package com.loiane.cursojava.aula36_testes;

public class MainPlantas {

	public static void main(String[] args) {

		Adubos a1 = new Adubos();

		a1.setTipoAdubo("Osmocote");
		a1.setQtdAdubo("3 colheres sopa");

		Planta planta1 = new Planta();

		planta1.setNomePlanta("Azaléia flor branca vaso grande");
		planta1.setDataCompra("01/01/2021");
		planta1.setAdubacao(a1);
 
		if (planta1.getAdubacao() != null) { // garante que o programa roda s/ erro mullpointer
			System.out.println(planta1.toString());
		}

	}

}
