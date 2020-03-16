package Rugby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Jornada {

	private Date fecha;

	Collection partidos = new ArrayList<Partido>();
	
	public Collection getPartidos() {
		return partidos;
	}

	public void setPartidos(Collection partidos) {
		this.partidos = partidos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Jornada(Date fecha) {
		super();
		this.fecha = fecha;
	}
	
	
}
