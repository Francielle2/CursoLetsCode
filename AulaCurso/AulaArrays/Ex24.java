package AulaArrays;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
//Elabore um algoritmo que dado dois vetores inteiros de 3 posi��es, leia estes vetores
//Calcule a express�o(vetor1 - vetor2), utilizando os valores da mesma posi��o
//Armazenando em um terceiro vetor, tamb�m de n�meros inteiros de 3 posi��es.
//No final, imprima os n�meros �mpares do terceiro vetor.
		
		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		int[] vetorB = new int[3];
		int[] vetorC = new int[3];
		int[] numImpar = new int[vetorC.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o "+(i+1)+"� n�mero do 1� vetor: ");
			vetorA[i] = scanner.nextInt();
			System.out.println("Informe o "+(i+1)+"� n�mero do 2� vetor: ");
			vetorB[i] = scanner.nextInt();	
			
			vetorC[i] = (vetorA[i] - vetorB[i]);
			
			if (vetorC[i] % 2 != 0) {
				numImpar[i] = vetorC[i];
			}
		}
		System.out.println(" ");
		System.out.print("N�meros Vetor A:");
		for (int numero: vetorA) {
			System.out.print(" " +numero);
		}
		System.out.println(" ");
		System.out.print("N�meros Vetor B:");
		for (int numero: vetorB) {
			System.out.print(" " +numero);
		}
		System.out.println(" ");
		System.out.print("N�meros Vetor C:");
		for (int numero: vetorC) {
			System.out.print(" " +numero);
		}
		System.out.println(" ");
		System.out.print("N�meros Impares:");
		for (int numero: numImpar) {
			System.out.print(" " +numero);
		}

	}

}
