package AulaArrays;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
//Elabore um algoritmo que dado tr�s vetores reais de 5 posi��es, leia estes vetores
//Calcule a express�o ((vetor1 * vetor3) / vetor2), utilizando os valores da mesma posi��o, armazenando em um quarto vetor
//Tamb�m de n�meros reais de 5 posi��es.No final,imprima os n�meros do quarto vetor.  

		Scanner scanner = new Scanner(System.in);

		float[] vetorA = new float[5];
		float[] vetorB = new float[5];
		float[] vetorC = new float[5];
		float[] vetorD = new float[vetorA.length + vetorB.length + vetorC.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o "+(i+1)+"� n�mero do 1� vetor: ");
			vetorA[i] = scanner.nextInt();
			System.out.println("Informe o "+(i+1)+"� n�mero do 2� vetor: ");
			vetorB[i] = scanner.nextInt();	
			System.out.println("Informe o "+(i+1)+"� n�mero do 3� vetor: ");
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
