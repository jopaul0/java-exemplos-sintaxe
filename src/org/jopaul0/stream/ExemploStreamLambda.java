package org.jopaul0.stream;

import java.util.*;

public class ExemploStreamLambda {
    public static void main(String[] args) {
        List<String> linguagens = Arrays.asList("Java", "Python", "JavaScript", "C", "PHP", "TypeScript");

        System.out.println("--- JEITO ANTIGO (For e If) ---");
        List<String> filtradosAntigo = new ArrayList<>();
        for (String s : linguagens) {
            if (s.length() > 5) {
                filtradosAntigo.add(s.toUpperCase());
            }
        }
        Collections.sort(filtradosAntigo);
        for (String s : filtradosAntigo) {
            System.out.println(s);
        }

        System.out.println("\n--- JEITO MODERNO (Stream e Lambda/Arrow Function) ---");
        linguagens.stream()
                .filter(s -> s.length() > 5) // Filtra: (s) => s.length > 5
                .map(s -> s.toUpperCase()) // Mapeia: (s) => s.toUpperCase()
                .sorted() // Ordena
                .forEach(s -> System.out.println(s)); // Exibe: (s) => console.log(s)
    }
}
