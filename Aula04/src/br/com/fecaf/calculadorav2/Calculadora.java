package br.com.fecaf.calculadorav2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		//Declaração de Variáveis
		float valor1, valor2;
		double resultado = 0;
		String operacao;
		boolean erro = false;
		
		//instanciar as classes
		Scanner entradaDados = new Scanner(System.in);
		
		//Entrada de dados pelo usuário
		System.out.println("Digital o primeiro valor");
		valor1 = entradaDados.nextFloat();
		
		System.out.println("Digital o segundo valor");
		valor2 = entradaDados.nextFloat();
		
		System.out.println("Escolha a operação a ser calculada: "
				+ "\n [Somar | Subtrair | Multiplicar | Dividir]");
		operacao = entradaDados.next().toUpperCase();
		
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
		
		/*if (operacao.equals("SOMAR") || operacao.equals("+")) 
			resultado = valor1 + valor2;
		else if (operacao.equals("SUBTRAIR")|| operacao.equals("-")) 
			resultado = valor1 - valor2;
		else if (operacao.equals("MULTIPLICAR") || operacao.equals("*")) 
			resultado = valor1 * valor2;
		else if (operacao.equals("DIVIDIR") || operacao.equals("/"))
			resultado = valor1 / valor2;
		else {
			System.out.println("Você digitou uma operação inválida");
			erro = true;
		}
		
	*/
		switch (operacao) {
		case "SOMAR", "+": 
			resultado = valor1 + valor2;
			break;
		case "SUBTRAIR", "-":
			resultado = valor1 - valor2;
			break;
		case "MULTIPLICAR", "*":
			resultado = valor1 * valor2;
			break;
		case "DIVIDIR", "/":
			resultado = valor1 / valor2;
			break;
		default:
			System.out.println("Você digitou uma operação inválida");
			erro = true;
			break;
		}
		
		if (!erro)
			System.out.println("O resultado é" + resultado);
		
		}
}