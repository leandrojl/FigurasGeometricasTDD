package ar.unlam.clase3ProgramacionAvanzada2FigurasGeometricas;

public class Figuras extends Punto{
	
	private Punto posicion;
	private Double landaX;
	private Double landaY;
	
	public Figuras() {
		
	}
	

	public Figuras(Double x, Double y, Punto posicion, Double landaX, Double landaY) {
		super(x, y);
		this.posicion = posicion;
		this.landaX = landaX;
		this.landaY = landaY;
	}
	
	public Figuras(Punto posicion, Double landaX, Double landaY) {
		
		this.posicion = posicion;
		this.landaX = landaX;
		this.landaY = landaY;
	}


	public Figuras(Double x, Double y) {
		super(x, y);
	}

	public Punto getPosicion() {
		return posicion;
	}

	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}

	public Double getLandaX() {
		return landaX;
	}

	public void setLandaX(Double landaX) {
		this.landaX = landaX;
	}

	public Double getLandaY() {
		return landaY;
	}

	public void setLandaY(Double landaY) {
		this.landaY = landaY;
	}
	

}
