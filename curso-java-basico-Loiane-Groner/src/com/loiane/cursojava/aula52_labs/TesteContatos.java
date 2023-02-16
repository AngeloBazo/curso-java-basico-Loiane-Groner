package com.loiane.cursojava.aula52_labs;

public class TesteContatos {

	public static void main(String[] args) {

		Contatos[] contato = new Contatos[10];

		Contatos cont01 = new Contatos("Angelo", 12345);
		Contatos cont02 = new Contatos("Maria", 2222);
		Contatos cont03 = new Contatos("José", 7777);

		contato[0] = cont01;
		contato[1] = cont02;
		contato[2] = cont03;

		for (int i = 0; i < contato.length; i++) {

			if (contato[i] != null) {

				System.out.println(contato[i].toString());
			} //else
				//System.out.println("tem uma exception aqui");
			

		}

		System.out.println("0000");
	}

}
