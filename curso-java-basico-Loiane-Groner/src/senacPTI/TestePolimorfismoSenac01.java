package senacPTI;

public class TestePolimorfismoSenac01 {

	public double calcular_media (double AM, double AC, double AS) {
		
		double media = AM * 0.3 + AC * 0.2 + AS * 0.5;
		
		return media;
	}
	
	public double calcular_media (double PM, double AS) {
		double media = PM * 0.4 + AS * 0.6;
		return media;
		
	}
	
	
	public static void main (String [] args) {
		
		TestePolimorfismoSenac01 calc = new TestePolimorfismoSenac01();
		
		double media = calc.calcular_media(9.5, 4.7, 6.9);
			
		double media_pos = calc.calcular_media(7.4, 9.2);
		
		System.out.println("Média : " + media);
		System.out.println(" ");
		System.out.println("Média pós : " + media_pos);
	
	}

}
