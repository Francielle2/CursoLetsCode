package AulaArrays;

import java.util.Random;

public class Ex23 {

	public static void main(String[] args) {
//Elabore um algoritmo que leia os vetores A e B de números reais de 4
//Calcule  a média ponderada. 
//Armazene a média em um terceiro vetor e, no final, imprima, na ordem inversa,este terceiro vetor,com duas casas decimais. 
//Peso A é 4 e peso B é 6. 
		
		Random random = new Random();
		
		float[] vetorA = new float[4];
		float[] vetorB = new float[4];
		float[] vetorC = new float[4];
		
		float pesoA = 4;
		float pesoB = 6;
				
		for (int i=0; i<vetorA.length; i++) {	
			vetorA[i] = random.nextFloat();
			vetorB[i] = random.nextFloat();
		}
		System.out.println("\nVetor A:");
		for (int i=0; i<4; i++) {
			System.out.println(" "+vetorA[i]);
		}
		System.out.println("\nVetor B:");
		for (int i=0; i<4; i++) {
			System.out.println(" "+vetorB[i]);
		}
		
		for (int i=0; i<vetorC.length; i++) {
			float mediaPonderada = (vetorA[i]*pesoA) + (vetorB[i]*pesoB) / (pesoA + pesoB);
			vetorC[i] = mediaPonderada;		
		}
		System.out.print("\nResultado das médias: ");
		for (int i=vetorC.length - 1; i >=0; i--) {
			System.out.printf("%d - %+2f , " , i, vetorC[i]);
		}
	}
}
