package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula17exercicio2 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in); 
	
	boolean infoValidas = false;
	
	String nomeDigitado;
	String senhaDigitada;
	
		do {
					
			System.out.print("Digite seu nome : ");

			nomeDigitado = scan.next();
			
			System.out.print("Digite sua Senha : ");

			senhaDigitada = scan.next();
			
				if (nomeDigitado.equalsIgnoreCase(senhaDigitada)) {
					
				//	infoValidas = false;
		
				System.out.println("\nSenha inválida, digite novamente\n");
				
				} else {
					infoValidas = true;
				
					System.out.println("Senha válida\n");
				}
													
		} while (!infoValidas); 
		
		System.out.println(" \nSENHA VÁLIDA - FIM DO PROGRAMA ");

	}
}
