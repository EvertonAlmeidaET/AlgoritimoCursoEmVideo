package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaDezEstruturaDeRepeticaoDois {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String resp = "S";
		Integer n = 0;
		Integer s = 0;
		
//		while(resp.equalsIgnoreCase("S")) {
//			System.out.printf("Digite o valor: " );
//			n = in.nextInt();
//			s += n;
//			System.out.println("Você quer continuar? ");
//			resp = in.next();
//								
//		}
//		System.out.println("A soma de todos os valores digitados é: " + s);
		
		do {
			System.out.printf("Digite o valor: " );
			n = in.nextInt();
			s += n;
			System.out.println("Você quer continuar? [S/N] ");
			resp = in.next();
								
		} while(!resp.equalsIgnoreCase("N"));
		
		
		
		System.out.println("A soma de todos os valores digitados é: " + s);
		
		in.close();
	}

}
