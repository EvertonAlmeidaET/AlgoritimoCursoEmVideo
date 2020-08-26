package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class PartidaDeFutebol {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Integer diferenca;
		Integer golsB = 0;
		Integer golsM = 0;
		
		System.out.println("     BANGU x MADUREIRA     ");
		System.out.println("---------------------------");
		System.out.printf("QUANTOS GOLS DO BANGU? ");
		golsB = in.nextInt();
		
		System.out.printf("QUANTOS GOLS DO MADUREIRA? ");
		golsM = in.nextInt();
		
		System.out.println("---------------------------");
		 
		diferenca = (golsB - golsM);
		if(diferenca < 0) {
			diferenca = Math.abs(diferenca);
		}
		
		System.out.printf("DIFERENÇA: %d \n", diferenca);
		switch (diferenca) {
			case 0:
				System.out.println("STATUS: EMPATE");
			break;
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("STATUS: PARTIDA NORMAL");
			break;
			default:
				System.out.println("STATUS: GOLEADA");
				break;
		}
		System.out.println("---------------------------");
		
		in.close();
		
	}

}
