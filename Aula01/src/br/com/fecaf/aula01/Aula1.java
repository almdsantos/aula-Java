package br.com.fecaf.aula01;

import java.util.Scanner;

public class Aula1 {
	//Criando uma variavel para armazenar o nome do usuário.
	

	//Método
	public static void main(String[] args) {
		
		String nome = null;
		
		//Serve para exibir uma informação na tela
		System.out.println("Testando o Java");

		//Instanciar uma classe
		//System.in -> Pedir uma entrada de informação via sistema
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Favor digitar o seu nome:");
		nome = entradaDados.next();
		
		System.out.println("Bem vindo ao meu sistema," + nome);
	}

}