package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class CalculoIMC1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Double massa = 0.0;
		Double altura = 0.0;
		Double calculoIMC = 0.0;
		String alturaString = "0.0";
		
		System.out.printf("Massa (Kg): ");
		massa = in.nextDouble();
		System.out.printf("Altura (m): ");
		alturaString = in.next();
		altura = Double.valueOf(alturaString.replace(",", "."));
		
		calculoIMC = (massa / (altura * altura));
		
		if((calculoIMC >= 18.85) && (calculoIMC < 25.0)) {
			System.out.printf("IMC: %.2f \n\r", calculoIMC);
			System.out.println("Parabens! Você esta no seu peso ideal");
		} else {
			System.out.println("Você não esta na faixa de peso ideal");
		}
		
		
		in.close();
	}
}
