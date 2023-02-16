package testandoConhecimentos;

public class VetorPalavrasIngles {

	public static void main(String[] args) {

		String vetorIngles[] = new String[100];

		vetorIngles[0] = "Them = Eles";
		vetorIngles[1] = "Where = Onde";
		vetorIngles[2] = "He = Ele";
		vetorIngles[87] = "She = Ela";
		
		for (int count = 0; count < vetorIngles.length; count++) {

			if (vetorIngles[count] != null)
				System.out.println(count + ": 	" + vetorIngles[count]);
			else
				continue;

		}

	}

}
