package AulaArrays;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
//Um time de basquete possui 12 jogadores. 
//Elabore um algoritmo que, dado dois vetores NÚMERO e ALTURA, 
//Calcule e imprima o número do jogador mais alto e a sua altura.
		
		Scanner scanner = new Scanner(System.in);

		int[] numero = new int[12];
		float[] altura = new float[12];
		int maior = 0;
		int posicaoAltura = 0;
		
		for (int i=0; i<numero.length; i++) {
			System.out.println("Informe o número do "+(i+1)+"º jogador: ");
			numero[i] = scanner.nextInt();
			System.out.println("Informe a altura do "+(i+1)+"º jogador: ");
			altura[i] = scanner.nextInt();	
		}
		
		System.out.println(" ");
		for (int i=0; i<numero.length; i++) {			
			if ((numero[i] > maior)  && (altura[i] > 0)){
				maior = numero[i];
				posicaoAltura = (int) altura[i];
			} 
		}
		System.out.println("O número do jogador mais alto é o "+ maior + " tendo "+posicaoAltura+ " de altura.");  
		}
}

