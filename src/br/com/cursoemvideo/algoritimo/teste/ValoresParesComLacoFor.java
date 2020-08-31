package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ValoresParesComLacoFor {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer valorDigitado = 0;
		
		System.out.print("Digite um valor: ");
		valorDigitado = in.nextInt();
		
		for(int cont = 0; cont <= valorDigitado; cont++) {
			if((cont % 2) == 0) {
				System.out.println(cont);
			}
		}
		
		System.out.println("=============");
		System.out.println("CONTAGEM REGRESSIVA");
		if((valorDigitado % 2) == 1) {
			valorDigitado--;
		}
		for(int cont = valorDigitado; cont >= 0; cont--) {
			if((cont % 2) == 0) {
				System.out.println(cont);
			}
		}
		
		in.close();
	}

}
