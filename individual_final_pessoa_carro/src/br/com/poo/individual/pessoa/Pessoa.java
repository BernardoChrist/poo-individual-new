package br.com.poo.individual.pessoa;

import java.util.HashMap;
import java.util.Map;

public class Pessoa {

	private Integer id;
	private String nomePessoa;
	private Integer idPessoa;

	public static Map<Integer, Pessoa> mapaPessoa = new HashMap<>();

	public Pessoa() {
		super();
	}

	// construtor - seguir essa ordem para criar um objeto no txt
	public Pessoa(Integer id, String nomePessoa, Integer idPessoa) {
		super();
		this.id = id;
		this.nomePessoa = nomePessoa;
		this.idPessoa = idPessoa;
	}

	// gets
	public Integer getId() {
		return id;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

}
