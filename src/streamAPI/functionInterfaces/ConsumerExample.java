package streamAPI.functionInterfaces;

/*
 * Representa uma operação que aceita um argumento do tipo T e não restorna nanhum resultado.
 * É utilizada principalemente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {

    public static void main(String[] args) {

        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão Lambda para imprimir números pares
        Consumer<Integer> imprimirNumerosPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);

            }
        };

        //Usar o Consumer para imprimir números pares no Stream
        // numeros.stream().forEach(imprimirNumerosPar); <-- Passando o Consumer implementado acima

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
