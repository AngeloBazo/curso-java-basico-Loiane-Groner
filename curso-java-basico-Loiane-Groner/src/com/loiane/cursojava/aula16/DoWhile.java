package com.loiane.cursojava.aula16;

public class DoWhile {

	public static void main(String[] args) {

		int i = 0;
		int max = 10;
		
		System.out.println ("Contando at? " + max);
		
		while (i <= max) {
		
			System.out.println ("Valor de i: " + i);
			
			i++; // i = i + 1; ou i +=1;
			
			System.out.println (i); // valor de 11
			
			do {
				
				i++;
				System.out.println ("Valor de i: " + i);
			
			} while (i < 15);
			
			System.out.println (i);
				
			}
			
		}

	}


