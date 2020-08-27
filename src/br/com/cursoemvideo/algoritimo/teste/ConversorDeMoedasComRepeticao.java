package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ConversorDeMoedasComRepeticao {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Double valorReais = 0.0;
		String valorReaisString = "0.0";
		Double valorConvetidoDola = 0.0;
		Double valorDolaAtualmente = 5.56;
		Integer cont = 1;
		Integer quanTValorCont = 0;
		
		System.out.printf("Quantas vezes você quer converter? ");
		quanTValorCont = in.nextInt();
		
		while(cont <= quanTValorCont) {
		
			System.out.printf("Qual o valor em R$? ");
			valorReaisString = in.next();
			valorReais = Double.valueOf(valorReaisString.replace(",", "."));
			
			valorConvetidoDola = (valorReais / valorDolaAtualmente);
			System.out.printf("O valor convertido e US$%.3f \n", valorConvetidoDola);
			cont++;
		}
		
		in.close();
		
	}

}
