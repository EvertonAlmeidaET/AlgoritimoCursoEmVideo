package br.com.cursoemvideo.algoritimo.aulas;

import java.util.Scanner;

public class AulaDozeProcedimentos {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Double maiorPeso = 0.0;
		String nome = "";
		String pesoString = "";
		Double peso = 0.0;
		String pesado = "";
		
		System.out.println(procedimento(maiorPeso));
		
		for(int i = 0; i <= 4; i++) {
			System.out.print("Digite o nome: ");
			nome = in.next();
			System.out.printf("Digite o peso de %s: ", nome);
			pesoString = in.next();
			peso = Double.valueOf(pesoString.replace(",", "."));
			if(peso > maiorPeso) {
				maiorPeso = peso;
				pesado = nome;
			}
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println(procedimento(maiorPeso));
		
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(procedimento(maiorPeso));
		System.out.println("A pessoa mais pesada foi " + pesado + " com " + maiorPeso + " quilos");
		
		in.close();
		
	}
	
	public static String procedimento(Double maiorPeso) {
		String dectorPeso = String.format("----------------------------------\n         DETECTOR DE PESADO        "
				+ "\n     Maior Peso até agora %.2fKg    \n----------------------------------", maiorPeso);
		
		return dectorPeso;
	}

}
