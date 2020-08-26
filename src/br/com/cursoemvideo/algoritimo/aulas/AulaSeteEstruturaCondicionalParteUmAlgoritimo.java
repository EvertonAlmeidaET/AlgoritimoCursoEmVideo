package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaSeteEstruturaCondicionalParteUmAlgoritimo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer anoAtual = 0;
		Integer anoNasc = 0;
		Integer idade = 0;
		
		System.out.print("Em que anos estamos? ");
		anoAtual = in.nextInt();
		System.out.printf("Em que ano você nasceu? ");
		anoNasc = in.nextInt();
		idade = (anoAtual - anoNasc);
		
		System.out.printf("Em %d, você terá %d anos", anoAtual, idade);
		
		if(idade >= 21) {
			System.out.println(" e já terá atigindo a maioridade.");
		} 
		
		in.close();
		
	}

}
