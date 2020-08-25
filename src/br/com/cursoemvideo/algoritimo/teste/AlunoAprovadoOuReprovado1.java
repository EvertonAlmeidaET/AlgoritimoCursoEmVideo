package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class AlunoAprovadoOuReprovado1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Double n1 = 0.0;
		Double n2 = 0.0;
		Double media = 0.0;
		String n1String = "0.0";
		String n2String = "0.0";
		
		System.out.println("--------------------------------------");
		System.out.println("ESCOLA JAVALI CANSADO");
		System.out.println("--------------------------------------");
		System.out.printf("PRIMEIRA NOTA: ");
		n1String = in.next();
		System.out.printf("SEGUNDA NOTA: ");
		n2String = in.next();
		n1 = Double.valueOf(n1String.replace(",", "."));
		n2 = Double.valueOf(n2String.replace(",", "."));
		
		media = ((n1 + n2) / 2);
		
		System.out.println("--------------------------------------");
		System.out.printf("MEDIA: %.2f \n", media);
		if(media >= 7.0) {
			System.out.println("ALUNO APROVADO");
		} else { 
			System.out.println("ALUNO REPROVADO");
		}
		System.out.println("--------------------------------------");
		
		in.close();
	}

}
