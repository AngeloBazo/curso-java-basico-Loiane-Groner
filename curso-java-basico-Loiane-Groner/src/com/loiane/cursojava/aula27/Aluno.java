package com.loiane.cursojava.aula27;

import java.text.DecimalFormat;

public class Aluno {

	private String nomeAluno;
	private int matriculaAluno;
	private String cursoAluno;
	private String matematica = "Matemática";
	private String portugues = "Português";
	private String ingles = "Inglês";

	DecimalFormat formatador = new DecimalFormat("0.00");
	
	public void verificarAprovacao(double nota01, double nota02, double nota03) {

		double mediaNotas;

		mediaNotas = (nota01 + nota02 + nota03) / 3;

		System.out.println("A média do aluno foi : " +  formatador.format(mediaNotas));

		if (mediaNotas >= 7) {
			System.out.println("Aprovado");
		} else if ((mediaNotas >= 5) && (mediaNotas < 7)) {
			System.out.println("Recuperação");
		} else
			System.out.println("Reprovado");

	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getCursoAluno() {
		return cursoAluno;
	}

	public void setCursoAluno(String cursoAluno) {
		this.cursoAluno = cursoAluno;
	}

	public String getMatematica() {
		return matematica;
	}

	public void setMatematica(String matematica) {
		this.matematica = matematica;
	}

	public String getPortugues() {
		return portugues;
	}

	public void setPortugues(String portugues) {
		this.portugues = portugues;
	}

	public String getIngles() {
		return ingles;
	}

	public void setIngles(String ingles) {
		this.ingles = ingles;
	}

	public DecimalFormat getFormatador() {
		return formatador;
	}

	public void setFormatador(DecimalFormat formatador) {
		this.formatador = formatador;
	}
	
	
		
	}


