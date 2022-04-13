package AulaArrays;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
//Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista.
//Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual.
//E em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).


		Scanner scanner = new Scanner(System.in);
		
		float[] meses = new float[12];
		String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		float mediaTemperatura = 0;
		
		for (int i=0; i<meses.length; i++) {
			System.out.printf("Qual a média de temperatura dos mes %s: \n", nomesMeses[i]);
			meses[i] = scanner.nextFloat();
			scanner.nextLine();
			
			mediaTemperatura += meses[i];
		}
		
		mediaTemperatura = mediaTemperatura / 12;
		
		System.out.println("A média da temperatura anual foi de: " +mediaTemperatura);
		
			for (int i=0; i<meses.length; i++) {
				if(meses[i] > mediaTemperatura) {
					System.out.printf("A temperatura do mês %s foi %.2f: \n", nomesMeses[i], meses[i]);
			}
		}
	} 
  }
