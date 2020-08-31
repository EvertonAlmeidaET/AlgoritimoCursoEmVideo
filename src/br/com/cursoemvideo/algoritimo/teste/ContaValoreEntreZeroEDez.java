package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ContaValoreEntreZeroEDez {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer valorDigitado = 0;
		Integer quantValorEntreZeroEDez = 0;
		Integer somaDosImpares = 0;
		
		
		for(int c = 1; c <= 6; c++) {
			System.out.print("Digite um valor: ");
			valorDigitado = in.nextInt();
			if((valorDigitado >= 0 ) && (valorDigitado <= 10)) {
				quantValorEntreZeroEDez++;
			
			}
			if((valorDigitado % 2) == 1) {
				somaDosImpares+= valorDigitado;
			}
		}
		
		System.out.printf("Ao todo foram %d valores entre 0 e 10\n", quantValorEntreZeroEDez);
		System.out.printf("Neste intervalo, a soma de numeros impares foi de %d", somaDosImpares);
		
		in.close();
	}

}
