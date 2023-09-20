package br.com.poo.individual;

import java.io.IOException;

import br.com.poo.individual.io.LeituraEscrita;

public class MetodoMain {

	public static void main(String[] args) {
		// usando try catch para tratamento de erro
		try {

			// "chamando" o metodo leitor para ler o txt
			LeituraEscrita.leitor("banco");

			// exibindo o menu
			Menu.menu();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
