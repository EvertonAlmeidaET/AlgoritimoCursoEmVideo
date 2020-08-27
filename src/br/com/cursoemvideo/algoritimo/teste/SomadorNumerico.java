package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class SomadorNumerico {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Integer cont = 1;
		Integer n = 0;
		Integer soma = 0;
		Integer maior = 0;
		
		while(cont <= 5) {
			System.out.printf("Digite o %dº valor ", cont);
			n = in.nextInt();
			if(n > maior) {
				maior = n;
			}
			soma += n;
			cont++;
		}
		
		System.out.printf("A soma de todos os valores é %d \n", soma);
		System.out.printf("O maior valor digitado foi %d", maior );
		in.close();
	}

}
