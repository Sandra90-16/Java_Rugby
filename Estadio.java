package Rugby;

import java.util.ArrayList;
import java.util.Collection;

public class Estadio {

	private String nombre;
	private int capacidad;
	private String ciudad;
	
	Collection partidos = new ArrayList<Partido>();
	
	public Collection getPartidos() {
		return partidos;
	}
	public void setPartidos(Collection partidos) {
		this.partidos = partidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Estadio(String nombre, int capacidad, String ciudad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.ciudad = ciudad;
	}
	
	
}
