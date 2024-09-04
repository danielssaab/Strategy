public class OperacaoCarro implements Operacao {

	@Override
	public float calcular(float distancia, float tarifaBase) {
		// Tarifa de carro é baseada na distância vezes uma tarifa base
		return distancia * tarifaBase;
	}
}