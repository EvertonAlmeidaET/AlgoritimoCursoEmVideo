package br.com.cursoemvideo.algoritimo.teste;

import java.util.Scanner;

public class DependentesFuncionario {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nome;
		Integer dependentes;
		Double salario;
		Double novoSalario = 0.0;
		String salarioString = "0.0";
		
		
		System.out.printf("Qual o nome do Funcionario? ");
		nome = in.next();
		
		System.out.printf("Qual o salario do funcionario? R$");
		salarioString = in.next();
		salario = Double.valueOf(salarioString.replace(",", "."));
		
		System.out.printf("Qual é a quantidade de dependentes? ");
		dependentes = in.nextInt();
		
		switch(dependentes) {
			case 0:
				novoSalario = (salario + ((salario * 5) /100));
			break;
			case 1:
			case 2:
			case 3:
				novoSalario = (salario + ((salario * 10) /100));
			break;
			case 4:
			case 5:
			case 6:
				novoSalario = (salario + ((salario * 15) /100));
			break;
			default:
				novoSalario = (salario + ((salario * 18) /100));
			break;
		}
		
		System.out.printf("O novo salario de %s será de R$%.2f", nome, novoSalario);
		
		
		in.close();
	}

}
