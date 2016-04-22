package Lista3;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static class Empregado {
		private String nome;
		private double salarioBase;
		private double taxaDesconto;
		private double altura;

		public Empregado(String nome, double salario, double taxa, double altura) {
			this.setNome(nome);
			this.setSalarioBase(salario);
			this.setTaxaDesconto(taxa);
			this.setAltura(altura);
		}

		public Empregado(String nome, double salario, double altura) {
			this.setNome(nome);
			this.setSalarioBase(salario);
			this.setTaxaDesconto(0.1);
			this.setAltura(altura);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getSalarioBase() {
			return salarioBase;
		}

		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}

		public double getTaxaDesconto() {
			return taxaDesconto;
		}

		public void setTaxaDesconto(double taxaDesconto) {
			this.taxaDesconto = taxaDesconto;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		public double getPagamentoLiquido() {
			return salarioBase * (1 - taxaDesconto);
		}
	}

	public static void main(String args[]) {
		List<Empregado> empregados = new ArrayList<Empregado>();
		empregados.add(new Empregado("Jonas", 5000.90, 1.80));
		empregados.add(new Empregado("José", 4000, 0.08, 2));
		empregados.add(new Empregado("Maria", 3000.50, 0.06, 1.60));
		empregados.add(new Empregado("Antônio", 900.1, 0.03, 1.75));

		for (Empregado empregado : empregados) {
			System.out.println(empregado.getNome() + ": " + empregado.getPagamentoLiquido());
		}
	}
}
