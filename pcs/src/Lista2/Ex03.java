package Lista2;

import java.util.Scanner;

public class Ex03 {

	private static Scanner entrada; 
	
	public static void main(String args[]) {
		entrada = new Scanner(System.in);
		
		System.out.print("Entre com seu salário: ");
		String entry = entrada.next();
		
		while (!entry.matches("^\\d+([,.]\\d{2})?$")) {
			System.out.print("Entre com um salário válido: ");
			entry = entrada.next();
		}
	}
}