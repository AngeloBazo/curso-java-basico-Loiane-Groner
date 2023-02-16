package com.loiane.cursojava.aula36_testes;

public class Planta {

	private String nomePlanta;
	private Adubos adubacao;
	private String dataCompra;

	public String getNomePlanta() {
		return nomePlanta;
	}

	public void setNomePlanta(String nomePlanta) {
		this.nomePlanta = nomePlanta;
	}

	public Adubos getAdubacao() {
		return adubacao;
	}

	public void setAdubacao(Adubos adubacao) {
		this.adubacao = adubacao;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

	@Override
	public String toString() {
		return "Planta: " 
	+ "\n\tNome da planta = " + nomePlanta + " " 
	+ "\n\tData da compra = "	+ dataCompra + " "			
	+ "\n\tAduba��o = " + adubacao + " " // mostra a refer�ncia de mem�ria e n�o o que est� dentro
	+ "\n\tTipo do adubo = " + adubacao.getTipoAdubo() + " "
	+ "\n\tQtd do adubo = " + adubacao.getQtdAdubo();
				
	}

}
