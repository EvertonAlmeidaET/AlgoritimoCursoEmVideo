package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaOitoEstruturaCondicionalParteDoisAlgoritimo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Double n1 = 0.0;
		Double n2 = 0.0;
		Double media = 0.0;
		String n1String = "0.0";
		String n2String = "0.0";
		
		System.out.printf("Primeira Nota: ");
		n1String = in.next();
		n1 = Double.valueOf(n1String.replace(",", "."));
		
		System.out.printf("Segunda Nota: ");
		n2String = in.next();
		n2 = Double.valueOf(n2String.replace(",", "."));
		
		media = ((n1 + n2) / 2);
		
		System.out.printf("A media do aluno foi %.2f \n", media);
		
		if(media >= 7.0) {
			System.out.println("Aluno APROVADO");
		} else if((media >= 5.0) && (media < 7.0)) {
			System.out.println("Aluno em RECUPERAÇÃO");
		} else {
			System.out.println("Aluno REPROVADO");
		}
		
		in.close();
	}
}
