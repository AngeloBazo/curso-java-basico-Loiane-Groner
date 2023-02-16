package com.loiane.cursojava.aula44a46_exercicio01;

public class MainFigurasTeste {

	public static void main(String[] args) {

		Cilindro cili01 = new Cilindro();
		System.out.println(
				"Dado um cilindro reto com 16 cm de altura e raio da base de 5 cm. \nQual o valor da área total dessa figura?");
		cili01.setAlturaDoCilindro(16);
		cili01.setRaioDaBase(5);
		cili01.calcularArea();
		System.out.println("Resp: " + cili01.getAreaTotal() + " cm2");

		System.out.println("------------------------------------------------------");		
		
		System.out.println(
				"Dado um cilindro que possui base com raio de 1m e altura de 2 m. \nQual o volume dessa figura?");
		cili01.setAlturaDoCilindro(2);
		cili01.setRaioDaBase(1);
		cili01.calcularVolume();
		System.out.println("Resp: " + cili01.getVolumeDoCilindro() + " m3");

		System.out.println("------------------------------------------------------");
		System.out.println("FiguraGeometrica [] arrayFG =");
		System.out.println("------------------------------------------------------");
		
		Cilindro cilindro01 = new Cilindro();
		cilindro01.setNome("Cilindro 01");
		cilindro01.setCor("Red and Blue");
		cilindro01.setAlturaDoCilindro(16);
		cilindro01.setRaioDaBase(5);
		
		
		Circulo circulo01 = new Circulo();
		circulo01.setNome("Circulo 01");
		
		Cubo cubo01 = new Cubo();
		cubo01.setNome("Cubo 01");
		
		Piramide piramide01 = new Piramide();
		piramide01.setNome("Piramide 01");
		
		Quadrado quadrado01 = new Quadrado();
		quadrado01.setNome("Quadrado 01");
		
		Triangulo triangulo01 = new Triangulo();
		triangulo01.setNome("Triangulo 01");
		
		
		FiguraGeometrica [] arrayFG = {cilindro01, circulo01,cubo01,piramide01,quadrado01,triangulo01};

		for (int i=0; i<arrayFG.length;i++) {
				
			System.out.println("Nome: " + arrayFG[i].getNome());
			System.out.println("Cor: " + arrayFG[i].getCor());
			arrayFG[i].calcularArea();
			arrayFG[i].calcularVolume();
			System.out.println("--------------------");
		
		}
	}
	
}
