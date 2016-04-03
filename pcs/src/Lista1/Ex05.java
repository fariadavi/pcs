package Lista1;
import java.util.Scanner;

public class Ex05 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.print("Entre com quatro numeros decimais desejados:\na: ");
		float a = entrada.nextFloat();
		System.out.print("b: ");
		float b = entrada.nextFloat();
		System.out.print("c: ");
		double c = entrada.nextDouble();
		System.out.print("d: ");
		double d = entrada.nextDouble();

		System.out.println("sum Float = " + (a + b));
		System.out.println("sum Double = " + (c + d));

		System.out.println("mult Float = " + (a * b));
		System.out.println("mult Double = " + (c * d));

		System.out.println("subt Float = " + (a - b));
		System.out.println("subt Double = " + (c - d));

		System.out.println("div Float = " + (a / b));
		System.out.println("div Double = " + (c / d));

		double subt = 2.0 - 1.1;
		System.out.println("\n" + subt);
		System.out.println(subt == 0.9);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
	}
}