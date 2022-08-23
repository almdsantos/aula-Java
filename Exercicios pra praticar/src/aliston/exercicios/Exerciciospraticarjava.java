5package aliston.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerciciospraticarjava {

	public static void main(String[] args) {
		/*Ideia do projeto
		 * Fazer um calculo simples de média.
		 * O detalhe é que o sistema tem que contar a quantidade de valores
		 * para calcular		 * 
		 * */
		
		//Declaração de variaveis
		int total;
		int cont = 1;
		float nota = 0;
		float soma = 0;
		float media;
		
		//Instancia de classe
		Scanner entradaDados = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("#.00");
				
		//Solicitação de entrada		
		System.out.println("\nQual a quantidade de alunos?");
		total = entradaDados.nextInt();
		
		while (cont <= total) {
			System.out.println("\nInforme a nota " + cont);
				//if (nota >= 0.0 && nota <= 10.0) {
			nota = entradaDados.nextInt();
				//} else { 
					//System.out.println("Você digitou uma nota incorretamente");
				//}
			soma = soma + nota;
			cont++;
		}
		
		media = soma / total;
		
		
		//Saida
		System.out.println("A média da sua classe é" + media);
				
		
	}

}
