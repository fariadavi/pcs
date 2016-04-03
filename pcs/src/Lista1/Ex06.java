package Lista1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex06 {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.print("Entre com dois numeros inteiros:\nLimite inferior: ");
		int min = entrada.nextInt();
		System.out.print("Limite superior: ");
		int max = entrada.nextInt();

		if (min > max) {
			System.out.println("Limite inferior maior que limite superior");
			return;
		}

		int qtdeInt = max - min + 1;
		boolean qtdeIntEhPar = ehPar(qtdeInt);

		int qtdeImpares = qtdeInt / 2;
		int sum = (min + max) * qtdeInt / 2;

		if (!qtdeIntEhPar)
			qtdeImpares = ehPar(min) ? qtdeImpares : qtdeImpares++;

		System.out.println("min: " + min);
		System.out.println("max: " + max);

		System.out.println("\nsoma: " + sum);
		System.out.println("qtde números: " + qtdeInt);
		System.out.println("n. ímpares: " + qtdeImpares);

		for (int i = min; i <= max; i++) {

			List<Integer> divisores = new ArrayList<Integer>();

			for (int j = 1; j <= i; j++)
				if (i % j == 0)
					divisores.add(j);

			String paridade = "par";
			if (!ehPar(i))
				paridade = "ímpar";

			System.out.println("\n" + i + " é " + paridade);
			System.out.print("divisores de " + i + ": ");
			
			Iterator<Integer> iterator = divisores.iterator();
			Integer next = iterator.next();
			while (iterator.hasNext()) {
				System.out.print(next + ", ");
				next = iterator.next();
			}
			System.out.print(next + ".");
		}
	}

	private static boolean ehPar(int num) {
		return num % 2 == 0;
	}
}
