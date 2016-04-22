package Lista3.Ex03;

import java.util.Scanner;

public class Ex03 {

	private static Scanner entrada;

	public static void main(String args[]) {
		entrada = new Scanner(System.in);

		System.out.print("Quantos trechos fazem parte da viagem? ");
		int maxTrechos = entrada.nextInt();

		Viagem viagem = new Viagem(maxTrechos);

		for (int i = 1; i <= maxTrechos; i++) {
			System.out.print("\nQual a distância percorrida no" + i + "º trecho? (em km) ");
			double distPercorrida = entrada.nextDouble();
			System.out.print("E o combustível consumido? (em litros) ");
			double volumeComb = entrada.nextDouble();
			viagem.adicionarTrecho(distPercorrida, volumeComb);
		}

		int i = 1;
		for (TrechoViagem trecho : viagem.getTrechos()) {
			System.out.println("\nTrecho " + i++ + ": " + trecho.getDistanciaPercorrida() + "km e "
					+ trecho.getVolumeCombustivel() + "litros - Consumo: " + trecho.getConsumoMedio() + "km/l");
		}

		System.out.println("\nDistância Total: " + viagem.getDistanciaTotal() + "km");
		System.out.println("Volume Combustível: " + viagem.getVolumeCombustivelTotal() + "litros");
		System.out.println("Consumo Médio: " + viagem.getConsumoMedio() + "km/l");
	}
}
