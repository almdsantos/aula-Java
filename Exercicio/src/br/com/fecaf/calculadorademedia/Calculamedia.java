package br.com.fecaf.calculadorademedia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculamedia {

	public static void main(String[] args) {
		
		//Declaração de Variáveis
		String nomeAluno;
		String nomeProfessor;
		String sexoAluno = "";
		String sexoProfessor = "";
		String nomeCurso;
		String nomeDisciplina;
		float valor1, valor2, valor3, valor4;
		float media;
		String situacao = "";
		float notaExame = 0;
		float mediaExame = 0;
		
		//Instancia de Classe
		Scanner entradaDados = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		//Entrada de Dados
		System.out.println("\nFavor informar a primeira nota\n");
		valor1 = entradaDados.nextFloat();
		
		System.out.println("\nFavor informar a segunda nota\n");
		valor2 = entradaDados.nextFloat();
		
		System.out.println("\nFavor informar a segunda nota\n");
		valor3 = entradaDados.nextFloat();
		
		System.out.println("\nFavor informar a segunda nota\n");
		valor4 = entradaDados.nextFloat();
		
		//Lógica de validação de valores
		if ((valor1 >= 0 && valor1 <= 100) && (valor2 >= 0 && valor2 <= 100) && (valor3 >= 0 && valor3 <= 100)
		&& (valor4 >= 0 && valor4 <= 100)) {
		
		//Entrada do restante dos dados
		
		System.out.println("Nome do Aluno");
		nomeAluno = entradaDados.next();
			
		System.out.println("Nome do Professor");
		nomeProfessor = entradaDados.next();
		
		//Validação do sexo do aluno
		System.out.println("Sexo do Aluno - M / F");
		sexoAluno = entradaDados.next();
				
			if (sexoAluno == "M" || sexoAluno.equals("M")) {
				sexoAluno = ("Aluno");
			}
			else if (sexoAluno == "F" || sexoAluno.equals("F")) {
				sexoAluno = ("Aluna");
			}
			else {
				System.out.println("Você digitou incorretamente");
			}
		
		//Validação do sexo do professor		
		System.out.println("Sexo do Professor - M / F");
		sexoProfessor = entradaDados.next();
			
			if (sexoProfessor == "M" || sexoProfessor.equals("M")) {
				sexoProfessor = ("Professor");
			}
			else if (sexoProfessor == "F" || sexoProfessor.equals("F")) {
				sexoProfessor = ("Professora");
			}
			else {
				System.out.println("Você digitou incorretamente");
		}
			
		System.out.println("Nome do Curso");
		nomeCurso = entradaDados.next();
			
		System.out.println("Nome da Disciplina");
		nomeDisciplina = entradaDados.next();
			
		//Calculo da média
		media = (valor1 + valor2 + valor3 + valor4) / 4;
		if (media >= 70 && media <= 100) {
			situacao = ("Aprovado");			
		} else if (media >= 50 && media <= 69) {
			situacao = ("Exame");
				if (situacao == "Exame") {
					System.out.println("Aluno ficou de exame, favor informar nota do exame");
					notaExame = entradaDados.nextFloat();
					}
				mediaExame = (notaExame + media) / 2;
				if (mediaExame > 0 && mediaExame <= 59)
					situacao = ("Aprovado");
				else if (mediaExame >= 60 && mediaExame <= 100)
					situacao = ("Reprovado");
				
		} else if (media <= 49); {
			situacao = ("Reprovado");
		}
		
		//Calculo da média				
		
				
		//Relatório do Aluno:
		
		System.out.println("O " + sexoAluno + " " + nomeAluno + " foi " + situacao + " na disciplina " + nomeDisciplina);
		System.out.println("Curso " + nomeCurso);
		System.out.println(sexoProfessor + " " + nomeProfessor);
		System.out.println("Notas do Aluno: " + valor1 + "," + valor2+ "," + valor3 + "," + valor4);
		System.out.println("Média Final: " + media);
		System.out.println("Média Final do Exame: " + mediaExame);			
		
		} else {
			System.out.println("Você digitou os valores incorretamente, note: só serão aceito valores de 0 a 100"); 
		}
		
	}

}
