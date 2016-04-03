package Lista1;
public class Ex08 {

	public static void main(String[] args) {
		int total = 0, i = 0;

		for (i = 0; i <= 10; i++, total += i)
			if (i % 2 != 0)
				i++;

		System.out.println(" i = " + i);
		System.out.println(" total = " + total);
	}
}
