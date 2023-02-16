package com.loiane.cursojava.aula52;

public class Teste {

	public static void main(String[] args) {
		
		
		Contato contatos[] = new Contato[3];

		Contato cont01 = new Contato();
		cont01.setNome("Angelo");
		cont01.setTelefone("1111-2222");
		contatos[0] = cont01;


		Contato cont02 = new Contato();
		cont02.setNome("Maria");
		cont02.setTelefone("3333-4444");
		contatos[1] = cont02;

		Contato cont03 = new Contato();
		cont03.setNome("João");
		cont03.setTelefone("5555-6666");
		contatos[2] = cont03;
		
		
		
		
		
		for (int i = 0; i<contatos.length;i++) {
			
			System.out.println(contatos[i]);
		}
			
		
			
		

	}

}
