package AulaArrays;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
//Faça um programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor.   
//Imprima   a   idade  e   a   altura   na   ordem   inversa   a ordem lida. 
		
		Scanner scanner = new Scanner(System.in);

		int[] idade = new int[6];
		float[] altura = new float[6];
		
		for (int i=1; i<idade.length; i++) {
			System.out.println("Informe a idade da " +i+ "ª pessoa:");
			idade[i] = scanner.nextInt();
		}
		for (int a=1; a<altura.length; a++) {
			System.out.println("Informe a altura da " +a+ "ª pessoa:");
			altura[a] = scanner.nextInt();
		}
			
		System.out.print("Idades Inversa:");
		for (int i=5; i>=1; i--) {
			System.out.printf(" " +idade[i]);
		}
		System.out.println(" ");
		
		System.out.print("Altura Inversa:");
		for (int a=5; a>=1; a--) {
			System.out.printf(" " +altura[a]);
		}

	}

}
