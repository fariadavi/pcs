package Lista1;
import java.util.Scanner;

public class Ex10 {

	public enum TamanhoPizza {
		BROTINHO(10), GRANDE(18), FAMILIA(25);

		public int precoPizza;

		TamanhoPizza(int preco) {
			precoPizza = preco;
		}

		int getPreco() {
			return precoPizza;
		}
	}

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.print("1 - Brotinho\n2 - Grande\n3 - Família\nEntre o código da pizza desejada: ");

		TamanhoPizza pizza;
		switch (entrada.nextInt()) {
		case 1:
			pizza = TamanhoPizza.BROTINHO;
			break;
		case 2:
			pizza = TamanhoPizza.GRANDE;
			break;
		case 3:
			pizza = TamanhoPizza.FAMILIA;
			break;
		default:
			System.out.println("\nEscolha inválida.");
			return;
		}

		System.out.println("\nPizza escolhida: " + pizza.toString() + ", preço: R$" + pizza.getPreco() + ",00.");

	}
}
