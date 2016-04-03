package Lista1;

import java.util.Scanner;

public class Ex12 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		int dist, comb;
		double consumoMedio = 0.0;

		do {
			System.out.print("Entre a distância percorrida(em km) ou -1 para encerrar: ");
			dist = entrada.nextInt();

			if (dist == -1)
				break;

			System.out.print("Entre a quantidade de combustível(em litros): ");
			comb = entrada.nextInt();

			consumoMedio += dist * 1.0 / comb;
			System.out.println("Consumo = " + dist * 1.0 / comb);
		} while (comb != -1);

		System.out.print("Consumo Médio: " + consumoMedio);
	}
}
