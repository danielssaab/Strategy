public class OperacaoMotocicleta implements Operacao {

	@Override
	public float calcular(float distancia, float tarifaBase) {
		// Tarifa de motocicleta é um valor fixo por distância (tarifa base é ignorada)
		return distancia * 0.5f;
	}
}