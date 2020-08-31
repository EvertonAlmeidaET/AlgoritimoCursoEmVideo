package br.com.cursoemvideo.algoritimo.teste;

public class SequenciaFibonacci {
	
	public static void main(String[] args) {
		
		Integer aux = 0;
		Integer auxDois = 1;
		
//		for(int a = 0, b = 1; a <= 500; b+=a, a=b-a) {
//			System.out.print(a+ ", ");
//		}
		
		for(int i = 0; i <= 15; i++) {
			System.out.print(aux + " ");
			auxDois += aux;
			aux = auxDois - aux;
		}
	}

}
