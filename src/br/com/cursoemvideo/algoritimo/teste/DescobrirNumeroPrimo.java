package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class DescobrirNumeroPrimo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer nDigitado = 0;
		Integer cont = 1;
		Integer contDivi = 0;
		
		System.out.print("Digite um numero: ");
		nDigitado = in.nextInt();
		
		do {
//			System.out.printf("%d ", cont);
			if((nDigitado % cont) == 0) {
				contDivi++;
			}
			cont++;
		}while(cont <= nDigitado);
		
		if(contDivi > 2) {
			System.out.println("O valor " + nDigitado + " não é primo!");
		}else {
			System.out.println("O valor " + nDigitado + " é primo!");
		}
		
		
		in.close();
		
	}

}
