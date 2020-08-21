package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ViajemCreuza {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Double valorReais = 0.0;
		Double valorConvetidoDola = 0.0;
		Double valorDolaAtualmente = 5.56;
		
		System.out.printf("Quantos Reias eu tenho? ");
		valorReais = in.nextDouble();		
		valorConvetidoDola = (valorReais / valorDolaAtualmente);
		System.out.printf("Posso ter US$%.3f", valorConvetidoDola);
		
		in.close();
		
	}

}
