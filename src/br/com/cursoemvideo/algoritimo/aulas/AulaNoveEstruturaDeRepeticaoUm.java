package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaNoveEstruturaDeRepeticaoUm {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer contador = 0;
		
		while(contador <= 9) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("TERMINEI DE CONTAR");
		System.out.println("------------------");
		
		while(contador >= 0) {
			System.out.println(contador);
			contador--;
		}
		
		in.close();
	}

}
