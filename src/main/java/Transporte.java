public class Transporte {

	private float tarifa;

	public float getTarifa() {
		return tarifa;
	}

	public void calcularTarifaCarro(float distancia, float tarifaBase) {
		CalculadoraTarifa calculadora = new CalculadoraTarifa(distancia, tarifaBase);
		this.tarifa = calculadora.calcular(new OperacaoCarro());
	}

	public void calcularTarifaOnibus(float distancia, float tarifaBase) {
		CalculadoraTarifa calculadora = new CalculadoraTarifa(distancia, tarifaBase);
		this.tarifa = calculadora.calcular(new OperacaoOnibus());
	}

	public void calcularTarifamotocicleta(float distancia, float tarifaBase) {
		CalculadoraTarifa calculadora = new CalculadoraTarifa(distancia, tarifaBase);
		this.tarifa = calculadora.calcular(new OperacaoMotocicleta());
	}
}
