package br.com.fecaf.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*
		 * */
		
		//Declaração de Variáveis
		float valor1, valor2;
		double resultado = 0;
		String operacao;
		
		//instanciar as classes
		Scanner entradaDados = new Scanner(System.in);
		
		//Entrada de dados pelo usuário
		System.out.println("Digital o primeiro valor");
		valor1 = entradaDados.nextFloat();
		
		System.out.println("Digital o segundo valor");
		valor2 = entradaDados.nextFloat();
		
		System.out.println("Escolha a operação a ser calculada: "
				+ "\n [Somar | Subtrair | Multiplicar | Dividir]");
		operacao = entradaDados.next();
		
		/* Operadores de Comparação
		 * ==	(Compração de igualdade)
		 * != 	(Comparação de não igualdade)
		 * > 	(Comparação de valor maior)
		 * < 	(Comparação de valor menor)
		 * >= 	(Comparação de valor maior ou igual)
		 * <= 	(Comparação de valor menor ou igual)
		 * ===	(Comparação de conteudo igual e tipo de dados igual das variaveis)
		 * !==	(Comparação de conteudo diferente e tipo de dados igual das variaveis)
		 * 
		 * Observação:
		 * Se a comparação for realizdo por uma variavel do tipo String não sera permitido
		 * usar o ==, deveremos utilizar o metodo equals()
		 * */
		
		if (operacao.equals("Somar")) 
			resultado = valor1 + valor2;
		else if (operacao.equals("Subtrair")) 
			resultado = valor1 - valor2;
		else if (operacao.equals("Multiplicar")) 
			resultado = valor1 * valor2;
		else if (operacao.equals("Dividir"))
			resultado = valor1 / valor2;
		
		System.out.println("O resultado é" + resultado);
		
		}
}