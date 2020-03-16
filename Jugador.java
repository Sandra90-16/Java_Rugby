package Rugby;

import java.util.Date;

public class Jugador extends Persona{

	int posicion;
	
	public Jugador(String nombre, Date fechaNacimiento, int posicion) {
		super(nombre, fechaNacimiento);
		this.posicion = posicion;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
}
