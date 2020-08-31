package br.com.cursoemvideo.algoritimo.teste;

public class SequenciaFibonacciProcedimento {
	
	public static void main(String[] args) {
		
		Integer t1 = 0;
		Integer t2 = 1;
		Integer t3 = 0;
		
		SequenciaFibonacciProcedimento fibo = new SequenciaFibonacciProcedimento();
			
		System.out.print(t1 + " " + t2 + " ");
		
		for(int c = 0; c <= 12; c++) {	
			t3 = fibo.procedimentoFibonacci(t1, t2);
			System.out.printf("%d ", t3);
			t1 = t2;
			t2 = t3;
		}
	}

	public Integer procedimentoFibonacci(Integer t1, Integer t2) {
		Integer c = (t1 + t2);		
		return c;
		
	}
}
