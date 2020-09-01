package br.com.cursoemvideo.algoritimo.teste;

public class MatrizIdentidadeDeTeceiraOrdem {
	
	public static void main(String[] args) {
		
		Integer[][] maID = new Integer[3][3];
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if(l == c) {
					maID[l][c] = 1;
				} else {
					maID[l][c] = 0;
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + maID[i][j] + "]");
			}
			System.out.println();
		}
	}

}
