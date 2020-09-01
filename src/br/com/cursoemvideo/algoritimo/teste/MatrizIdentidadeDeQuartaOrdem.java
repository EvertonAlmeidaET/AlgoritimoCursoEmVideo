package br.com.cursoemvideo.algoritimo.teste;

import java.util.Random;
import java.util.Scanner;

public class MatrizIdentidadeDeQuartaOrdem {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer[][] maIDQuarOrdem = new Integer[4][4];
		Random aleatorio = new Random();
		Integer somaDiagonalPrincipal = 0;
		Integer produtoSegundaLinha = 1;
		Integer maiorValorTeceiraColuna = 0;
		
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
//				System.out.println("Digite o valor da posição [" + l + "," + c + "]: ");
//				maIDQuarOrdem[l][c] = in.nextInt();
				maIDQuarOrdem[l][c] = aleatorio.nextInt(20);
				if(l == c) {
					somaDiagonalPrincipal+= maIDQuarOrdem[l][c];
				}
			}
		}
		
		for (int l = 0; l < 4; l++) {
			produtoSegundaLinha *= maIDQuarOrdem[1][l];
		}
		
		for (int c = 0; c < 4; c++) {
			if(maIDQuarOrdem[c][2] > maiorValorTeceiraColuna) {
				maiorValorTeceiraColuna = maIDQuarOrdem[c][2];
			}
		}
		
		System.out.println("==================");
		System.out.println("  RESULTADO  ");
		System.out.println("==================");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" [ " + maIDQuarOrdem[i][j] + " ] ");
			}
			System.out.println();
		}
		
		System.out.printf("A soma dos valores da DIAGONAL PRINCIPAL é %d\n", somaDiagonalPrincipal);
		System.out.printf("O produto dos valores da segunda linha é %d\n", produtoSegundaLinha);
		System.out.printf("O maior valor da terceira coluna é %d", maiorValorTeceiraColuna);
		in.close();
	}

}
