package senacPTI;

public class VetorGuanabara02 {

	public static void main(String[] args) {
		
		String mes [] = {"jan", "fev", "mar", "abr", "mai", "jun",
				"jul", "ago", "set", "out", "nov", "dez"};
		
		int tot [] = {31, 28
				, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int soma = 0;
					
		for (int c=0; c<tot.length; c++) {
			
			soma = soma + tot [c]; 			

			System.out.println ("O mês de " + mes [c] + " tem " + tot [c] + " dias ao todo. ");
		
		}
		
		System.out.println ("\nTotal de dias ano:  " + soma + " dias"); 
	
		}
}

