package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer n = 0;
		Integer cont = 0;
		Integer fatorial = 1;
		String resp = "S";
		
		do {
			System.out.printf("Qual o numero deseja fazer o fatorial: ");
			n = in.nextInt();
			cont = n;
			do {
				
	//			System.out.printf("%d x ", cont);
				fatorial*=cont;
				cont--;
				
			}while(cont >= 1);
			System.out.println("O valor do fatorial de " + n + " é igual a " + fatorial);
			System.out.printf("Quer continuar? [S/N] ");
			resp = in.next();
		}while(resp.equalsIgnoreCase("S"));
		
		System.out.println("FIM");
		
		in.close();
	}

}
