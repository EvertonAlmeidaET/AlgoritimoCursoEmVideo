package br.com.cursoemvideo.algoritimo.teste;

public class ContaDeUmAteDezComTodasEstruturaDeRepeticao {
	
	public static void main(String[] args) {
		
		Integer a = 1;
		Integer b = 1;
		
		System.out.println("================");
		System.out.println("PRIMEIRO LA�O DE REPETI��O - WHILE");
		//Primeiro la�o de repeti��o.
		while(a <= 10) {
			System.out.print(a + "... ");
			a++;
		}
		System.out.println();
		System.out.println("================");
		System.out.println("SEGUNDO LA�O DE REPETI��O - DO WHILE");
		//Segundo laco de repeti��o.
		do {
			System.out.print(b + "... ");
			b++;
			
		}while(b <= 10);
		
		System.out.println();
		System.out.println("=================");
		System.out.println("TERCEIRO LA�O DE REPETI��O - FOR");
		//Terceiro e la�o de repeti��o
		for(int c = 1; c <= 10; c++) {
			System.out.print(c + "... ");
		}
		
	}

}
