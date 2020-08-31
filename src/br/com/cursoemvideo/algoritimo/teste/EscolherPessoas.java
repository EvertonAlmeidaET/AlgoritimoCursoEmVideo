package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class EscolherPessoas {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String sexo = "";
		Integer idade = 0;
		Integer corCabeloOpcao = 0;
		String corCabelo = "";
		String continuar = "S";
		
		Integer totalHomensMaisQueDezoitoAnoCastanho = 0;
		Integer totalMulheresEntreVinteCincoETrintaAnosLoiras = 0;
		
		do {
			System.out.println("================================");
			System.out.println("       SELETOR DE PESSOAS       ");
			System.out.println("================================");
			System.out.printf("Qual o Sexo? [M/F] ");
			sexo = in.next();
			
			System.out.printf("Qual a idade? ");
			idade = in.nextInt();
			
			System.out.println("Qual a cor do Cabelo?");
			System.out.println("------------------------");
			System.out.printf("[1] PRETO \n[2] CASTANHO \n[3] LOIRO \n[4] RUIVO \n");
			corCabeloOpcao = in.nextInt();
			
			switch(corCabeloOpcao) {
				case 1:
					corCabelo = "Preto";
				break;
				case 2:
					corCabelo = "Castanho";
				break;
				case 3:
					corCabelo = "Loiro";
				break;
				case 4:
					corCabelo = "Ruivo";
				break;
				default:
					System.out.println("valor invalido");
				break;
			}
			
			System.out.println("================================");
			
			if((sexo.equalsIgnoreCase("M")) & (idade > 18) & (corCabelo.equalsIgnoreCase("Castanho"))) {
				totalHomensMaisQueDezoitoAnoCastanho++;
			} else if((sexo.equalsIgnoreCase("F")) & (idade >= 25 && idade <= 30) & (corCabelo.equalsIgnoreCase("Loiro"))) {
				totalMulheresEntreVinteCincoETrintaAnosLoiras++;
			}
			
			System.out.printf("Quer continuar? [S/N] ");
			continuar = in.next();
		}while(continuar.equalsIgnoreCase("S"));
		
		System.out.println("O total de homens com mais de 18 e cabelos castanhos é " + totalHomensMaisQueDezoitoAnoCastanho);
		System.out.println("O total de mulheres entre 25 e 30 anos e com cabelos loiros é " + totalMulheresEntreVinteCincoETrintaAnosLoiras);
			
		in.close();
	}

}
