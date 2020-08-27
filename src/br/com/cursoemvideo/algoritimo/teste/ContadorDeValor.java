package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ContadorDeValor {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Integer salto = 0;
		Integer valor = 0;
		Integer contador = 0;
		
		System.out.printf("Quer contar até quando? ");
		valor = in.nextInt();
		
		System.out.printf("Qual o valor do salto? ");
		salto = in.nextInt();
		
		while(contador <= valor) {
			System.out.println(contador);
			if(salto.equals(0)) {
				contador++;
			} else {
				contador+= salto;
			}
		}
		
		in.close();
	}

}
