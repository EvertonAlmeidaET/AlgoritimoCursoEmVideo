package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class AnalisadorDeValores {
	 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer valorDigitado = 0;
		Integer somaValoreDigitados = 0;
		Double mediaValor = 0.0;
		Integer divisivelPorCinco = 0;
		Integer somaDosPares = 0;
		Integer valorNulo = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.printf("Digite o %dº: ", i);
			valorDigitado = in.nextInt();
			somaValoreDigitados += valorDigitado;
			if((valorDigitado % 5) == 0) {
				divisivelPorCinco++;
			}
			if(valorDigitado.equals(0)) {
				valorNulo++;
			}
			if((valorDigitado % 2) == 0) {
				somaDosPares += valorDigitado;
			}
			
		}
		mediaValor = (somaValoreDigitados / 5.0);
		System.out.println("A soma entre os valores é: " + somaValoreDigitados);
		System.out.println("A media entre os valores é: " + mediaValor);
		System.out.println("Valore divisiveis por cinzo são: " + divisivelPorCinco);
		System.out.println("Valores nulos: " + valorNulo);
		System.out.println("A soma dos valores pares é: " + somaDosPares);
		
		in.close();
	}
}
