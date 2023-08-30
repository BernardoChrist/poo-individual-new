package br.com.poo.lista1;

//lista de biblioteca
import java.util.Scanner;

public class Exercicio1 {

	// funcao inicio do portugol
	// funcao no portugol -> metodo no java
	public static void main(String[] args) {

		// declarando as variaveis
		String nome;
		String sobrenome;

		// INSTANCIA importando a biblioteca de scanner(deixar o mouse em cima para importar) 
		Scanner sc = new Scanner(System.in);

		// funcao escreva do portugol(SYSO)
		System.out.println("Por favor, informe se nome: ");
		nome = sc.next();

		//chamando a funcao limpa()
		limpa();
		
		// funcao escreva do portugol(SYSO)
		System.out.println("Agora informe seu sobrenome: ");
		sobrenome = sc.next();

		sc.close();

		limpa();
		
		// funcao escreva do portugol(SYSO)
		System.out.println("Seja bem-vindo(a) " + nome + " " + sobrenome);
	}

	//criando um metodo(funcao), com o for, para 'limpar' o console
	public static void limpa() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
}
