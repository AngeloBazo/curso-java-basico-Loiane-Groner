package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.println ("Digite o valor do seu salário: ");
		
		double valorSalario = scan.nextDouble();

if ( valorSalario >= 0 && valorSalario <=280.00) {
			
			System.out.println ("Salário antes do reajuste :" + valorSalario + 
								"\n Percentual de aumento aplicado - 20%, equivalente a :" + valorSalario/100*20 + 
								"\n Valor do salário reajustado :" + ((valorSalario/100*20) + valorSalario));
		
}

else if ( valorSalario > 280.00 && valorSalario <700.00) {
				
				System.out.println ("Salário antes do reajuste :" + valorSalario + 
									"\n Percentual de aumento aplicado - 15%, equivalente a :" + valorSalario/100*15 + 
									"\n Valor do salário reajustado :" + ((valorSalario/100*15) + valorSalario));


}
				else if ( valorSalario > 700.00 && valorSalario <1500.00) {
					
					System.out.println ("Salário antes do reajuste :" + valorSalario + 
										"\n Percentual de aumento aplicado - 10%, equivalente a :" + valorSalario/100*10 + 
										"\nValor do salário reajustado :" + ((valorSalario/100*10) + valorSalario));

}				
			

else { 		
		
	System.out.println ("Salário antes do reajuste :" + valorSalario + 
							"\n Percentual de aumento aplicado - 5%, equivalente a :" + valorSalario/100*5 + 
							"\nValor do salário reajustado :" + ((valorSalario/100*5) + valorSalario));
		
		

	}

}
}