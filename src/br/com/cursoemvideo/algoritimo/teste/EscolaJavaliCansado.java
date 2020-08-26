package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class EscolaJavaliCansado {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String aproveitamento = "";
		Double media = 0.0;
		Double n1 = 0.0;
		Double n2 = 0.0;
		String n1String = "0.0";
		String n2String = "0.0";
		
		System.out.println("-----------------------------");
		System.out.println("    ESCOLA JAVALI CANSADO    ");
		System.out.println("-----------------------------");
		System.out.printf("PRIMEIRA NOTA: ");
		n1String = in.next();
		n1 = Double.valueOf(n1String.replace(",", "."));
		
		System.out.printf("SEGUNDA NOTA: ");
		n2String = in.next();
		n2 = Double.valueOf(n2String.replace(",", "."));
		
		media = ((n1 + n2) / 2);
		
		System.out.println("-----------------------------");
		System.out.printf("MEDIA DO ALUNO: %.2f \n", media);
		
		if((media > 9.0) && (media <= 10.0)) {
			aproveitamento = "A";
		} else if((media > 8.0) && (media <= 8.9 )) {
			aproveitamento = "B";
		} else if((media > 7) && (media <= 7.9)) {
			aproveitamento = "C";
		} else if((media > 6) && (media <= 6.9)) {
			aproveitamento = "D";
		} else if((media > 5) && (media <= 5.9)) {
			aproveitamento = "E";
		} else {
			aproveitamento = "F";
		}
		
		System.out.printf("APROVEITAMENTO: %s \n", aproveitamento);
		System.out.println("-----------------------------");
		
		in.close();
	}

}
