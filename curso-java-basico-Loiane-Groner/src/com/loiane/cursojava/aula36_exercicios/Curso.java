package com.loiane.cursojava.aula36_exercicios;

import com.loiane.cursojava.aula36.Contato;

public class Curso {

	private String nomeCurso;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

}
