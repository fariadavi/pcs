package Lista2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex03 {

    private static Scanner entrada;

    public static void main(String args[]) {
        entrada = new Scanner(System.in);
        BigDecimal aliquota = null, deducao = null;

        String entry;
        do {
            System.out.print("Entre com o valor de seu salário nos últimos 12 meses: ");
            entry = entrada.next();
        } while (!entry.matches("^(\\d{3}\\.?)*\\d+([,.]\\d{2})?$"));

        BigDecimal value = new BigDecimal(entry.replace("[^\\d]", "").replace(",", "."));

        switch (value.compareTo(new BigDecimal(1499.15))) {
            case -1:
            case 0:
                aliquota = new BigDecimal(0);
                deducao = new BigDecimal(0);
                break;
            case 1:
                switch(value.compareTo(new BigDecimal(2246.75))) {
                    case -1:
                    case 0:
                        aliquota = new BigDecimal(0.075);
                        deducao = new BigDecimal(112.43);
                        break;
                    case 1:
                        switch(value.compareTo(new BigDecimal(2995.70))) {
                            case -1:
                            case 0:
                                aliquota = new BigDecimal(0.15);
                                deducao = new BigDecimal(280.94);
                                break;
                            case 1:
                                switch(value.compareTo(new BigDecimal(3743.19))) {
                                    case -1:
                                    case 0:
                                        aliquota = new BigDecimal(0.225);
                                        deducao = new BigDecimal(505.62);
                                        break;
                                    case 1:
                                        aliquota = new BigDecimal(0.275);
                                        deducao = new BigDecimal(692.78);
                                        break;
                                }
                        }        
                }
        }
        
        System.out.println("IR devido: " + value.multiply(aliquota).add(deducao.negate()) + " reais.");
    }
}
