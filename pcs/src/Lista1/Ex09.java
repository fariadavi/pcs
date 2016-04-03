package Lista1;
import java.util.Scanner;

public class Ex09 {

	private static Scanner entrada;
	private static final double pi = 3.14159;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.print("Entre o raio da esfera: ");
		int raio = entrada.nextInt();

		System.out.println("Área = " + 4 * pi * raio * raio);
		System.out.println("Volume = " + 4.0 / 3 * pi * raio * raio * raio);
	}
}