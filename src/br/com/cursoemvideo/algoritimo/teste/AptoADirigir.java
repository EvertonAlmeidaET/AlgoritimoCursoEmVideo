package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class AptoADirigir {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer anoAtual = 0;
		Integer anoNasc = 0;
		Integer idade = 0;
		
		System.out.println("--------------------------------------");
		System.out.println("DEPARTAMENTO DE TRANSITO");
		System.out.println("--------------------------------------");
		
		System.out.printf("Ano Atual (yyyy): ");
		anoAtual = in.nextInt();
		System.out.printf("Ano de Nascimento (yyyy): ");
		anoNasc = in.nextInt();
		if(anoAtual < anoNasc) {
			throw new IllegalArgumentException("ANO ATUAL MENOR QUE O ANO DE NASCIMENTO");
		}
		
		idade = (anoAtual - anoNasc);
		
		
		System.out.println("--------------- STATUS ---------------");
		System.out.printf("IDADE: %d ANOS \n", idade);
		if(idade >= 18) {
			System.out.println("APTO A TIRAR CARTEIRA");
		} else {
			System.out.println("INAPTO A TIRAR A CARTEIRA");
		}
		System.out.println("--------------------------------------");
		
		in.close();
		
	}

}
