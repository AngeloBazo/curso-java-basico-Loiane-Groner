package senacPTI;

public class BuscaSequencial {

	public static void main(String[] args) {
		
		System.out.println ("Programa Vetor - Data: 14-01-2022\n");
		
		int vetor[] = {35, 15, 29, 83, 10};
		
		System.out.println ("Total de casas do vetor " + vetor.length);
		
		//for (int c=0; c<=4; c++) {
		
		for (int c=0; c<=vetor.length-1; c++) {
		
			System.out.print (vetor [c] + " ");
		
		}

		
		
		
		/*		
		int valorProcurado = 83;
				
		System.out.println ("Valor a ser procurado: " + valorProcurado + "\n"); 
		
		for (int i = 0; i < vetor.length; i++) {
					
				if (vetor [i] == valorProcurado) {
		
					System.out.println ("Posição do n procurado no vetor: " + i + "\n");
					
					break;
				
				}
		}
	

				System.out.println ("fim");*/
		
		}
	}
