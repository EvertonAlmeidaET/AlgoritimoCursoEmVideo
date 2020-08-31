package br.com.cursoemvideo.algoritimo.teste;

public class CombinacoesComLacoFor {
	
	public static void main(String[] args) {
		
		for(int coluna = 1; coluna <= 3; coluna++) {
			for(int linha = 1; linha <= 3; linha++) {
				System.out.printf("[%d - %d]\n", coluna, linha);
			}
		}
	}

}
