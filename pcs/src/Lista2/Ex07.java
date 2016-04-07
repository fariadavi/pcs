package Lista2;

import java.util.Scanner;

public class Ex07 {
    private static Scanner entrada;

    public static void main(String args[]) {
        entrada = new Scanner(System.in);

        System.out.print("Entre com uma frase: ");
        String frase = entrada.nextLine();

        String[] split = frase.split("\\s+");

        String fraseFinal = "";
        for (String palavra : split)
            fraseFinal = fraseFinal.concat(palavra).concat(" ");

        fraseFinal = fraseFinal.trim();

        System.out.println("Sua frase sem o excesso de espaços: " + fraseFinal);
    }
}
