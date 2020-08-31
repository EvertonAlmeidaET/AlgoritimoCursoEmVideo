package br.com.cursoemvideo.algoritimo.teste;

public class ContaDeUmAteDezComTodasEstruturaDeRepeticao {
	
	public static void main(String[] args) {
		
		Integer a = 1;
		Integer b = 1;
		
		System.out.println("================");
		System.out.println("PRIMEIRO LAÇO DE REPETIÇÃO - WHILE");
		//Primeiro laço de repetição.
		while(a <= 10) {
			System.out.print(a + "... ");
			a++;
		}
		System.out.println();
		System.out.println("================");
		System.out.println("SEGUNDO LAÇO DE REPETIÇÃO - DO WHILE");
		//Segundo laco de repetição.
		do {
			System.out.print(b + "... ");
			b++;
			
		}while(b <= 10);
		
		System.out.println();
		System.out.println("=================");
		System.out.println("TERCEIRO LAÇO DE REPETIÇÃO - FOR");
		//Terceiro e laço de repetição
		for(int c = 1; c <= 10; c++) {
			System.out.print(c + "... ");
		}
		
	}

}
