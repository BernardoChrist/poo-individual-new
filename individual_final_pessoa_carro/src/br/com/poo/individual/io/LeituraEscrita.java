package br.com.poo.individual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.poo.individual.enums.CarroPessoaEnum;
import br.com.poo.individual.carro.Carro;
import br.com.poo.individual.pessoa.Pessoa;

public class LeituraEscrita {

	static final String PATH_BASICO = ".\\temp\\";
	static final String EXTENSAO = ".txt";

	// metodo para ler o txt
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");
				if (dados[0].equalsIgnoreCase(CarroPessoaEnum.CARRO.getTipo())) {
					Carro c = new Carro(Integer.parseInt(dados[1]), dados[2]);
					Carro.mapaCarro.put(Integer.parseInt(dados[1]), c);
				} else if (dados[0].equalsIgnoreCase(CarroPessoaEnum.PESSOA.getTipo())) {
					Pessoa p = new Pessoa(Integer.parseInt(dados[1]), dados[2], Integer.parseInt(dados[3]));
					Pessoa.mapaPessoa.put(Integer.parseInt(dados[1]), p);
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	// metodo para imprimir um relatorio em um novo txt
	public static void relatorioProprietarioCarro(Carro carro, List<Pessoa> pessoa) throws IOException {
		String nomeArquivo = "Relatorio de consulta";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));
		buffWrite.append("*************** Relatório **************\n");
		buffWrite.append(carro.getModelo() + ":\n\n");
		if (!pessoa.isEmpty()) {
			for (Pessoa p : pessoa) {
				buffWrite.append(" - Esse é o proprietário do veículo: " + p.getNomePessoa() + "\n");
			}
		} else {
			buffWrite.append("Essa pessoa não tem um carro!!\n");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		buffWrite.append("\nData da programação: " + sdf.format(date) + "\n");
		buffWrite.append("************* Fim Relatório ************\n");
		buffWrite.close();
	}

}
