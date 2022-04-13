package TecnicasDeProgramacaoJava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercicios01 {
    public static void main(String[] args) {
        // Dada uma lista de inteiros:
        List<Integer> numeros = IntStream.rangeClosed(-10,10).boxed().collect(Collectors.toList());
        System.out.println("Lista de n�meros: \n" + numeros);

        // 1. Filtrar apenas n�meros pares e exibir como string, separado por ','.
        System.out.println("Valores pares: \n" +
                numeros.stream()
                        .filter(n -> n % 2 == 0)
                        .map(Object::toString)
                        .collect(Collectors.joining(","))
                );

        // 2. Filtrar apenas n�meros impares e exibir como string, separado por ','.
        System.out.println("Valores impares: \n" +
                numeros.stream()
                        .filter(n -> n % 2 != 0)
                        .map(Object::toString)
                        .collect(Collectors.joining(","))
                );

        // 3. Filtrar apenas n�meros positivos e agrupar em n�meros pares e �mpares.
        System.out.println("Valores positivos: \n" +
                numeros.stream()
                        .filter(n -> n >= 0)
                        .collect(Collectors.groupingBy(n -> (n % 2 == 0)?"Par":"Impar"))
                );
    }
}