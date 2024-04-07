package empleado;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	Empleado empleado;

	@BeforeEach
	public void setUp() throws Exception {

		empleado = new Empleado("Pedro", "calle falsa 123", "Soltero", LocalDate.of(1992, Month.JANUARY, 8), 100000.0);
	}

	@Test
	void testEdadEmpleado() {
		assertEquals(empleado.getEdadActual(), 32);
	}

}
