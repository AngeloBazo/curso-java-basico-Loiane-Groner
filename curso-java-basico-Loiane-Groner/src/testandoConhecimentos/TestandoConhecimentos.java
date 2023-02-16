package testandoConhecimentos;

import java.util.Scanner;

public class TestandoConhecimentos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite o lado do quadrado:");
		
		int num1 = teclado.nextInt();
	
		switch (num1){
		case 1: System.out.print("valor é " + num1 );break;
		case 2: System.out.print("valor é " + num1 );break;
		case 3: System.out.print("valor é " + num1 );break;
		default: System.out.print("não é valido" );break;

		
		
		}

	}

}
