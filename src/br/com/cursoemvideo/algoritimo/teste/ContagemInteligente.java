package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ContagemInteligente {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer inicio = 0;
		Integer fim = 0;
		
		System.out.println("------------------------");
		System.out.println("CONTAGEM INTELIGENTE");
		System.out.println("------------------------");
		
		System.out.printf("Inicio ");
		inicio = in.nextInt();
		System.out.printf("Fim ");
		fim = in.nextInt();
		
		System.out.println("------------------------");
		System.out.println("        CONTANDO        ");
		System.out.println("------------------------");
		if(fim.equals(0)) {
			while(inicio >= 0) {
				System.out.printf("%d.. ", inicio);
				inicio--;
			}
		} else {
			while(inicio <= fim) {
				System.out.printf("%d.. ", inicio);
				inicio++;
			}
		}
		
		
		in.close();
	}
}
