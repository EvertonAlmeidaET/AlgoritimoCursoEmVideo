package br.com.cursoemvideo.algoritimo.teste;

public class TesteFinal {
	
	public static void main(String[] args) {
		
//		Boolean a = Boolean.FALSE, b = Boolean.TRUE, c = Boolean.FALSE;
//		
//		if(a){
//			System.out.println("C1");
//		} else {
//			if(b) {
//				if(c) {
//					System.out.println("C2");
//				} else {
//					System.out.println("C3");
//					System.out.println("C4");
//				}
//			}
//			System.out.println("C5");
//		}
//		System.out.println("C6");
		
		System.out.println("========================");
//		Double s = 0.0;
//		for (int i = 0; i < 4; i++) {
//			s += operacao(i);
//		}
//		System.out.println(s);
		
		System.out.println("====================");
		
//		Integer[] v = new Integer[10];
//		Integer x = 1;
//		Integer y = 4;
//		v[0] = 2;
//		v[1] = 6;
//		v[2] = 8;
//		v[3] = 3;
//		v[4] = 10;
//		v[5] = 9;
//		v[6] = 1;
//		v[7] = 21;
//		v[8] = 33;
//		v[9] = 14;
//		System.out.println(v[x + y]);
//		System.out.println(v[9 - v[2]]);
//		System.out.println(v[v[v[1]]]);
//		System.out.println(v[2 + (v[3] * v[6])]);
		
//		System.out.println("=================");
//		Integer cont = 1;
//		Integer x = 0;
//		Integer aux = 0;
//		while(cont <= 5) {
//			aux = (x * 3);
//			System.out.println(aux);
//			cont++;
//			x++;
//		}
		
		
	}
	
	public static Double operacao(Integer n) {
		Double x = 0.0;
	
		if((n % 2) == 0){
			x = Math.pow(n, 2);
		} else {
			x = (n / 2.0);
		}
		return x;
	}

}
