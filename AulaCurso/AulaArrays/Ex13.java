package AulaArrays;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
//Fa�a um programa que receba a temperatura m�dia de cada m�s do ano e armazene-as em uma lista.
//Ap�s isto, calcule a m�dia anual das temperaturas e mostre todas as temperaturas acima da m�dia anual.
//E em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro, . . . ).


		Scanner scanner = new Scanner(System.in);
		
		float[] meses = new float[12];
		String[] nomesMeses = {"Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		float mediaTemperatura = 0;
		
		for (int i=0; i<meses.length; i++) {
			System.out.printf("Qual a m�dia de temperatura dos mes %s: \n", nomesMeses[i]);
			meses[i] = scanner.nextFloat();
			scanner.nextLine();
			
			mediaTemperatura += meses[i];
		}
		
		mediaTemperatura = mediaTemperatura / 12;
		
		System.out.println("A m�dia da temperatura anual foi de: " +mediaTemperatura);
		
			for (int i=0; i<meses.length; i++) {
				if(meses[i] > mediaTemperatura) {
					System.out.printf("A temperatura do m�s %s foi %.2f: \n", nomesMeses[i], meses[i]);
			}
		}
	} 
  }
