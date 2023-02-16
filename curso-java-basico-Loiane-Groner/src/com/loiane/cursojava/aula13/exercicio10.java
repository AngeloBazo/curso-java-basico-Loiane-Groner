package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
		
		double tempCelsius, tempFarenheit;
		
System.out.println("Digite a temperatura em Celsius: ");

tempCelsius = scan.nextDouble();


tempFarenheit = (tempCelsius * 1.8 ) + 32;


System.out.println ("Temperatura em Farenheit: " + tempFarenheit);

	}

}
