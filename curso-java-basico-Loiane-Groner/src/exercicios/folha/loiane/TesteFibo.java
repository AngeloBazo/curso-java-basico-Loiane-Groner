package exercicios.folha.loiane;

public class TesteFibo {

	public static void main(String[] args) {
		
		int cont, t0, t1, t2;
					
		t0 = 0;
		System.out.print(t0 + " ");
		
		t1 = 1;
		System.out.print(t1 + " ");
		
		for (cont = 0; cont <100; cont++) {
		
		t2 = t0 + t1;
		
		System.out.print(t2 + " ");
		
		t0 = t1;
		
		t1 = t2;
		
			
		}
		
		

	}

}
