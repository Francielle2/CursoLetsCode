package AulaArrays;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
// Faça  um  Programa que  leia  um   vetor  de  10   caracteres,  e  diga  quantas   consoantes foram lidas. Imprima as consoantes.

		Scanner scanner = new Scanner(System.in);
		
		int totalConsoante = 0;
		
		String[] letras = new String[10];
		String[] consoantes = new String[10];
		
		for (int i=0; i<letras.length; i++) {	
			System.out.println("Digite a "+(i+1)+"ª letra: ");
			letras[i] = scanner.nextLine();
		}
		
		for (String letra:letras) {	
			if(isConsoante(letra)) {
				consoantes[totalConsoante] = letra;
				totalConsoante++;
			}
			
		}	
		System.out.println("Total de consoantes: "+totalConsoante);
		for(int i=0; i<totalConsoante; i++) {
			System.out.println(consoantes[i]);
		}
	}

public static boolean isConsoante(String letra) {
		boolean isConsoante;
		switch (letra.toLowerCase(Locale.ROOT)) {
		case "a":
			isConsoante = false;
			break;
		case "e":
			isConsoante = false;
			break;
		case "i":
			isConsoante = false;
			break;
		case "o":
			isConsoante = false;
			break;
		case "u":
			isConsoante = false;
		default:
			isConsoante = true;
	}
		return isConsoante;
	}
}