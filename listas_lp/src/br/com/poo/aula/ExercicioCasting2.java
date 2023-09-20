/*Declare dois caracteres : ‘A’ e ‘Z’, depois realize sua soma
e armazene em uma variável do tipo int.*/

//Analisar os erros: int A e int B, pode ?

package br.com.poo.aula;

public class ExercicioCasting2 {

	public static void main(String[] args) {
		
		char letra1 = 'A';
		char letra2 = 'Z';
		int soma; 			/*= letra1 + letra2;*/
		
		int x = letra1;
		int y = letra2;
		
		soma = x + y;
		
		System.out.print("Soma: "+soma+ "\nvalor de A é "+x+" valor de Z é "+y);
		
	}

}
