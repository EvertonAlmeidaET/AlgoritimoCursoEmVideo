package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ContaNegativos {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer n = 0;
		Integer c = 1;
		Integer totN = 0;
		
		do {
			System.out.printf("Digite um numero: ");
			n = in.nextInt();
			if(n < 0) {
				totN++;
			}
			c++;
		}while(c != 5);
		
		System.out.println("Foram digitados " + totN + " valores negativos.");
		
		in.close();
	}

}
