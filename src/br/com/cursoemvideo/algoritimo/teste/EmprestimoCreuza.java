package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class EmprestimoCreuza {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Double valorDoEmprestimo = 0.0;
		Integer parcelas = 0;
		Double valorDoEmprestimoParcelado = 0.0;
		
		System.out.print("Qual o valor do emprestimo? ");
		valorDoEmprestimo = in.nextDouble();
		valorDoEmprestimo += ((valorDoEmprestimo * 20) /100);
		System.out.print("Quantas parcelas deseja parcelar? ");
		parcelas = in.nextInt();
		valorDoEmprestimoParcelado = (valorDoEmprestimo / parcelas);
		
		System.out.printf("O valor do emprestimo com 20Porcento de juros é $ %.2f \n", valorDoEmprestimo);
		System.out.printf("O valor fica em %.2f x %d", valorDoEmprestimoParcelado, parcelas);
		
		System.out.println();
		
		
		in.close();
	}

}
