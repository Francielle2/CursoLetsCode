package AulaArrays;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
//Um time de basquete possui 12 jogadores. 
//Elabore um algoritmo que, dado dois vetores N�MERO e ALTURA, 
//Calcule e imprima o n�mero do jogador mais alto e a sua altura.
		
		Scanner scanner = new Scanner(System.in);

		int[] numero = new int[12];
		float[] altura = new float[12];
		int maior = 0;
		int posicaoAltura = 0;
		
		for (int i=0; i<numero.length; i++) {
			System.out.println("Informe o n�mero do "+(i+1)+"� jogador: ");
			numero[i] = scanner.nextInt();
			System.out.println("Informe a altura do "+(i+1)+"� jogador: ");
			altura[i] = scanner.nextInt();	
		}
		
		System.out.println(" ");
		for (int i=0; i<numero.length; i++) {			
			if ((numero[i] > maior)  && (altura[i] > 0)){
				maior = numero[i];
				posicaoAltura = (int) altura[i];
			} 
		}
		System.out.println("O n�mero do jogador mais alto � o "+ maior + " tendo "+posicaoAltura+ " de altura.");  
		}
}

