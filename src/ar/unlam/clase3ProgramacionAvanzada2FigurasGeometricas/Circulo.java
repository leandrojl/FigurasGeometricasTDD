package ar.unlam.clase3ProgramacionAvanzada2FigurasGeometricas;

public class Circulo extends Figuras{
	
	

	public Circulo(Punto punto, Double radio1) {
		super(punto,radio1,radio1);
	}

	public Double getArea() {
		// TODO Auto-generated method stub
		return 3.14*(getLandaX()*getLandaX());
	}

}
