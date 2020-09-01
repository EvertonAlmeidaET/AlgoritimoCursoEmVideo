package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaQuinzeMatrizes {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer[][] matriz = new Integer[3][2];
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.print("Digite um valor da posição [" + l + "," + c + "]: ");
				matriz[l][c] = in.nextInt();
			}
		}
		
		System.out.println("-------------------------");
		System.out.println("  RESULTADO  ");
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.print("[" + matriz[l][c] + "]");
			}
			System.out.println();
		}
		
		
		in.close();
		
	}
}
