package empresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {

	Empresa empresa;
	
	@BeforeEach
	public void setUp() throws Exception {

		empresa = new Empresa("La molinera hacienda", 202392391);

	}

	@Test
	public void testNombre() {

		assertEquals(empresa.getNombre(), "La molinera hacienda");

	}
	@Test
	public void testCuit() {

		assertEquals(empresa.getCuit(),202392391);

	}
}
