package empleado;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPermanenteTest {

	EmpleadoPermanente empleadoPermanente;
	
	@BeforeEach
	void setUp() throws Exception {
		empleadoPermanente = new EmpleadoPermanente("Juan", "av siempre viva 123", "soltero", 	
				LocalDate.of(1985, Month.JANUARY, 8), 120000.0 , 2 , 5 , false);
	
	}

	@Test
	void testNombreEmpleadoPermanente() {
		
		assertEquals(empleadoPermanente.getNombre(), "Juan");
			
	}

}
