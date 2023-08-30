/*Escreva um programa que receba do teclado seu nome e seu sobrenome separadamente e
escreva na tela seu nome completo, como no exemplo abaixo:
Entrada:
Digite seu nome: Fulano
Digite seu sobrenome: de Tal 
Saída:
Meu nome é Fulano de Tal!
*/

package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		// declarando as variaveis
		String nome;
		String sobrenome;

		// importar a biblioteca/instancia scanner para fazer a leitura
		Scanner sc = new Scanner(System.in);

		// escrevendo na tela
		System.out.print("Digite seu nome: ");

		// lendo a variavel nome
		nome = sc.nextLine();

		// chamando a funcao limpa
		limpa();

		// escrevendo na tela
		System.out.print("Digite seu sobrenome: ");

		// lendo a variavel sobrenome
		sobrenome = sc.nextLine();

		// chamando a funcao limpa
		limpa();

		// fechando o scanner, sempre que acabar de realizar as leituras
		sc.close();

		// escrevendo o nome completo
		System.out.println("Meu nome é " + nome + " " + sobrenome);
	}

	// utilizar uma funcao para pular linha/limpar
	public static void limpa() {
		for (int i = 1; i < 20; i++) {
			System.out.println();
		}
	}
}
