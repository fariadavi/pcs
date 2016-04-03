package Lista1;

import java.util.Scanner;

public class Ex14 {
	private static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		boolean cont = true;
		int numPedido = 0, qtdeTotalA = 0, qtdeTotalB = 0, precoTotalA = 0, precoTotalB = 0;
		
		do {
			numPedido++;
			
			System.out.print("\nEntre qtde para o produto A: ");
			int qtdeA = entrada.nextInt();
			System.out.print("Entre qtde para o produto B: ");
			int qtdeB = entrada.nextInt();
			
			int precoA = qtdeA > 5  ? 8  : 10;
			int precoB = qtdeB > 20 ? 16 : qtdeB > 10 ? 18 : 20;
			
			int totalA = precoA * qtdeA;
			int totalB = precoB * qtdeB;
			
			System.out.println("\nPedido " + numPedido + "\nA: Quantidade: " + qtdeA + ", Preço Unitário: R$" + precoA + ",00; Total: R$" + totalA + ",00."
					+ "\nB: Quantidade: " + qtdeB + ", Preço Unitário: R$" + precoB + ",00; Total: R$" + totalB + ",00"
							+ "\nTotal Geral: R$" + (totalA + totalB) + ",00");
			
			qtdeTotalA += qtdeA;
			qtdeTotalB += qtdeB;
			precoTotalA += totalA;
			precoTotalB += totalB;
			
			System.out.print("\nDeseja fazer novo pedido? ");
			cont = entrada.next().matches("(?i)s(im)?");
			System.out.println("__________________________");
		} while (cont);
		
		
		System.out.println("\n\nTotal dos Pedidos:\nA: Quantidade: " + qtdeTotalA + "; Total: R$" + precoTotalA + ",00."
				+ "\nB Quantidade: " + qtdeTotalB + "; Total: R$" + precoTotalB + ",00"
						+ "\nTotal Geral: R$" + (precoTotalA + precoTotalB) + ",00");
	}
}
