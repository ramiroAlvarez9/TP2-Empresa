package empleado;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fnac;
	private double sueldoBasico;
	
	public Empleado(String unNombre, String unaDireccion, String unEstadoCivil, LocalDate unaFnac, double unSueldoBasico) {
		
		this.nombre       = unNombre;
		this.direccion    = unaDireccion;
		this.estadoCivil  = unEstadoCivil;
		this.fnac         = unaFnac;
		this.sueldoBasico = unSueldoBasico;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String direccion() {
		return this.direccion;
	}
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	public int getEdadActual(){
		 return Period.between( this.fnac , LocalDate.now() ).getYears();  		
	}
	public double getSueldoBasico(){
		return this.sueldoBasico;
	}
	

}
