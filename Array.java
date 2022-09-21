package CursoJava;

import java.util.Scanner;
public class Array {
public static void main(String[] args) {
	double resultado = 0;
	Scanner s = new Scanner(System.in);
	System.out.println("Anote o número");
	int i = s.nextInt();
	double[] notas = new double [i];
	for(int c = 0; c < i; c++) {
		System.out.println("Digite a nota");
		double valorNota = s.nextDouble();
		notas[c] = valorNota;
		resultado = resultado + notas[c]; 
	}
	System.out.println(resultado/i);
	s.close();
}
}
