package Lista1;
public class Ex03 {

	public static void main(String[] args) {
		float a = 1.0f, b = 6.5f;
		double c = 5.2, d = 7.4;

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
