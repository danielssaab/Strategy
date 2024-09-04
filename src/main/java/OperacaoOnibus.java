public class OperacaoOnibus implements Operacao {

	@Override
	public float calcular(float distancia, float tarifaBase) {
		// Tarifa de ônibus é uma tarifa base mais um valor fixo por distância
		return tarifaBase + (distancia * 1.5f);
	}
}