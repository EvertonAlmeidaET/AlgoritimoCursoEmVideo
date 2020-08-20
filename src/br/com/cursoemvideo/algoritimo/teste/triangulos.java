package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class triangulos {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Double l1 = 0.0;
		Double l2 = 0.0;
		Double l3 = 0.0;
		Boolean eq = Boolean.FALSE;
		Boolean es = Boolean.FALSE;
		Boolean tri = Boolean.FALSE;
		
		System.out.print("Digite o primeiro lado: ");
		l1 = in.nextDouble();
		System.out.print("Digite o segundo lado: ");
		l2 = in.nextDouble();
		System.out.print("Digite o terceiro lado: ");
		l3 = in.nextDouble();
		
		eq = ((l1.equals(l2)) && (l2.equals(l3)));
		es = ((!l1.equals(l2)) && (!l2.equals(l3)) && (!l1.equals(l3)));
		tri = ((l1 < (l2 + l3)) && (l2 < (l1 + l3)) && (l3 < (l1 + l2)));
		
		System.out.println("O tringulo é EQUILATERO? " + eq);
		System.out.println("O tringulo é ESCALENO? " + es);
		System.out.println("Pode formar um triangulo? " + tri);
		
	}

}
