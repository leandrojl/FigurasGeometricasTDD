package ar.unlam.clase3ProgramacionAvanzada2FigurasGeometricas;

public class Rectangulo extends Figuras{

	public Rectangulo(Punto punto, double landaX, double landaY) {
		super(punto,landaX,landaY);
	}

	public Object getArea() {
		// TODO Auto-generated method stub
		return getLandaX()*getLandaY();
	}
	
	

}
