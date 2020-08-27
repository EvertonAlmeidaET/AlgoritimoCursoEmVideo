package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class MelhorAlunoDeUmaTumaComRepeticao {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer cont = 1;
		Integer quantAluno = 0;
		Double maiorNota = 0.0;
		Double nota = 0.0;
		String notaString = "0.0";
		String nomeAluno = "";
		String melhorAluno = "";
		
		System.out.println("----------------------------");
		System.out.println("   ESCOLA SANTA PACIENCIA   ");
		System.out.println("----------------------------");
		
		System.out.printf("Quantos alunos a turma tem? ");
		quantAluno = in.nextInt();
		
		while(quantAluno >= cont) {
		
			System.out.println("--------------");
			System.out.println("Aluno " + cont + "º");
			System.out.printf("Nome do Aluno: ");
			nomeAluno = in.next();
			System.out.printf("Nota de %s: ", nomeAluno);
			notaString = in.next();
			nota = Double.valueOf(notaString.replace(",", "."));
			
			if(nota > maiorNota) {
				maiorNota = nota;
				melhorAluno = nomeAluno;
			}
			cont++;
		
		}
		
		System.out.println("-------------------------");
		System.out.println("O melhor aproveitamento foi de " + melhorAluno + " com a nota " + maiorNota);
		
		in.close();
	}

}
