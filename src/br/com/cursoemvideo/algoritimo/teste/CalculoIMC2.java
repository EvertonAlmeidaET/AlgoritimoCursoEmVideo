package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class CalculoIMC2 {
	
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
		
		System.out.printf("Seu IMC é %.2f \n", calculoIMC);
		
		if((calculoIMC < 17.0)) {
			System.out.println("Muito abaixo do Peso");
		} else if((calculoIMC >= 17.0) && (calculoIMC < 18.5)) {
			System.out.println("Abaixo do Peso");
		} else if((calculoIMC >= 18.5) && (calculoIMC < 25)) {
			System.out.println("Peso ideal");
		} else if((calculoIMC >= 25) && (calculoIMC < 30)) {
			System.out.println("Sobrepeso");
		} else if((calculoIMC >= 30) && (calculoIMC < 35)) {
			System.out.println("Obesidade");
		} else if((calculoIMC >= 35) && (calculoIMC < 40)) {
			System.out.println("Obesidade Severa");
		} else {
			System.out.println("Obseidade Morbida");
		}
		
		
		
		in.close();
	}
}
