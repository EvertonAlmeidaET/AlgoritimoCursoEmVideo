package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class AniversarioDaCreuza {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer anoAtual = 0;
		Integer anoNascimento = 0;
		Integer idade = 0;
		
		System.out.print("Em que anos nos estamos? ");
		anoAtual = in.nextInt();
		System.out.print("Em que ano eu Nasci? ");
		anoNascimento = in.nextInt();
		idade = (anoAtual - anoNascimento);
		
		System.out.println("Minha idade será: " + idade);
		
		in.close();
	}

}
