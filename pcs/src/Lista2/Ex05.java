package Lista2;

import java.util.Scanner;

public class Ex05 {
    private static Scanner entrada;

    public static void main(String args[]) {
        entrada = new Scanner(System.in);

        String html = "<html>\n<head>\n<title>Teste Programa Boa Noite - <%1$s>\n</title>\n</head>\n<body>\n<p>Boa Noite <<strong>%1$s</strong>></p>\n</body>\n</html>";
        
        System.out.print("Entre com um nome: ");
        String nomeCompleto = entrada.nextLine();
        
        System.out.println(String.format(html, nomeCompleto));
    }
}
