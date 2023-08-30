/*Escreva um programa que receba do teclado dois números separadamente e escreva na
tela a soma deles, como no exemplo abaixo:
Exemplo:
Entrada:
Digite o primeiro número: 5
Digite o segundo número: 10
Saída:
A soma dos números é igual a 15.
*/


package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		//declarando as variaveis
		float n1;
		float n2;
		float soma;
		
		//importando biblioteca/instancia scanner para leitura
		Scanner sc = new Scanner(System.in);
		
		//escrevendo na tela
		System.out.print("Digite o 1º número: ");
		
		//fazendo a leitura de n1
		n1 = sc.nextFloat();
		
		//chamando a funcao limpa
		limpa();
		
		//escrevendo na tela
		System.out.print("Digite o 2º número: ");
		
		//fazendo a leitura de n2
		n2 = sc.nextFloat();
		
		//fechando o scanner
		sc.close();
		
		//fazendo a soma
		soma = n1 + n2;
		
		//chmando a funcao limpa
		limpa();
		
		//escrevendo a soma de n1 e n2
		System.out.println("A soma dos números é " + soma);

	}

	public static void limpa() {
		for(int i = 1; i < 20; i++) {
			System.out.println();
		}
	}
}
