package Lista1;
import java.util.Scanner;

public class Ex11 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		String entradaStr = fazPergunta("Entre a nota da avalia��o pr�tica: ");

		int notaPratica = Integer.valueOf(entradaStr);

		while (!entradaStr.matches("\\d{0,3}") || notaPratica < 0 || notaPratica > 100)
			entradaStr = fazPergunta("\nEntre uma nota v�lida da avalia��o pr�tica: ");

		boolean fezProva = true;

		if (notaPratica >= 70) {
			entradaStr = fazPergunta("\nVoc� fez a prova te�rica? (Sim/Nao)");

			while (!(entradaStr.equalsIgnoreCase("Sim") || entradaStr.equalsIgnoreCase("Nao")))
				entradaStr = fazPergunta("\nResposta inv�lida!\nVoc� fez a prova te�rica? (Sim/Nao)\n");

			fezProva = entradaStr.equalsIgnoreCase("Sim") ? true : false;
		}

		int notaTeorica = 0;
		if (fezProva) {
			entradaStr = fazPergunta("\nEntre a nota da avalia��o te�rica: ");

			notaTeorica = Integer.valueOf(entradaStr);

			while (!entradaStr.matches("\\d{0,3}") || notaTeorica < 0 || notaTeorica > 100)
				entradaStr = fazPergunta("\nEntre uma nota v�lida da avalia��o te�rica: ");
		}

		int notaFinal = calculaNota(notaPratica, notaTeorica, fezProva);
		
		System.out.println("A nota final do aluno na avalia��o foi " + notaFinal);
	}

	private static int calculaNota(int notaPratica, int notaTeorica, boolean fezProva) {
		int nota;

		int maiorNota = (notaPratica >= notaTeorica) ? notaPratica : notaTeorica;
		int menorNota = (notaPratica < notaTeorica) ? notaPratica : notaTeorica;

		if (notaPratica >= 70)
			if (fezProva)
				if (notaPratica >= 85)
					nota = (maiorNota * 4 + menorNota) / 5;
				else
					nota = (maiorNota * 3 + menorNota) / 4;
			else
				nota = notaPratica;
		else if (notaPratica >= 50)
			nota = (maiorNota * 2 + menorNota) / 3;
		else
			nota = (notaPratica + notaTeorica) / 2;

		return nota;
	}

	private static String fazPergunta(String questao) {
		System.out.print(questao);
		return entrada.next();
	}
}
