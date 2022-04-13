package TecnicasDeProgramacaoJava;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Ex03 {

	public static class Exercicio03 {
        public static void main(String[] args) {
            // 3. Qual a data/hora neste instante no fuso -02:00
            System.out.println("Em GMT-02:00 são: " + OffsetDateTime.now(ZoneOffset.of("-02:00")));
        }
    }

}
