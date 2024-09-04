
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransporteTest {

	@Test
	void deveCalcularTarifaCarro() {
		Transporte transporte = new Transporte();
		transporte.calcularTarifaCarro(10.0f, 2.0f);
		assertEquals(20.0f, transporte.getTarifa());
	}

	@Test
	void deveCalcularTarifaOnibus() {
		Transporte transporte = new Transporte();
		transporte.calcularTarifaOnibus(10.0f, 5.0f);
		assertEquals(20.0f, transporte.getTarifa());
	}

	@Test
	void deveCalcularTarifamotocicleta() {
		Transporte transporte = new Transporte();
		transporte.calcularTarifamotocicleta(10.0f, 0.0f);
		assertEquals(5.0f, transporte.getTarifa());
	}
}
