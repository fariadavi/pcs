package l2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex08 {
    private static Scanner entrada;

    public static void main(String args[]) {
        entrada = new Scanner(System.in);

        Map<String, String> mapaEstados = new HashMap<String, String>();

        mapaEstados.put("AC", "Acre");
        mapaEstados.put("AL", "Alagoas");
        mapaEstados.put("AP", "Amap�");
        mapaEstados.put("AM", "Amazonas");
        mapaEstados.put("BA", "Bahia");
        mapaEstados.put("CE", "Cear�");
        mapaEstados.put("DF", "Distrito Federal");
        mapaEstados.put("ES", "Esp�rito Santo");
        mapaEstados.put("GO", "Goi�s");
        mapaEstados.put("MA", "Maranh�o");
        mapaEstados.put("MT", "Mato Grosso");
        mapaEstados.put("MS", "Mato Grosso do Sul");
        mapaEstados.put("MG", "Minas Gerais");
        mapaEstados.put("PA", "Par�");
        mapaEstados.put("PB", "Para�ba");
        mapaEstados.put("PR", "Paran�");
        mapaEstados.put("PE", "Pernambuco");
        mapaEstados.put("PI", "Piau�");
        mapaEstados.put("RJ", "Rio de Janeiro");
        mapaEstados.put("RN", "Rio Grande do Norte");
        mapaEstados.put("RS", "Rio Grande do Sul");
        mapaEstados.put("RO", "Rond�nia");
        mapaEstados.put("RR", "Roraima");
        mapaEstados.put("SC", "Santa Catarina");
        mapaEstados.put("SP", "S�o Paulo");
        mapaEstados.put("SE", "Sergipe");
        mapaEstados.put("TO", "Tocantins");

        System.out.print("Entre com uma sigla de estado: ");
        String sigla = entrada.nextLine();

        String estado = mapaEstados.get(sigla.toUpperCase());
        System.out.println("Voc� escolheu" + (estado == null ? " uma sigla inv�lida!" : ": " + estado));
    }
}
