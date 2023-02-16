package exercicios.folha.loiane;

public class Aula17exercicio16 {

	public static void main(String[] args) {

		int cont, t1, t2, t3;
	
		t1 = 0;
		System.out.print(t1 + " ");
		t2 = 1;
		System.out.print(t2 + " ");
		
		for (cont = 0; cont <100; cont++) {
		t3 = t1 + t2;
		
			if (t3 < 500) {
			
				System.out.print(t3 + " ");
				t1 = t2;
				t2 = t3;
		}			
			
		}
		
		
	}
	}
		
		/*
		int n1 = 0;
		int n2 = 1;
		int n3;
		int cont;
		
					
			for (cont = 0; cont <10; cont++) {
				
		n3 = n1 + n2;
		n1 = n3;
		n2 = n2 + n3;
	
		if (n1<500 && n2 <500) {	
		System.out.println("Contador " + n1 + "  " + n2);
	
		}
				}

			
			
			}
}
		
		*/
		

		



