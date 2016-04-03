package Lista1;
public class Ex02 {

	public static void main(String[] args) {
		int a = 4, b = 5;

		int sum = a + b;
		int mult = a * b;
		int subt = a - b;
		int divInt = a / b;
		double divDec = a * 1.0 / b;
		int div = (int) Math.round(divDec);

		System.out.println("a+b = " + sum);
		System.out.println("a*b = " + mult);
		System.out.println("a-b = " + subt);
		System.out.println("(Inteiro) a/b = " + divInt);
		System.out.println("(Decimal) a/b = " + divDec);
		System.out.println("(Arrendondado) a/b = " + div);
	}
}