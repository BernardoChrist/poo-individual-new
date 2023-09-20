package br.com.poo.individual;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.carro.Carro;
import br.com.poo.individual.pessoa.Pessoa;
import br.com.poo.individual.util.Util;
import br.com.poo.individual.io.LeituraEscrita;

public class Menu {

	static Scanner sc = new Scanner(System.in);
	private static Logger customLogger = Util.setupLogger();

	public static void menu() throws IOException {

		// Usando logger para escrever o menu
		Util.customizer();
		customLogger.log(Level.INFO,
				() -> "Menu\n\n[1]\tListar carros\n[2]\tListar pessoas\n[3]\tListar dono de cada carro\n[0]\tSair\n\nDigite a opção desejada: ");
		int opc = sc.nextInt();

		// utilizando escolha caso para as opções do menu
		switch (opc) {

		// caso opc seja 1, irá listar todos carros pelo modelo
		case 1:
			Util.customizer();
			customLogger.log(Level.INFO, () -> "\n\nLista de carros: ");
			for (Carro c : Carro.mapaCarro.values()) {
				Util.customizer();
				customLogger.log(Level.INFO, () -> c.getModelo());
			}
			Util.customizer();
			customLogger.log(Level.INFO, () -> "\n\n");
			menu();
			break;

		// caso a opc seja 2, irá listar todas as pessoas
		case 2:
			Util.customizer();
			customLogger.log(Level.INFO, () -> "\n\nLista de pessoas: ");
			for (Pessoa p : Pessoa.mapaPessoa.values()) {
				Util.customizer();
				customLogger.log(Level.INFO, () -> p.getNomePessoa());
			}
			Util.customizer();
			customLogger.log(Level.INFO, () -> "\n\n");
			menu();
			break;

		// caso a opc seja 3, irá entrar no método carroPessoa
		case 3:
			carroPessoa();
			break;
		case 0:
			Util.customizer();
			customLogger.log(Level.INFO, () -> "Volte sempre!");
			break;
		default:
			Util.customizer();
			customLogger.log(Level.INFO, () -> "Opção inválida!");
			menu();
			break;
		}
	}

	public static void carroPessoa() throws IOException {
		List<Pessoa> listaProprietarios = new ArrayList<>();
		Carro carro = null;
		Util.customizer();
		customLogger.log(Level.INFO,
				() -> "\n\nCarros:\n[1]\tHyundai HB20\n[2]\tChevrolet Cruze\n[3]\tFord EcoSport\n[4]\tFiat 500\n[0]\tVoltar ao menu anterior\n\nDigite a opção desejada: ");
		int opcao = sc.nextInt();
		switch (opcao) {

		// quando for 1, irá exibir o nome da pessoa que tiver o ID = 1, correspondendo
		// ao carro que ela possui
		case 1:
			carro = Carro.mapaCarro.get(1);
			listaProprietarios.clear();
			for (Pessoa p : Pessoa.mapaPessoa.values()) {
				if (p.getIdPessoa() == 1) {
					Util.customizer();
					customLogger.log(Level.INFO, () -> "O dono é o " + p.getNomePessoa());
					listaProprietarios.add(p);
				}
			}
			LeituraEscrita.relatorioProprietarioCarro(carro, listaProprietarios);
			carroPessoa();
			break;

		// quando for 2, irá exibir o nome da pessoa que tiver o ID = 2, correspondendo
		// ao carro que ela possui
		case 2:
			carro = Carro.mapaCarro.get(2);
			listaProprietarios.clear();
			for (Pessoa p : Pessoa.mapaPessoa.values()) {
				if (p.getIdPessoa() == 2) {
					Util.customizer();
					customLogger.log(Level.INFO, () -> "O dono(a) é o(a) " + p.getNomePessoa());
					listaProprietarios.add(p);
				}
			}
			LeituraEscrita.relatorioProprietarioCarro(carro, listaProprietarios);
			carroPessoa();
			break;

		// quando for 3, irá exibir o nome da pessoa que tiver o ID = 3, correspondendo
		// ao carro que ela possui
		case 3:
			carro = Carro.mapaCarro.get(3);
			listaProprietarios.clear();
			for (Pessoa p : Pessoa.mapaPessoa.values()) {
				if (p.getIdPessoa() == 3) {
					Util.customizer();
					customLogger.log(Level.INFO, () -> "O dono(a) é o(a) " + p.getNomePessoa());
					listaProprietarios.add(p);
				}
			}
			LeituraEscrita.relatorioProprietarioCarro(carro, listaProprietarios);
			carroPessoa();
			break;

		// quando for 4, irá exibir o nome da pessoa que tiver o ID = 4, correspondendo
		// ao carro que ela possui
		case 4:
			carro = Carro.mapaCarro.get(4);
			listaProprietarios.clear();
			for (Pessoa p : Pessoa.mapaPessoa.values()) {
				if (p.getId() == 4) {
					Util.customizer();
					customLogger.log(Level.INFO, () -> "O dono(a) é o(a) " + p.getNomePessoa());
					listaProprietarios.add(p);
				}
			}
			LeituraEscrita.relatorioProprietarioCarro(carro, listaProprietarios);
			carroPessoa();
			break;
		case 0:
			menu();
			break;
		default:
			Util.customizer();
			customLogger.log(Level.INFO, () -> "Opção inválida!");
			carroPessoa();
			break;
		}
	}

}
