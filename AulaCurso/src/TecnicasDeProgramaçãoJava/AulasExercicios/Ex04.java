package TecnicasDeProgramacaoJava;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Ex04 {

	public static class Exercicio04 {
        public static void main(String[] args) {
            // 4. Formatar uma data no seguinte padrão: "19:00:00, 17 de março de 2022 (fuso: -03:00)"
            OffsetDateTime offsetDateTime = OffsetDateTime
                    .of(2022, 3, 17, 19, 0, 0, 0, ZoneOffset.of("-3"));
            System.out.println(offsetDateTime.format(DateTimeFormatter
                            .ofPattern("HH:mm:ss', 'd 'de 'LLLL 'de 'yyyy '(fuso: 'xxx')'")));
        }
    }
}
