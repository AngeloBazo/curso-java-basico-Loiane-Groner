package testandoConhecimentos;

public class Fibo01Aula35 {

	public static void main(String[] args) {

		long a, b, c;

		a = 0;
		b = 1;
		c = 2;

		System.out.print(a + " - ");
		System.out.print(b + " - ");

		for (int x = 0; x < 50; x++) {

			a = b;

			b = c;

			c = a + b;

			System.out.println(a + "  ");
		}

	}

}
