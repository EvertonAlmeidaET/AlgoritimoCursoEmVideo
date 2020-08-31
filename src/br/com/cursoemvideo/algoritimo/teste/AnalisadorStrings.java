package br.com.cursoemvideo.algoritimo.teste;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class AnalisadorStrings {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		Scanner in = new Scanner(System.in);
		
		String nome = "";
		
		System.out.printf("Digite seu nome: ");
		nome = in.next();
		
		System.out.println("Total de Letras do seu nome: " + nome.length());
		System.out.println("Seu nome em maiusculas: " + nome.toUpperCase());
		System.out.println("Seu nome em minusculas: " + nome.toLowerCase());
		System.out.println("A primeira letra do seu nome é: " + nome.subSequence(1, 2));
		System.out.println("A primeira letra do seu nome é: " + nome.subSequence(6, 7));
		System.out.println("Tem a letra a na posição: " + nome.lastIndexOf("a"));
		nome = nome.toUpperCase();
		System.out.println("O codigo da letra A é " + nome.codePointAt(nome.lastIndexOf("A")));	
		System.out.println("======================");
		StringBuilder nome2 = new StringBuilder(nome);
		System.out.println(nome2.reverse());
		
		in.close();
	}

}
