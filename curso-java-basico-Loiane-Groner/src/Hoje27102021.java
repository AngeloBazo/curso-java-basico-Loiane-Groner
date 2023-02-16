import java.util.Scanner;
public class Hoje27102021 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println ("Digite Angelo ou Bia: ");
		String nome = scan.nextLine();
		switch (nome) {
		case "Angelo": System.out.println ("nome Angelo:" ); break;
		case "Bia" : System.out.println ("nome Bia:" ); break;
		default: System.out.println ("Nome não válido:"); 
		}
	}
}
