package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer n = 0;
		Boolean result = Boolean.FALSE;
		
		System.out.printf("Digite um numero qualquer: ");
		n = in.nextInt();
		result = ((n % 2) == 0);
		
		if(result){
			System.out.printf("O número %d é PAR", n);
		} else {
			System.out.printf("O número %d é IMPAR", n);
		}
		
		in.close();
		
	}
}
