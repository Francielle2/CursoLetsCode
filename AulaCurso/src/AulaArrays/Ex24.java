package AulaArrays;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
//Elabore um algoritmo que dado dois vetores inteiros de 3 posições, leia estes vetores
//Calcule a expressão(vetor1 - vetor2), utilizando os valores da mesma posição
//Armazenando em um terceiro vetor, também de números inteiros de 3 posições.
//No final, imprima os números ímpares do terceiro vetor.
		
		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		int[] vetorB = new int[3];
		int[] vetorC = new int[3];
		int[] numImpar = new int[vetorC.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o "+(i+1)+"º número do 1º vetor: ");
			vetorA[i] = scanner.nextInt();
			System.out.println("Informe o "+(i+1)+"º número do 2º vetor: ");
			vetorB[i] = scanner.nextInt();	
			
			vetorC[i] = (vetorA[i] - vetorB[i]);
			
			if (vetorC[i] % 2 != 0) {
				numImpar[i] = vetorC[i];
			}
		}
		System.out.println(" ");
		System.out.print("Números Vetor A:");
		for (int numero: vetorA) {
			System.out.print(" " +numero);
		}
		System.out.println(" ");
		System.out.print("Números Vetor B:");
		for (int numero: vetorB) {
			System.out.print(" " +numero);
		}
		System.out.println(" ");
		System.out.print("Números Vetor C:");
		for (int numero: vetorC) {
			System.out.print(" " +numero);
		}
		System.out.println(" ");
		System.out.print("Números Impares:");
		for (int numero: numImpar) {
			System.out.print(" " +numero);
		}

	}

}
