package enunciado;

import java.util.Iterator;
import java.util.List;

public class Equipo {
	private String nombre; 
	private List <Persona> plantel;
	private Double presupuestoMaximoEquipo;
	
	public Equipo (String nombre, Double presupuestoMaximoEquipo) {
		
		
	}
	
	//No se puede agregar mas de 23 jugadores 
	//No puede agregar mas jugadores del presupuesto del equipo
	public  Boolean agregarPersona (Persona Persona) throws plantelExcedidoExeption, faltaPresupuestoException
	{
		return null;
	}
	
	public Double calcularPresupuestoDisponible () {
		return null;
		
	}
	
	public Persona buscarPersona(Integer numeroDeCamiseta) throws PersonaNoEncontradaException {


		return null;
	}

	
	public void eliminarPersona(Persona persona) throws PersonaNoEncontradaException{
		
		
	}
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getPlantel() {
		return plantel;
	}

	public void setPlantel(List<Persona> plantel) {
		this.plantel = plantel;
	}

	public Double getPresupuestoMaximoEquipo() {
		return presupuestoMaximoEquipo;
	}

	public void setPresupuestoMaximoEquipo(Double presupuestoMaximoEquipo) {
		this.presupuestoMaximoEquipo = presupuestoMaximoEquipo;
	}

	
	
	

}
