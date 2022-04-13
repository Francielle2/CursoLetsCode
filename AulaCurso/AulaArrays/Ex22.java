package AulaArrays;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
//Elabore um algoritmo que dado três vetores reais de 5 posições, leia estes vetores
//Calcule a expressão ((vetor1 * vetor3) / vetor2), utilizando os valores da mesma posição, armazenando em um quarto vetor
//Também de números reais de 5 posições.No final,imprima os números do quarto vetor.  

		Scanner scanner = new Scanner(System.in);

		float[] vetorA = new float[5];
		float[] vetorB = new float[5];
		float[] vetorC = new float[5];
		float[] vetorD = new float[vetorA.length + vetorB.length + vetorC.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o "+(i+1)+"º número do 1º vetor: ");
			vetorA[i] = scanner.nextInt();
			System.out.println("Informe o "+(i+1)+"º número do 2º vetor: ");
			vetorB[i] = scanner.nextInt();	
			System.out.println("Informe o "+(i+1)+"º número do 3º vetor: ");
			vetorC[i] = scanner.nextInt();	
			
			vetorD[i] = ((vetorA[i] * vetorC[i]) / vetorB[i]);
		}
		System.out.print("Vetor 1: ");
		for(int i=0; i< vetorA.length; i++) {
			System.out.printf(" " +vetorA[i]);
		}
		System.out.println(" ");
		System.out.print("Vetor 2: ");
		for(int i=0; i< vetorB.length; i++) {
			System.out.printf(" " +vetorB[i]);
		}
		System.out.println(" ");
		System.out.print("Vetor 3: ");
		for(int i=0; i< vetorC.length; i++) {
			System.out.printf(" " +vetorC[i]);
		}
		System.out.println(" ");
		System.out.print("Vetor 4: ");
		for(int i=0; i< vetorD.length; i++) {
			System.out.printf(" " +vetorD[i]);
		}		
	}

}
