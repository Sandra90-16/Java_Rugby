package Rugby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Torneo {
	
	private Date a�o;
	
	Collection jornada = new ArrayList<Jornada>();
	
	public Collection getJornada() {
		return jornada;
	}

	public void setJornada(Collection jornada) {
		this.jornada = jornada;
	}

	public Date getA�o() {
		return a�o;
	}
	
	public void setA�o(Date a�o) {
		this.a�o = a�o;
	}
	
	public Torneo(Date a�o) {
		super();
		this.a�o = a�o;
	}
	 
	 public void mostrarGanador() {
		 
	 }
	 
	 public void mostrarClasificacion() {
		 
	 }
	 
}

