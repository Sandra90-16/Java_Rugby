package Rugby;

public class Partido {

	private int puntosLocal;
	private int puntosVisitante;
	private int bonusLocal;
	private int bonusVisitante;
	
	private Arbitro arbitro;
	
	public Arbitro getArbitro() {
		return arbitro;
	}
	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}
	public int getPuntosLocal() {
		return puntosLocal;
	}
	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}
	public int getPuntosVisitante() {
		return puntosVisitante;
	}
	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}
	public int getBonusLocal() {
		return bonusLocal;
	}
	public void setBonusLocal(int bonusLocal) {
		this.bonusLocal = bonusLocal;
	}
	public int getBonusVisitante() {
		return bonusVisitante;
	}
	public void setBonusVisitante(int bonusVisitante) {
		this.bonusVisitante = bonusVisitante;
	}
	public Partido(int puntosLocal, int puntosVisitante, int bonusLocal, int bonusVisitante) {
		super();
		this.puntosLocal = puntosLocal;
		this.puntosVisitante = puntosVisitante;
		this.bonusLocal = bonusLocal;
		this.bonusVisitante = bonusVisitante;
	}
	
	public void mostrarResultado() {
	}
}
