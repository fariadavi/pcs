package Lista1;
import java.util.Scanner;

public class Ex07 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.print("1 - Solteiro\n2 - Casado\n3 - Divorciado\n4 - Vi�vo\nEntre o c�digo do seu estado civil: ");

		String strChoice = "";
		switch (entrada.nextInt()) {
			case 1:
				strChoice = "Solteiro";
				break;
			case 2:
				strChoice = "Casado";
				break;
			case 3:
				strChoice = "Divorciado";
				break;
			case 4:
				strChoice = "Vi�vo";
				break;
			default:
				strChoice = "Inv�lido";
		}

		System.out.println("\nEscolhido: " + strChoice);
	}
}
