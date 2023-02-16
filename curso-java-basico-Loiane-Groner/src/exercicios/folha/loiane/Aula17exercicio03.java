package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula17exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String M = "M"; 
		String F = "F";
		String S = "S";
		String C = "C";
		String V = "V";
		String D = "D";
					
		System.out.println("Digite seu nome com mais de três caracteres : ");
		String nome = scan.next();

		System.out.println("Digite sua idade entre 0 e 150 : ");
		int idade = scan.nextInt();
		
			if (idade >=0 && idade<=150) { 
			System.out.println("IDADE VALIDADA");
			} else { System.out.println("INVÁLIDO "); }
			
				
		System.out.println("Digite seu salário maior que 0 : ");
		double salario = scan.nextDouble();

			if (salario >0) { 
			System.out.println("SALARIO VALIDADO");
			} else { System.out.println("INVÁLIDO "); }
				
		System.out.println("Digite seu sexo - M ou F : ");
		String sexo = scan.next();
		
			if (sexo.equalsIgnoreCase(M) || sexo.equalsIgnoreCase(F)) { 
			System.out.println("SEXO VALIDADO");
			} else { System.out.println("INVÁLIDO "); }
				
		
		System.out.println("Digite seu estado civil - S, C, V, D : ");
		String estadoCivil = scan.next();
		
			if (estadoCivil.equalsIgnoreCase(S) || estadoCivil.equalsIgnoreCase(C) || 
					estadoCivil.equalsIgnoreCase(V) || estadoCivil.equalsIgnoreCase(D)) { 
			System.out.println("SEXO VALIDADO");
			} else { System.out.println("INVÁLIDO "); }

		
	}

}
