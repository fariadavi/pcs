package Lista3.Ex03;

public class TrechoViagem {

	private double distanciaPercorrida, volumeCombustivel;
	
	public TrechoViagem(double dist, double comb) {
		setDistanciaPercorrida(dist);
		setVolumeCombustivel(comb);
	}
	
	public double getConsumoMedio() {
		return distanciaPercorrida / volumeCombustivel;
	}

	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	public double getVolumeCombustivel() {
		return volumeCombustivel;
	}

	public void setVolumeCombustivel(double volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}
}
