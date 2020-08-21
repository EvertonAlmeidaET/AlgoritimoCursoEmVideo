package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class ImpostoProdutoCreuza {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Double valorProduto = 0.0;
		Double imposto = 60.0;
		Double valorDoProdutoMaisImposto = 0.0;
		
		System.out.print("Qual o valor do produto? US$");
		valorProduto = in.nextDouble();
		valorDoProdutoMaisImposto = ((valorProduto * imposto) / 100);
		System.out.printf("O imposto será de $%.2f", valorDoProdutoMaisImposto);
		
		
		in.close();
	}

}
