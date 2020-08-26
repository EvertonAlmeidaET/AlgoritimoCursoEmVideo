package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class CriancaEsperanca {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer opcao = 0;
		Double valorDoado = 0.0;
		String valorDoadoString = "0.0";
		
		System.out.println("-----------------------------------");
		System.out.println("         CRIANÇA ESPERANÇA         ");
		System.out.println("-----------------------------------");
		System.out.println(" Muito obrigado por ajudar ");
		System.out.println("[1] para doar R$10 | [2] para doar R$25 | [3] para doar 50R$ | [4] para doar outro valores | [5] para cancelar");
		System.out.printf("opção: ");
		opcao = in.nextInt();
		
		switch(opcao) {
			case 1:
				valorDoado = 10.0;
			break;
			case 2:
				valorDoado = 25.0;
			break;
			case 3:
				valorDoado = 50.0;
			break;
			case 4:
				System.out.printf("Informe o valor da doação R$");
				valorDoadoString = in.next();
				valorDoado = Double.valueOf(valorDoadoString.replace(",", "."));
			break;
			case 5:
				valorDoado = 0.0;
			break;
			default:
				System.out.println("VALOR INVALIDO");
			break;
		}
		
		System.out.println("-----------------------------------");
		System.out.printf("SUA DOAÇÃO FOI DE R$%.2f \n", valorDoado);
		System.out.println("MUITO OBRIGADO!");
		System.out.println("-----------------------------------");
		
		in.close();
	}

}
