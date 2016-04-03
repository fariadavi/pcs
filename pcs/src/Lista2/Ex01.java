package Lista2;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex01 {
	static Scanner entrada;

	public static void main(String args[]) {
		entrada = new Scanner(System.in);

		System.out.print("Entre uma palavra ou frase: ");
		String entry = entrada.nextLine();

		String normalizedEntry = Normalizer.normalize(entry, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		String replacedSpecial = normalizedEntry.replaceAll("[^\\w\\d]", "").toLowerCase();

		int stringLength = replacedSpecial.length();
		boolean palindromo = true;

		for (int i = 0; i < stringLength / 2; i++) {
			if (replacedSpecial.charAt(i) != replacedSpecial.charAt(stringLength - 1 - i)) {
				palindromo = false;
				break;
			}
		}

		System.out.println("\nA string entrada " + (palindromo ? "" : "não ") + "é um palíndromo!");
		System.out.println("A string entrada tem " + normalizedEntry.length() + " caracteres (incluindo espaço)!");
		System.out.println("A string entrada tem " + replacedSpecial.replaceAll("[^aeiou]", "").length() + " vogais!");
		System.out.println("A string entrada tem " + replacedSpecial.replaceAll("[^0-9]", "").length() + " digitos!");
		System.out.println("A string entrada em letras maiúsculas: " + entry.toUpperCase());
		System.out.println("A string entrada " + (replacedSpecial.startsWith("bra") ? "" : "não ") + "começa com \"BRA\"!");
		System.out.println("A string entrada " + (replacedSpecial.endsWith("sil") ? "" : "não ") + "termina com \"SIL\"!");
		System.out.println("A string entrada " + (replacedSpecial.contains("la") ? "" : "não ") + "possui ocorrência de \"LA\"!");
	}
}
