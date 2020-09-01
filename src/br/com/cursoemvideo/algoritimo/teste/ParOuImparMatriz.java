package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ParOuImparMatriz {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Integer[][] parOuImpar = new Integer[3][3];
		Integer totalPar = 0;
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("Digite o valor da posição [" + l + "," + c + "]: ");
				parOuImpar[l][c] = in.nextInt();
			}
		}
		
		System.out.println("=========================");
		System.out.println("  RESULTADO  ");
		System.out.println("=========================");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				
				if((parOuImpar[l][c] % 2) == 0) {
					System.out.print(" [" + parOuImpar[l][c] + "] ");
					totalPar++;
				} else {
					System.out.print(" " + parOuImpar[l][c] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		System.out.printf("Ao todo foram digitados %d valores pares", totalPar);
		
		in.close();
	}

}
