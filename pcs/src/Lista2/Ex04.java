package Lista2;

import java.util.Scanner;

public class Ex04 {
    private static Scanner entrada;

    public static void main(String args[]) {
        entrada = new Scanner(System.in);
        String iniciais = "";
        
        System.out.print("Entre com o seu nome: ");
        String nomeCompleto = entrada.nextLine();
        
        String[] nomes = nomeCompleto.split("\\s");
        
        for (String nome : nomes) {
            if(nome.equalsIgnoreCase("e") || nome.matches("(?i)^d[aeiou](s)?$"))
                continue;
            iniciais = iniciais.concat(nome.substring(0, 1));
        }
        
        System.out.println("Sua iniciais são: " + iniciais);
    }
}
