package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer cont = 1;
		Integer nTabuada = 0;
		Integer multiValor = 0;
		
		System.out.println("Digite um numero que deseja conta na tabudada: ");
		nTabuada = in.nextInt();
		
		do {
			multiValor = (nTabuada * cont);
			System.out.printf("%d x %d = %d \n", nTabuada, cont, multiValor);
			cont++;
		}while(cont != 11);
		
		in.close();
		
	}

}
