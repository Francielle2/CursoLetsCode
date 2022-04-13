package TecnicasDeProgramacaoJava;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01 {
    public static class Exercicio01 {
        public static void main(String[] args) {
            // 1. Qual sua idade em segundos até o presente momento.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a data/hora do seu nascimento (formato: yyyy-mm-ddTHH:MM)");
            LocalDateTime dateTimeNasc = LocalDateTime.parse(scanner.next());
            System.out.println();
            System.out.printf("Você tem %,3d segundos e contando...\n",
                    dateTimeNasc.until(LocalDateTime.now(), ChronoUnit.SECONDS));
            System.out.println();
        }
    }
}