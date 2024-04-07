package empresa;

import java.util.ArrayList;

public class Empresa {
	
	String nombre;
	int    cuit;
	
	ArrayList<String> empleados       = new ArrayList<>();
	ArrayList<String> recibosDeSueldo = new ArrayList<>();
	
	public Empresa(String unNombre, int unCuil) {
	
		this.nombre = unNombre;
		this.cuit   = unCuil;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCuit() {
		return this.cuit;
	}
	
	public void generarReciboDeSueldoDeEmpleados() {
		return ;
	}		
	

	
	
	
}
