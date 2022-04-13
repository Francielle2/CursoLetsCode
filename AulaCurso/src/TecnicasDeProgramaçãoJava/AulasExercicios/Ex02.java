package TecnicasDeProgramacaoJava;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex02 {
	
	public static class Exercicio02 {
	    public static void main(String[] args) {
	        // 2. Qual a data/hora neste instante no fuso de "Portugal"
	        System.out.println("Em Portugal são: " + ZonedDateTime.now(ZoneId.of("Portugal")));
	    }
	}
}