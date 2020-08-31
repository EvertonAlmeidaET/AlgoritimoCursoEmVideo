package br.com.cursoemvideo.algoritimo.teste;

public class SequenciaFibonacciFuncao {
	
	static Integer t1 = 0;
	static Integer t2 = 1;
	static Integer t3 = 0;
	
	public static void main(String[] args) {
		System.out.print(t1 + " " + t2 + " ");
		
		for(int c = 3; c <= 10; c++) {	
			t3 = procedimentoFibonacci(t1, t2);
			System.out.printf("%d ", t3);
		}
	}

	public static Integer procedimentoFibonacci(Integer valor1, Integer valor2) {
		t1 = valor1;
		t2 = valor2;
		Integer n3 = 0;
		
		n3 = (t1 + t2);
		t1 = t2;
		t2 = n3;
		
		return n3;
		
	}
}
