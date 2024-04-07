package empleado;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado{
	private int cantidadHijos;
	private int antiguedad;
	private boolean tieneConyugue;
	
	public EmpleadoPermanente(String unNombre, String unaDireccion, String unEstadoCivil, LocalDate unaFnac,
			double unSueldoBasico, int cantidadDeHijos, int antiguedad, boolean tieneConyugue) {
		super(unNombre, unaDireccion, unEstadoCivil, unaFnac, unSueldoBasico);
		// TODO Auto-generated constructor stub
		
		this.cantidadHijos = cantidadDeHijos;
		this.antiguedad    = antiguedad;
		this.tieneConyugue = tieneConyugue;
		
	}
	
	
	
	
	

	
	
	
	
}
