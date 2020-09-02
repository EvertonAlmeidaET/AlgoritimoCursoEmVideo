package br.com.cursoemvideo.algoritimo.teste;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class DissecandoMatrizes {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner in = new Scanner(System.in);
		
		Integer[][] matrizQuartaOrdem = new Integer[4][4];
		Random aleatorio = new Random();
		Integer opcao = 0;
		String continuar = "S";
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
//				System.out.print("Digite o valor na posição [" + i + "," + j + "]: " );
//				matrizQuartaOrdem[i][j] = in.nextInt();
				matrizQuartaOrdem[i][j] = aleatorio.nextInt(9);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" ["  + matrizQuartaOrdem[i][j] + "] ");
			}
			System.out.println();
		}
		
		do {
						
			System.out.println("===========================");
			System.out.println("       MENU DE OPÇÃO      ");
			System.out.println("===========================");
			System.out.println("[1] Mostra a Matriz");
			System.out.println("[2] Diagonal Principal");
			System.out.println("[3] Triangulo Superior");
			System.out.println("[4] Triangulo Inferior");
			System.out.println("[5] Sair");
			System.out.print("========== OPÇÃO: ");
			opcao = in.nextInt();
			
			switch(opcao) {
				// MOSTRA MATRIZ INTEIRA
				case 1:
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							System.out.print(" ["  + matrizQuartaOrdem[i][j] + "] ");
						}
						System.out.println();
					}
				break;
				// MOSTRA A DIAGONAL PRINCIPAL DA MATRIZ
				case 2:
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							if(i == j) {
								System.out.print(" ["  + matrizQuartaOrdem[i][j] + "]\n");
							}
						}
						for (int j = i; j >= 0; j--) {
							System.out.print("\t");
						}
						
					
					}
				break;
				// MOSTRA O TRIANGULO SUPERIOR
				case 3:
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							if (j < i) {
								System.out.print("    ");
							} else if(i != j){
								System.out.print(" ["  + matrizQuartaOrdem[i][j] + "]");
							}
						}
						System.out.println();
					}
				break;
				// MOSTRA O TRIANGULO INFERIOR
				case 4: 
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							if (j > i) {
								System.out.print(" ");
							} else if(i != j){
								System.out.print(" ["  + matrizQuartaOrdem[i][j] + "]");
							}
						}
						System.out.println();
					}
				break;
				case 5:
					System.out.println("ENCERRANDO....");
					continuar = "N";
				break;
				default:
					System.out.println("VALOR INVALIDO");
				break;
			}
			System.out.println("");
		}while(continuar.equalsIgnoreCase("S"));
		
		in.close();
	}

}
