public class CalculadoraTarifa {

	private float distancia;
	private float tarifaBase;

	public CalculadoraTarifa(float distancia, float tarifaBase) {
		this.distancia = distancia;
		this.tarifaBase = tarifaBase;
	}

	public float calcular(Operacao operacao) {
		return operacao.calcular(distancia, tarifaBase);
	}
}