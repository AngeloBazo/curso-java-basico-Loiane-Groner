package com.loiane.cursojava.aula36_exercicios;

public class Aluno {

	private String nomeAluno;
	private String matr�cula;
	private double nota01, nota02, nota03, nota04;

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatr�cula() {
		return matr�cula;
	}

	public void setMatr�cula(String matr�cula) {
		this.matr�cula = matr�cula;
	}

	public double getNota01() {
		return nota01;
	}

	public void setNota01(double nota01) {
		this.nota01 = nota01;
	}

	public double getNota02() {
		return nota02;
	}

	public void setNota02(double nota02) {
		this.nota02 = nota02;
	}

	public double getNota03() {
		return nota03;
	}

	public void setNota03(double nota03) {
		this.nota03 = nota03;
	}

	public double getNota04() {
		return nota04;
	}

	public void setNota04(double nota04) {
		this.nota04 = nota04;
	}

	public double obterMedia () {
		
		double mediaFinal = (getNota01()+getNota02()+ getNota03()+ getNota04())/4;
		
		return mediaFinal;
				
	}
	
	
}
