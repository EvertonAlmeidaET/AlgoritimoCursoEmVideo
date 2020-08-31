package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class TorneioDeFutebolVetores {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] times = new String[3];
		String time = "";
		String[] partidas = new String[6];
		
		
		System.out.println("=======================");
		System.out.println(" CAMPEONATO DE FUTEBOL ");
		System.out.println("=======================");
		
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o " + (i+1) + "º time: ");
			time = in.next();
			times[i] = time.toUpperCase();
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		System.out.println("----------------------------");
		System.out.println("     TABELA DE PARTIDAS     ");
		System.out.println("----------------------------");
		Integer contadorPartidas = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(!(times[i].equalsIgnoreCase(times[j]))) {
					partidas[contadorPartidas] = times[i] + "    [ ] x [ ]    " + times[j];
					contadorPartidas++;
				}
			}
			
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(partidas[i]);
		}
		
		
		in.close();
	}

}
