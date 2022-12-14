package br.com.fecaf.media;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		/*Tipo de variaveis
		 * String 			- representa a entrada de texto
		 * Integer  		- representa a entrada de numeros positivos e negativos
		 * Float 			- representa a entrada de numros positivose negativos com casas 
		 * 						decimais
		 * Boolean  		- representa a entrada de dados true / false
		 * Char 			- representa a entrada de texto (Quantidade de caracteres menor)
		 * Double / Decimal - representa a entrada de numeros positivos e negativos com casas decimais 
		 * 						(Qtde de numeros muito maior)
		 */
		
		//Formas de declarar variaveis
		//float valor1, valor2, valor3;
		//var valor1 = "1.0";
		
		float valor1;
		float valor2;
		float valor3;
		float valor4;
		float media;
		
	    //Instancia de classe
		Scanner entradaDados = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		
		//Entrada de dados pelo usuário
	    System.out.println("\nFavor digitar a primeira nota \n");
	    valor1 = entradaDados.nextFloat();
	    
	    System.out.println("\nFavor digitar a segunda nota \n");
	    valor2 = entradaDados.nextFloat();

	    System.out.println("\nFavor digitar a terceira nota \n");
	    valor3 = entradaDados.nextFloat();

	    System.out.println("\nFavor digitar a quarta nota \n");
	    valor4 = entradaDados.nextFloat();
	    
	    //Calculo da Média
	    media = (valor1 + valor2 + valor3 + valor4) / 4;
	    
	    System.out.println("Sua nota é: " + numberFormat.format(media));
	}

}
