package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ListagemTurmaVetor {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] nome = new String[4];
		Double[] nota1 = new Double[4];
		Double[] nota2 = new Double[4];
		Double[] media = new Double[4];
		Double somaMedia = 0.0;
		Double mediaDaTurma = 0.0;
		String notas = "";
		Integer totalAcimaDaMedia = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Aluno " + (i+1) + "º ");
			System.out.print("Nome: ");
			nome[i] = in.next();
			System.out.print((i+1) + "º Nota: ");
			notas = in.next();
			nota1[i] = Double.valueOf(notas.replace(",", "."));
			System.out.print((i+2) + "º Nota: ");
			notas = in.next();
			nota2[i] = Double.valueOf(notas.replace(",", "."));
			media[i] = ((nota1[i] + nota2[i]) / 2);
			somaMedia += media[i];
			System.out.println("----------------------");
		}
		
		mediaDaTurma = (somaMedia/4);
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("LISTAGEM DE ALUNOS");
		System.out.println("------------------------");
		for (int i = 0; i < 4; i++) {
			System.out.printf("[Nome: %s ficou com media %.2f]\n", nome[i], media[i]);
			if(media[i] > mediaDaTurma) {
				totalAcimaDaMedia++;
			}
		}
		
		System.out.println("Ao todo temos " + totalAcimaDaMedia + " alunos acima da media da turma que é " + String.format("%.2f", mediaDaTurma));
		
		
		in.close();
	}

}
