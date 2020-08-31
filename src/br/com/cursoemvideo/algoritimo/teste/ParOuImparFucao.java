package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ParOuImparFucao {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer valor = 0;
		String result = "";
		ParOuImparFucao parOuImparFucao = new ParOuImparFucao();
		
		System.out.print("Digite um numero: ");
		valor = in.nextInt();
		result = parOuImparFucao.parOuImpar(valor);
		System.out.println("O numero " + valor + " é um valor " + result);
		
		
		in.close();
	}

	private String parOuImpar(Integer valor) {
		if((valor % 2) == 0) {
			return "PAR";
		} else {
			return "IMPAR";
		}
	}

}
