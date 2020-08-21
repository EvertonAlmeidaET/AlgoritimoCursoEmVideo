package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaTresAlgoritimo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
//		String nome;
//		System.out.print("Escreva seu nome: ");
//		nome = in.nextLine();
//		System.out.println("Muito prazer " + nome);
		
		//==================
		
//		Integer n1 = 0;
//		Integer	n2 = 0;
//		Integer soma = 0;
//		Double  media = 0.0;
//		
//		System.out.print("Informe um numero: ");
//		n1 = in.nextInt();
//		System.out.print("Informe outro numero: ");
//		n2 = in.nextInt();
//		soma = (n1 + n2);
//		media = (double) soma/2;
//		System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a: " + soma);
//		System.out.println("A media entre a soma de " + n1 + " + " + n2 + " dividido por 2 é igual a: " + media);
		
		System.out.println("================");
		
//		//Valor Absoluto
//		System.out.println(Math.abs(-10));
//		//Valor de PI
//		System.out.println(Math.PI);
//		//Valor do Coseno
//		System.out.println(Math.cos(30.0));
//		//Valor da tangente
//		System.out.println(Math.tan(30.0));
//		//Valor de seno
//		System.out.println(Math.sin(30.0));
//		//Valor de 9 expoente 5 ou Valor de 9 elevado a 5 potencia ou Valor de 9 ^ 5;
//		System.out.println(Math.pow(9, 5));
//		//Valor da raiz quadrada
//		System.out.println(Math.sqrt(90));
//		//Valor da parte inteira da raiz quadrada
//		System.out.println((int)Math.sqrt(90));
//		//Valor em graus.
//		System.out.println(Math.toRadians(90));
//		//Valor de graus para radiano
//		System.out.println(Math.sin(Math.toRadians(90)));
		
		//==================
		
		Double angulo = 0.0;
		Double s = 0.0;
		
		System.out.print("Informe um Angulo: ");
		angulo = in.nextDouble();
		s = Math.sin(Math.toRadians(angulo));
		System.out.printf("O seno de %.1f é igual a: %.2f ", angulo, s);
		
		in.close();
	}

}
