package br.com.poo.individual.enums;

public enum CarroPessoaEnum {

	CARRO("carro", 1),
	PESSOA("pessoa", 2);

	private String tipo;
	private int id;
	
	CarroPessoaEnum(String tipo, int id) {
		this.tipo = tipo;
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public int getId() {
		return id;
	}
}
