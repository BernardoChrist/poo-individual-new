/*Declare duas variáveis do tipo int e realize sua soma. Em
seguida, realize o casting destes dois inteiros para double para
realizar sua divisão.*/

//esta com os erros que a professora pediu

package br.com.poo.aula;

public class ExercicioCasting1 {

	public static void main(String[] args) {
		
		int n1, n2;
		int soma;
		double divisao;
		
		n1 = 25;
		n2 = 5;
		soma = n1 + n2;
		divisao = (double)n1 / (double)n2; //ou divisao = ((double)n1/n2);
		
		System.out.print("Soma: "+soma);
		System.out.println();
		System.out.print("Divisão: "+divisao);
	}

}
