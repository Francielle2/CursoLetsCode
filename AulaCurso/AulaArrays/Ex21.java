package AulaArrays;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
//Utilizando a questão 7, elabore um algoritmo que calcule a média de altura do time.  

		Scanner scanner = new Scanner(System.in);

		float[] altura = new float[12];
		float mediaAltura = 0;
		float somAltura = 0;

		for (int i=0; i<altura.length; i++) {
			System.out.println("Informe a altura do "+(i+1)+"º jogador: ");
			altura[i] = scanner.nextInt();	
			somAltura += altura[i];
		}
		
		mediaAltura = somAltura/12;
			
		System.out.println("Média da altura do time: " +mediaAltura);
	}
}
