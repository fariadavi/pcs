package l2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
    private static Scanner entrada;

    public static void main(String args[]) {
        entrada = new Scanner(System.in);

        System.out.print("Entre com uma frase: ");
        String frase = entrada.nextLine();

        String[] split = frase.toUpperCase().split("");
        Set<String> chars = new HashSet<String>(Arrays.asList(split));

        for (String character : chars) {
            int count = 0;
            for (String i : split)
                if (i.equalsIgnoreCase(character))
                    count++;
            System.out.println("O caractere " + character + " aparece " + count + " vezes na frase.");
        }
    }
}
