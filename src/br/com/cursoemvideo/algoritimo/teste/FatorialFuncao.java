package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class FatorialFuncao {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		FatorialFuncao calculoFatorial = new FatorialFuncao();
		Integer valor = 0;
		Integer result = 0;
		
		System.out.print("Digite um numero: ");
		valor = in.nextInt();
		result = calculoFatorial.fatorial(valor);
		System.out.println("O valor de " + valor + "! é igual a " + result);
		
		in.close();
	}
	
	public Integer fatorial(Integer value) {
		Integer fatorial = 1;
		for(int c = 1; c <= value; c++) {
			fatorial *= c;
		}
		return fatorial;
	}

}
