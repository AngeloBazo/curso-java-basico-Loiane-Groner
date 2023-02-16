package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double dia001 = 31.3;
		double dia002 = 32;
		double dia003 = 33.7;

		double[] temp = new double[10];

		temp[0] = dia001;
		temp[1] = dia002;
		temp[2] = dia003;

		for (int i = 0; i < temp.length; i++) {

			System.out.println(temp[i]);
		}

		System.out.println("---------------------------");
		
	
		for (double count : temp) {
			
			System.out.println(count);
		
		}
			
			

	}

}
