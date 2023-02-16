package com.loiane.cursojava.aula36;

import java.util.Scanner;

public class MainAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Nome da agenda");
		String nome = scan.nextLine();

		Agenda agenda = new Agenda(nome);

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("Entre com as info do contato" + (i + 1));
			Contato c = new Contato();

			System.out.println("Entre com o nome");
			nome = scan.nextLine();
			c.setNome(nome);

			System.out.println("Entre com o tel");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);

			System.out.println("Entre com o email");
			String email = scan.nextLine();
			c.setEmail(email);

			contatos[i] = c;

		}

		agenda.setContatos(contatos);

		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}

	}

}
