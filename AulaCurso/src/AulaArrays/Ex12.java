package AulaArrays;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
//Foram anotadas as idades e alturas de 30 alunos.
//Faça um programa que determine quantos alunos com mais de 13anos possuem altura inferior à média de altura desses alunos.
		
		Scanner scanner = new Scanner(System.in);

		int[] idade = new int[30];
		float[] altura = new float[30];
		float mediaAltura = 0;
		float somAltura = 0;
		int qtd = 0;
		
		for (int i=0; i<idade.length; i++) {
			System.out.println("Informe a idade do "+(i+1)+"º aluno: ");
			idade[i] = scanner.nextInt();
		}
		for (int a=0; a<altura.length; a++) {
			System.out.println("Informe a altura do "+(a+1)+"º aluno: ");
			altura[a] = scanner.nextInt();
			somAltura += altura[a];
		}
		
		mediaAltura = somAltura/30;
		
		for (int m=0; m<idade.length; m++) {
			if((idade[m] > 13) && (altura[m] < mediaAltura)) {
				qtd++;
			}
		}
			
		System.out.println("Média das alturas: " +mediaAltura);
		System.out.println("A quantidade de alunos com mais de 13anos que possuem altura inferior a média total dos alunos é: " +qtd);
	}
}
