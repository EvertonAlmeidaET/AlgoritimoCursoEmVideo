package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ReservarEspacosNoCinema {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Object[] cadeiras = new Object[10];
		String reservar = "S";
		String cadeiraPosicao = "B0";
		String reservada = "";
		
		for (int i = 0; i < 10; i++) {
			cadeiras[i] = "B" + (i+1);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + cadeiras[i] + "]");
		}
		do {
			System.out.println("\n-----------------------------------------");
			reservada = "";
			System.out.print("Reservar a cadeira: ");
			cadeiraPosicao = in.next();
			cadeiraPosicao = cadeiraPosicao.toUpperCase();
			for (int i = 0; i < 10; i++) {
				if (cadeiras[i].equals(cadeiraPosicao)) {
					reservada = "Cadeira " + cadeiras[i] + " RESERVADA!";
					cadeiras[i] = "---";
					break;
				} else if(cadeiras[i].equals("---")){
					reservada = "ERRO: LUGAR OCUPADO!";
				}
			}			
			System.out.println(reservada);
			System.out.print("Quer reservar outro? [S/N] ");
			reservar = in.next();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
			reservar = reservar.toUpperCase();
			if(reservar.equalsIgnoreCase("S")) {
				for (int i = 0; i < 10; i++) {
					System.out.print("[" + cadeiras[i] + "]");
				}
			}
						
		} while(reservar.equalsIgnoreCase("S"));
		
		in.close();
	}

}
