
/*O programa “Hera” irá imprimir a soma das idades de todos os colegas da
sua equipe (6 pessoas). Pergunte a cada um a idade e não esqueça a sua!
Depois faça a atribuição direta da expressão em uma variável inteira.
Exemplo:
Qual é a idade do colega 1? 20
Qual é a idade do colega 2? 24
Qual é a idade do colega 3? 27
Qual é a idade do colega 4? 30
Qual é a idade do colega 5? 18
Qual é a minha idade? 44
O tempo de vida meu e dos meus colegas é 163.*/

package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		// declarando as variaveis
		int soma;
		int id1, id2, id3, id4, id5, id6;

		// importando biblioteca scanner para leitura
		Scanner sc = new Scanner(System.in);

		// escrevendo as perguntas das idades
		System.out.print("Digite a idade do 1º colega: ");

		// lendo as idades
		id1 = sc.nextInt();
		
		pular();

		System.out.print("Digite a idade do 2º colega: ");
		id2 = sc.nextInt();
		pular();

		System.out.print("Digite a idade do 3º colega: ");
		id3 = sc.nextInt();
		pular();
		
		System.out.print("Digite a idade do 4º colega: ");
		id4 = sc.nextInt();
		pular();
		
		System.out.print("Digite a idade do 5º colega: ");
		id5 = sc.nextInt();
		pular();
		
		System.out.print("Digite a sua idade: ");
		id6 = sc.nextInt();
		pular();
		
		sc.close();

		soma = id1 + id2 + id3 + id4 + id5 + id6;

		System.out.print("O tempo de vida seu e dos seu colegas é: " + soma);

	}

	// metodo para pular linha
	public static void pular(){
		for (int i = 1; i < 2; i++) {
			System.out.println();
		}
	}
}
