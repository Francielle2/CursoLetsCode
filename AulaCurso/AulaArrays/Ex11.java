package AulaArrays;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
//Altere o programa anterior, intercalando 3 vetores de 10 elementos cada. 
		
		Scanner scanner = new Scanner(System.in);

		int[] numerosA = new int[5];
		int[] numerosB = new int[5];
		int[] numerosC = new int[5];
		int[] numerosD = new int[numerosA.length + numerosB.length + numerosC.length];
		
		for (int a=0; a<numerosA.length; a++) {
			System.out.println("Informe o "+(a+1)+ "� n�mero do 1� vetor: ");
			numerosA[a] = scanner.nextInt();
		}
		for (int b=0; b<numerosB.length; b++) {
			System.out.println("Informe o "+(b+1)+ "� n�mero do 2� vetor: ");
			numerosB[b] = scanner.nextInt();
		}
		for (int c=0; c<numerosB.length; c++) {
			System.out.println("Informe o "+(c+1)+ "� n�mero do 3� vetor: ");
			numerosC[c] = scanner.nextInt();
		}
		for (int d=0, a=0, b=0; d<numerosD.length; d+=3, a++, b++) {
			numerosD[d] = numerosA[a];
			numerosD[d + 1] = numerosB[b];
			numerosD[d + 2] = numerosC[b];
		}
		System.out.print("N�meros do Vetor 1: ");
		for(int numero: numerosA) {
		System.out.printf("%d ",numero);
		}
		System.out.println(" ");
		System.out.print("N�meros do Vetor 2: ");
		for(int numero: numerosB) {
		System.out.printf("%d ",numero);
		}
		System.out.println(" ");
		System.out.print("N�meros do Vetor 3: ");
		for(int numero: numerosC) {
		System.out.printf("%d ",numero);
		}
		System.out.println(" ");
		System.out.print("Jun��o dos Vetores: ");
		for(int numero: numerosD) {
		System.out.printf("%d ",numero);
		}

	}

}
