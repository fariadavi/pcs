package Lista1;
import java.util.Scanner;

public class Ex04 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.print("Entre com dois numeros inteiros:\na: ");
		int a = entrada.nextInt();
		System.out.print("b: ");
		int b = entrada.nextInt();

		int sum = a + b;
		int mult = a * b;
		int subt = a - b;
		int divInt = a / b;
		double divDec = a * 1.0 / b;
		int div = (int) Math.round(divDec);

		System.out.println("\na+b = " + sum);
		System.out.println("a*b = " + mult);
		System.out.println("a-b = " + subt);
		System.out.println("(Inteiro) a/b = " + divInt);
		System.out.println("(Decimal) a/b = " + divDec);
		System.out.println("(Arrendondado) a/b = " + div);
	}
}