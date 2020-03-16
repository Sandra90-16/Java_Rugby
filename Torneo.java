package Rugby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Torneo {
	
	private Date año;
	
	Collection jornada = new ArrayList<Jornada>();
	
	public Collection getJornada() {
		return jornada;
	}

	public void setJornada(Collection jornada) {
		this.jornada = jornada;
	}

	public Date getAño() {
		return año;
	}
	
	public void setAño(Date año) {
		this.año = año;
	}
	
	public Torneo(Date año) {
		super();
		this.año = año;
	}
	 
	 public void mostrarGanador() {
		 
	 }
	 
	 public void mostrarClasificacion() {
		 
	 }
	 
}

