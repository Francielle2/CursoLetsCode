package AulaArrays;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//Fa�a um programa que pe�a as quatro notas de 10 alunos, 
//Calcule e armazene num vetor a m�dia de cada aluno,
//Imprima o n�mero de alunos com m�dia maior ou igual a 7.0. 
		
		Scanner scanner = new Scanner(System.in);
		
		float notas[] = new float [5];
		float alunos[] = new float [5];
		float qtd[] = new float [5];
			
		for (int x=1; x<5; x++) {
			System.out.println("Informe a "+ x + "� nota do 1� aluno: ");
			notas[x] = scanner.nextFloat();
		}
		for (int x=1; x<5; x++) {
			System.out.println("Informe a "+ x + "� nota do 2� aluno: ");
			alunos[x] = scanner.nextFloat();
			qtd[x] = ((notas[x] * 4)+(alunos[x] *6)) /10;
		}
			System.out.println("O n�mero de alunos com m�dia maior ou igual a 7.0 �: " +qtd);
		}
	} 

