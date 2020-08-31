package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaQuatorzeVetores {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer [] n = new Integer[6];
		
		for(int i = 0; i < n.length; i++) {
			System.out.printf("Digite o %dº valor: ", i+1);
			n[i] = in.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
			System.out.print("[" + n[i] + "] ");
			
			in.close();
		}
	}

}
