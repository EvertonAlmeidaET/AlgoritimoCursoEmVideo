package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ParOuImparProcedimento {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer valor = 0;
		
		System.out.print("Digite um número: ");
		valor = in.nextInt();
		System.out.println(parOuImpar(valor));
		
		
		in.close();
	}

	private static String parOuImpar(Integer valor) {
		String escreval = "O número %d é ";
		if((valor % 2) == 0){
			return String.format(escreval + "Par", valor);
		} else {
			return String.format(escreval + "Impar", valor);
		}
	}

}
