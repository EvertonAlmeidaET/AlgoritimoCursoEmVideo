package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class CorrigindoProvasVetor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] gabaritoVetor = new String[5];
		String gabarito = "";
		String[] nomeAluno = new String[3];
		String[] notaProva = new String[15];
		String nome = "";
		Double[] notaAluno = new Double[3];
		Double mediaTuma = 0.0;
		Double[] mediaNaoCalculada = new Double[15];
		Integer contador = 0;
		
		System.out.println("PASSO 1 - CADASTRO DE GABARITO");
		System.out.println("------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.printf("Questão %d: ", (i+1));
			gabarito = in.next();
			gabaritoVetor[i] = gabarito.toUpperCase();
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		for(int j = 0; j < 3; j++) {
			System.out.println("---------------------------");
			System.out.printf("ALUNO %d\n", (j+1));
			System.out.println("---------------------------");
			System.out.print("Nome: ");
			nome = in.next();
			nomeAluno[j] = nome.toUpperCase();
			System.out.println("RESPOSTAS DADAS");
			for(int k = 0; k < 5; k++) {
				System.out.printf("Questão %d: ", (k+1));
				gabarito = in.next();
				notaProva[contador] = gabarito.toUpperCase();
				contador++;
			}
		}
		
		contador = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if(gabaritoVetor[j].equalsIgnoreCase(notaProva[contador])) {
					mediaNaoCalculada[contador] = 2.0;
				} else {
					mediaNaoCalculada[contador] = 0.0;
				}
				contador++;
			}
			
		}
		
		contador = 0;
		for(int j = 0; j < 3; j++) {
			Double media = 0.0;
			for (int i = 0; i < 5; i++) {
				if(mediaNaoCalculada[contador].equals(2.0)) {
					media += mediaNaoCalculada[contador];
				}
				contador++;
			}
			notaAluno[j] = (media);
		}
		
		System.out.println("NOTAS FINAIS");
		System.out.println("---------------------------");
		for(int i = 0; i < 3; i++) {
			System.out.println(nomeAluno[i] + " " + notaAluno[i]);
		}
		
		System.out.println("---------------------------");
		for (int i = 0; i < 3; i++) {
			mediaTuma += notaAluno[i];
		}
	
		System.out.println("Media da tuma: " + (String.format("%.2f", (mediaTuma/3))));	
		in.close();
	}
}
