package AulaArrays;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
//Faça um programa que leia dois vetores com 10 elementos cada. 
//Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores. 

		
		Scanner scanner = new Scanner(System.in);

		int[] numerosA = new int[10];
		int[] numerosB = new int[10];
		int[] numerosC = new int[numerosA.length + numerosB.length];
		
		for (int a=0; a<numerosA.length; a++) {
			System.out.println("Informe o "+(a+1)+ "º número do 1º vetor: ");
			numerosA[a] = scanner.nextInt();
		}
		for (int b=0; b<numerosB.length; b++) {
			System.out.println("Informe o "+(b+1)+ "º número do 2º vetor: ");
			numerosB[b] = scanner.nextInt();
		}
		for (int c=0, a=0; c<numerosC.length; c+=2, a++) {
			numerosC[c] = numerosA[a];
			numerosC[c + 1] = numerosB[a];
		}
		System.out.println(" ");
		System.out.print("Números do Vetor 1: ");
		for(int numero: numerosA) {
		System.out.printf("%d ",numero);
		}
		System.out.println(" ");
		System.out.print("Números do Vetor 2: ");
		for(int numero: numerosB) {
		System.out.printf("%d ",numero);
		}
		System.out.println(" ");
		System.out.print("Junção dos Vetores: ");
		for(int numero: numerosC) {
		System.out.printf("%d ",numero);
		}

	}

}
