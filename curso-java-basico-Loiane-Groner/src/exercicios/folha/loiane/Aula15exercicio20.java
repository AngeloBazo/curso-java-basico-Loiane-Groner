package exercicios.folha.loiane;

import java.util.Scanner;

public class Aula15exercicio20 {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner (System.in); 
		 
		String pergunta01, pergunta02, pergunta03, pergunta04, pergunta05;
		String sim = "s";
		String nao = "n";
		
		int respostaNao = 0;
		int respostaSim = 0;
									
			System.out.println("Digite s ou s : ");
			System.out.println("");
			
			System.out.println("PERGUNTA 01 - : ");
			pergunta01 = scan.next();
							
			System.out.println("PERGUNTA 02 - : ");
			pergunta02 = scan.next();
				
			System.out.println("PERGUNTA 03 - : ");
			pergunta03 = scan.next();
		
			System.out.println("PERGUNTA 04 - : ");
			pergunta04 = scan.next();
	
			System.out.println("PERGUNTA 05 - : ");
			pergunta05 = scan.next();
			
		
			if (pergunta01.equals(sim))	{
				
				  respostaSim = respostaSim + 1; 
							
			} else { 
				respostaNao = respostaNao + 1;
				} 
			
			if (pergunta02.equals(sim))	{
				
				  respostaSim = respostaSim + 1; 
							
			} else { 
				respostaNao = respostaNao + 1;
				}
			
			
			if (pergunta03.equals(sim))	{
				
				  respostaSim = respostaSim + 1; 
							
			} else { 
				respostaNao = respostaNao + 1;
				}
			
			
			if (pergunta04.equals(sim))	{
				
				  respostaSim = respostaSim + 1; 
							
			} else { 
				respostaNao = respostaNao + 1;
				}
			
			if (pergunta05.equals(sim))	{
				
				  respostaSim = respostaSim + 1; 
							
			} else { 
				respostaNao = respostaNao + 1;
				}
			
			System.out.println("resposta sim " + respostaSim);
			System.out.println("resposta nao " + respostaNao);
			
			if (respostaSim == 0 || respostaSim == 1 ) {
			
			System.out.println("0 OU 1 respostas positivas - inocente" );
			}
			
			else if (respostaSim == 2) { 
			
			System.out.println("2 respostas positivas - SUSPEITA" );
			}
			
			else if (respostaSim == 3 || respostaSim == 4  ) { 
				
				System.out.println("3 ou 4 respostas positivas - CUMPLICE" );
				}
			
			else 			
			System.out.println("5 respostas positivas - ASSASSINO" );
			
			
	}

}
