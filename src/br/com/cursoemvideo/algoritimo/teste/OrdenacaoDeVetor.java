package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class OrdenacaoDeVetor {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Integer[] vetor = new Integer[10];
		Integer aux = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "º valor: ");
			vetor[i] = in.nextInt();
		}
		
		for (int i = 0; i < 9; i++) {
			for(int j = (i+1); j < 10; j++) {
				if(vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + vetor[i] + "]");
		}
		
		in.close();
	}

}
