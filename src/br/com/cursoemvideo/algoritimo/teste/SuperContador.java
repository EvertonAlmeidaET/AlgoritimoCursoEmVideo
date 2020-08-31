package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;


public class SuperContador {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer opcao = 0;
		Integer cont = 0;
		
		do {
			
			System.out.println("=====================");
			System.out.println("         MENU        ");
			System.out.println("=====================");
			System.out.println("|   [1] De 1 a 10   |");
			System.out.println("|   [2] De 10 a 1   |");
			System.out.println("|   [3] Sair        |");
			System.out.println("=====================");
			System.out.printf("");
			opcao = in.nextInt();
			
			switch(opcao) {
				case 1:
					cont = 1;
					while(cont <= 10) {
						System.out.printf("%d.. ", cont);
						cont++;
					}
				break;
				case 2:
					cont = 10;
					while(cont >= 1) {
						System.out.printf("%d.. ", cont);
						cont--;
					}
				break;
				default:
				break;
			}
			System.out.println();
			cont = 0;
		} while(opcao != 3);
		System.out.print("FIM");
		in.close();
		
	}

}
