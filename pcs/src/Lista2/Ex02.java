package Lista2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02 {

	static Scanner entrada;
	private static Map<Character, String> numberMap;

	static {
		numberMap = new HashMap<Character, String>();

		numberMap.put('0', "zero");
		numberMap.put('1', "um");
		numberMap.put('2', "dois");
		numberMap.put('3', "três");
		numberMap.put('4', "quatro");
		numberMap.put('5', "cinco");
		numberMap.put('6', "seis");
		numberMap.put('7', "sete");
		numberMap.put('8', "oito");
		numberMap.put('9', "nove");
	}

	public static void main(String args[]) {
		entrada = new Scanner(System.in);

		System.out.print("Entre com um valor númerico: ");
		String entry = entrada.next();

		while (!entry.matches("^\\d+$")) {
			System.out.print("Entre com um valor númerico válido: ");
			entry = entrada.next();
		}

		System.out.print("\nResultado: ");
		for (int i = 0; i < entry.length(); i++)
			System.out.print(numberMap.get(entry.charAt(i)) + (i + 1 < entry.length() ? ", " : "."));
	}

}
