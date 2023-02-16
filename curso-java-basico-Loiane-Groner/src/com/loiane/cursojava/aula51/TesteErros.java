package com.loiane.cursojava.aula51;

public class TesteErros {

	public static void main(String[] args) {

		long[] array = new long[999999999];

		// erro: java.lang.OutOfMemoryError

		for (int i = 0; i < 100000000; i++) {

			array[i] = 99999999;

			System.out.println(array[i]);

		}

	}

 }
