package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class SoComLetraCVetor {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] nomeSoC = new String[10];
		Integer totalPessoaComC = 0;
		String nome = "";
		Integer contadorListaNova = 0;
			
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite seu nome: ");
			nome = in.next();
			if(nome.substring(0, 1).equalsIgnoreCase("c")) {
				nomeSoC[i] = nome;
				totalPessoaComC++;
			}
		}
		
		String[] nomeSoCNovo = new String[totalPessoaComC];
		for(int i = 0; i < 10; i++) {
			if((nomeSoC[i] != null)) {
				nomeSoCNovo[contadorListaNova] = nomeSoC[i];
				contadorListaNova++;
			}
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("LISTAGEM FINAL");
		for (int i = 0; i < totalPessoaComC; i++) {
			System.out.println("[" + nomeSoCNovo[i] + "]");
		}
		
		in.close();
	}

}
