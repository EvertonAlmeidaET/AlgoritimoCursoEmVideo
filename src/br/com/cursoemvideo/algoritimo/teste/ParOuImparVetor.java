package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ParOuImparVetor {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer[] vetor = new Integer[7];
		Integer totalPares = 0;
		Integer totalImpar = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i+1) + "º valor: ");
			vetor[i] = in.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if((vetor[i] % 2) == 0) {
				System.out.println("O valor par na posição " + i);
				totalPares++;
			}  else {
				totalImpar++;
			}
		}
		System.out.println("==========================");
		System.out.printf("O total de pares foi de %d\n", totalPares);
		System.out.printf("O total de impares foi de %d", totalImpar);
		in.close();
	}

}
