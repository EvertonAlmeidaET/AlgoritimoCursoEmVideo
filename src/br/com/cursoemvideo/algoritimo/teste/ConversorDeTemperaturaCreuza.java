package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ConversorDeTemperaturaCreuza {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Double temperaturaAtualFahrenheit = 0.0;
		Double temperaturaCelsius = 0.0;
		
		System.out.print("Qual a temperatura aqui? ");
		temperaturaAtualFahrenheit = in.nextDouble();
		temperaturaCelsius = ((temperaturaAtualFahrenheit - 32) / 1.8);
		
		System.out.printf("No Brasil estaria %.2f", temperaturaCelsius);
		
		in.close();
	}

}
