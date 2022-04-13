package AulaArrays;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//Faça um programa que peça as quatro notas de 10 alunos, 
//Calcule e armazene num vetor a média de cada aluno,
//Imprima o número de alunos com média maior ou igual a 7.0. 
		
		Scanner scanner = new Scanner(System.in);
		
		float notas[] = new float [5];
		float alunos[] = new float [5];
		float qtd[] = new float [5];
			
		for (int x=1; x<5; x++) {
			System.out.println("Informe a "+ x + "ª nota do 1º aluno: ");
			notas[x] = scanner.nextFloat();
		}
		for (int x=1; x<5; x++) {
			System.out.println("Informe a "+ x + "ª nota do 2º aluno: ");
			alunos[x] = scanner.nextFloat();
			qtd[x] = ((notas[x] * 4)+(alunos[x] *6)) /10;
		}
			System.out.println("O número de alunos com média maior ou igual a 7.0 é: " +qtd);
		}
	} 

