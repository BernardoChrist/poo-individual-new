package br.com.poo.individual.carro;

import java.util.HashMap;
import java.util.Map;

public class Carro {

	private Integer id;
	private String modelo;

	public static Map<Integer, Carro> mapaCarro = new HashMap<>();

	public Carro() {
		super();
	}

	// construtor - seguir ordem ao criar um objeto no txt
	public Carro(Integer id, String modelo) {
		super();
		this.id = id;
		this.modelo = modelo;
	}

	// gets
	public Integer getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}
}
