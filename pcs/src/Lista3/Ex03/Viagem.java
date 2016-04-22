package Lista3.Ex03;

public class Viagem {

	TrechoViagem[] viagens;
	int numTrechos;

	public Viagem(int maxTrechos) {
		viagens = new TrechoViagem[maxTrechos];
		numTrechos = 0;
	}

	public void adicionarTrecho(double distPercorrida, double volumeComb) {
		viagens[numTrechos++] = new TrechoViagem(distPercorrida, volumeComb);
	}

	public double getConsumoMedio() {
		return getDistanciaTotal() / getVolumeCombustivelTotal();
	}

	public double getDistanciaTotal() {
		double totalDist = 0.0;
		for (int i = 0; i < numTrechos; i++)
			totalDist += viagens[i].getDistanciaPercorrida();

		return totalDist;
	}

	public double getVolumeCombustivelTotal() {
		double totalCombustivel = 0.0;
		for (int i = 0; i < numTrechos; i++)
			totalCombustivel += viagens[i].getVolumeCombustivel();
		return totalCombustivel;
	}

	public int getNumTrechos() {
		return numTrechos;
	}

	public TrechoViagem[] getTrechos() {
		TrechoViagem[] trechos = new TrechoViagem[numTrechos];
		System.arraycopy(viagens, 0, trechos, 0, numTrechos);
		return trechos;
	}
}
