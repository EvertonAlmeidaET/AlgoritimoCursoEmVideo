package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class FazSomaProcedimento {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer a = 0;
		Integer b = 0;
		
		System.out.print("Digite um valor: ");
		a = in.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = in.nextInt();
		System.out.println(soma(a, b));
		
		in.close();
		
	}
	
	public static String soma(Integer a, Integer b) {
		Integer a1 = a;
		Integer b1 = b;
		Integer soma = (a1 + b1);
		return String.format("Recebi o valor 1º %d\nRecebi o valor 2º %d\nA soma entre os dois é %d", a1, b1, soma);
	}

}
