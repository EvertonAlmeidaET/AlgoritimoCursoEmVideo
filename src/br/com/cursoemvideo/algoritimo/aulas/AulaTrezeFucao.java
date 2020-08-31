package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaTrezeFucao {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer n1 = null;
		Integer n2 = null;
		AulaTrezeFucao somaFucao = new AulaTrezeFucao();
		
		for(int i = 0; i <= 1; i++) {
			System.out.printf("Digite o %dº valor ", i+1);
			Integer valor = in.nextInt();
			if(n1 == null) {
				n1 = valor;
			}
				n2 = valor;
		}
		
		System.out.println("A soma entre " + n1 + " + " + n2 + " é igual a " + somaFucao.soma(n1, n2));
		
		
		in.close();
	}
	
	public Integer soma(Integer valor1, Integer valor2) {
		return (valor1 + valor2);
	}

}
