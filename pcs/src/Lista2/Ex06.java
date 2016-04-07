package Lista2;

import java.util.Scanner;

public class Ex06 {
    private static Scanner entrada;

    public static void main(String args[]) {
        entrada = new Scanner(System.in);

        System.out.print("Entre com uma frase: ");
        String frase = entrada.nextLine();

        int qtdeCarac = frase.replace(" ", "").length();
        int qtdePalavras = frase.split("\\s").length;
        System.out.println("Sua frase contém " + qtdeCarac + " caractere" + (qtdeCarac > 1 ? "s" : "") + " e " + qtdePalavras + " palavra" + (qtdePalavras > 1 ? "s" : ""));
    }
}
