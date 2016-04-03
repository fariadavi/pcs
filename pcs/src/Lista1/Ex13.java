package Lista1;

import java.util.Scanner;

public class Ex13 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		int limite = 0;
		System.out.print("Entre o limite para a sequência: ");
		limite = entrada.nextInt();

		for (int i = 0, fibAux, fibOld = 0, fib = 1; fibOld <= limite; i++, fibAux = fib, fib += fibOld, fibOld = fibAux)
			System.out.println("Fib(" + i + "): " + fibOld);
	}
}
