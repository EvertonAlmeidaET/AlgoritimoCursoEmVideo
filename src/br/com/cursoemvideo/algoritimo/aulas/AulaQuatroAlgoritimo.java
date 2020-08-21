package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaQuatroAlgoritimo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer a = 2;
		Integer b = 3;
		Integer c = 5;
		
		// Operadores Relacionais
//		// A é maior que B
//		System.out.println(a > b);
//		// A é igual a B
//		System.out.println(a == b);
//		// A é diferente de B
//		System.out.println(a != b);
//		// A é maior que 2
//		System.out.println(a > 2);
//		// A é maior ou igual a 2
//		System.out.println(a >= 2);
//		// C é igual a A + B
//		System.out.println(c==a+b);
//		// C é maior ou igual a B elevando a A
//		System.out.println(c >= Math.pow(b, a));
//		// C é menor ou igual a B elevando a A
//		System.out.println(c <= Math.pow(b, a));
//		// b é menor ou igual a C resto da divisão por 2
//		System.out.println(b <= (c%2));
//		// 1 é igual a C resto da divisão por 2
//		System.out.println(1 == (c%2));
		
		// TABELA VERDADE DOS OPERADORES LOGICOS. 
		//|  P  |E|  Q  |    | |  P  |OU|  Q  |
		//---------------	 | ----------------
		//|  V  |E|  V  |= V | |  V  |OU|  V  |= V
		//|  V  |E|  F  |= F | |  V  |OU|  F  |= V
		//|  F  |E|  V  |= F | |  F  |OU|  V  |= V
		//|  F  |E|  F  |= F | |  F  |OU|  F  |= F
		//--------------------------------------
		
		//Operadores Logicos
		//TRUE E FALSE são iguais
		System.out.println(true && false);
		//A é igual a B OU C é maior que A
		System.out.println((a==b) || (c>a));
		//!=Inverte o valor A é igual a B OU C é maior que A
		System.out.println(!((a==b) || (c>a)));
		
		in.close();
		
	}

}
