package Lista2;

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
        mapaEstados.put("AP", "Amapá");
        mapaEstados.put("AM", "Amazonas");
        mapaEstados.put("BA", "Bahia");
        mapaEstados.put("CE", "Ceará");
        mapaEstados.put("DF", "Distrito Federal");
        mapaEstados.put("ES", "Espírito Santo");
        mapaEstados.put("GO", "Goiás");
        mapaEstados.put("MA", "Maranhão");
        mapaEstados.put("MT", "Mato Grosso");
        mapaEstados.put("MS", "Mato Grosso do Sul");
        mapaEstados.put("MG", "Minas Gerais");
        mapaEstados.put("PA", "Pará");
        mapaEstados.put("PB", "Paraíba");
        mapaEstados.put("PR", "Paraná");
        mapaEstados.put("PE", "Pernambuco");
        mapaEstados.put("PI", "Piauí");
        mapaEstados.put("RJ", "Rio de Janeiro");
        mapaEstados.put("RN", "Rio Grande do Norte");
        mapaEstados.put("RS", "Rio Grande do Sul");
        mapaEstados.put("RO", "Rondônia");
        mapaEstados.put("RR", "Roraima");
        mapaEstados.put("SC", "Santa Catarina");
        mapaEstados.put("SP", "São Paulo");
        mapaEstados.put("SE", "Sergipe");
        mapaEstados.put("TO", "Tocantins");

        System.out.print("Entre com uma sigla de estado: ");
        String sigla = entrada.nextLine();

        String estado = mapaEstados.get(sigla.toUpperCase());
        System.out.println("Você escolheu" + (estado == null ? " uma sigla inválida!" : ": " + estado));
    }
}
