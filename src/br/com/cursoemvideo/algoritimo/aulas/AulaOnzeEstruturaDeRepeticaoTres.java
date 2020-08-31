package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaOnzeEstruturaDeRepeticaoTres {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("CONTANDO DE 1 ATÉ 10");
		for(int a = 1; a <= 10; a++) {
			System.out.print(a + "... ");
		}
		
		System.out.println();
		System.out.println("CONTANDO DE 1 ATÉ 10 PULANDO DE 2 EM 2");
		for(int a = 1; a <= 10; a+=2) {
			System.out.print(a + "... ");
		}
		
		System.out.println();
		System.out.println("CONTANDO DE 10 ATÉ 1");
		for(int a = 10; a >= 1; a--) {
			System.out.print(a + "... ");
		}
		
		
		in.close();
	}

}
