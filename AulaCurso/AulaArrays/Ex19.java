package AulaArrays;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
//Elabore um algoritmo que, dados dois vetores inteiros de 10 posi��es,
//Leia  os  dois  vetores, some os valores da mesma posi��o  e
//Armazene em um terceiro vetor inteiro de 10 posi��es.
//No final imprima este terceiro vetor.
		
		Scanner scanner = new Scanner(System.in);

		int[] numerosA = new int[3];
		int[] numerosB = new int[3];
		int[] numerosC = new int[numerosA.length + numerosB.length];
		
		for (int a=0; a<numerosA.length; a++) {
			System.out.println("Informe o "+(a+1)+ "� n�mero do 1� vetor: ");
			numerosA[a] = scanner.nextInt();
		}
		for (int b=0; b<numerosB.length; b++) {
			System.out.println("Informe o "+(b+1)+ "� n�mero do 2� vetor: ");
			numerosB[b] = scanner.nextInt();
		}
		System.out.print("1� Vetor: ");
			for(int numero: numerosA) {
				System.out.printf("%d ",numero);
			}
		System.out.println(" ");
		System.out.print("2� Vetor: ");
			for(int numero: numerosB) {
				System.out.printf("%d ",numero);
			}
		System.out.println(" ");
		System.out.print("Soma dos valores dos Vetores 1 e 2: ");
			for (int c=0, a=0; c<numerosC.length; c+=2, a++) {
				System.out.print(" " + (numerosC[c] = numerosA[a] + numerosB[a]));
			}
	}

}
