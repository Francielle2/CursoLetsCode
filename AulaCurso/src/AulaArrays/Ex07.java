package AulaArrays;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
//Faça um programa que leia um vetor de 5 números inteiros, mostre a soma, multiplicação e os números.

		Scanner scanner = new Scanner(System.in);
		
		int[] vetNumero = new int[5];
		int somaNumeros = 0;
		int multNumeros = 1;
		
		for (int i=0; i<vetNumero.length; i++) {
			System.out.println("Digite o "+(i+1)+ "º número do vetor: ");
			vetNumero[i] = scanner.nextInt();
			somaNumeros += vetNumero[i];
			multNumeros *= vetNumero[i];
		}
		System.out.println("Soma dos números digitados: " +somaNumeros);
        System.out.println("Multiplicação dos números digitados: " +multNumeros);
        
        System.out.print("Números do Vetor: ");
		for(int numero: vetNumero) {
		System.out.printf("%d ",numero);
		}
        
		}
		
}
