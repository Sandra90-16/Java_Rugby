package Rugby;

import java.util.ArrayList;
import java.util.Collection;

public class Equipo {
	
private Pais nombre;

Collection jugadores = new ArrayList<Jugador>();
Collection partidos = new ArrayList<Partido>();
Entrenador entrenador;
Estadio estadio; 

public Collection getJugadores() {
	return jugadores;
}

public void setJugadores(Collection jugadores) {
	this.jugadores = jugadores;
}


public Entrenador getEntrenador() {
	return entrenador;
}

public void setEntrenador(Entrenador entrenador) {
	this.entrenador = entrenador;
}


public Pais getNombre() {
	return nombre;
}

public void setNombre(Pais nombre) {
	this.nombre = nombre;
}

public Equipo() {
	super();

}

}
