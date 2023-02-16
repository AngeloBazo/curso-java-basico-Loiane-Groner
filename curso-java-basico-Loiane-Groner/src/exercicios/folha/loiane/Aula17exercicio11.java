
package exercicios.folha.loiane;

public class Aula17exercicio11 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 10;
		int c;
		int d = 0; 
		
		System.out.println("Intervalo de números: ");
		
		for (c=a+1; c<b; c++) {
		
			System.out.print(c + " , ");
		
		d = d + c;
						
		}
		
		System.out.println("");
		System.out.println("Soma: " + d);
		
	}

}
