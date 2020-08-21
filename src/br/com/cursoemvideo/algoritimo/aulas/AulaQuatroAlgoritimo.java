package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaQuatroAlgoritimo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer a = 2;
		Integer b = 3;
		Integer c = 5;
		
		// Operadores Relacionais
//		// A � maior que B
//		System.out.println(a > b);
//		// A � igual a B
//		System.out.println(a == b);
//		// A � diferente de B
//		System.out.println(a != b);
//		// A � maior que 2
//		System.out.println(a > 2);
//		// A � maior ou igual a 2
//		System.out.println(a >= 2);
//		// C � igual a A + B
//		System.out.println(c==a+b);
//		// C � maior ou igual a B elevando a A
//		System.out.println(c >= Math.pow(b, a));
//		// C � menor ou igual a B elevando a A
//		System.out.println(c <= Math.pow(b, a));
//		// b � menor ou igual a C resto da divis�o por 2
//		System.out.println(b <= (c%2));
//		// 1 � igual a C resto da divis�o por 2
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
		//TRUE E FALSE s�o iguais
		System.out.println(true && false);
		//A � igual a B OU C � maior que A
		System.out.println((a==b) || (c>a));
		//!=Inverte o valor A � igual a B OU C � maior que A
		System.out.println(!((a==b) || (c>a)));
		
		in.close();
		
	}

}
