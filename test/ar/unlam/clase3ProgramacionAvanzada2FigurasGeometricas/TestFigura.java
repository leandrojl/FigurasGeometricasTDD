package ar.unlam.clase3ProgramacionAvanzada2FigurasGeometricas;

import org.junit.Assert;
import org.junit.Test;

public class TestFigura {
	
	@Test
	public void quePuedaCrearUnRectanguloDadoUnPuntoConUnTamanioDe2x3ConUnAreaDe6() {
		Punto punto = new Punto(1.0,1.0);
		Rectangulo rectangulo = new Rectangulo(punto,2.0,3.0);
		Double areaEsperada = 6.0;
		Assert.assertEquals(areaEsperada, rectangulo.getArea());
	}
	@Test
	public void quePuedaCrearUnCuadradoDadoUnPuntoConUnTamanioDe2x2ConUnAreaDe4() {
		Punto punto = new Punto(1.0,1.0);
		Cuadrado cuadrado = new Cuadrado(punto,2.0,2.0);
		Double areaEsperada = 4.0;
		Assert.assertEquals(areaEsperada, cuadrado.getArea());
	}
	
	@Test
	public void quePuedaCrearUnElipseDadoUnPuntoConUnTamanioYUnArea() {
		Punto punto = new Punto(1.0,1.0);
		Elipse cuadrado = new Elipse(punto,2.0,2.0);
		Double areaEsperada = 4.0;
		Assert.assertEquals(areaEsperada, cuadrado.getArea());
	}
	
	@Test
	public void quePuedaCrearUnCirculoDadoUnPuntoConUnTamanioYUnArea() {
		Punto punto = new Punto(1.0,1.0);
		Circulo circulo = new Circulo(punto,2.0);
		Double areaEsperada=12.56;
		Assert.assertEquals(areaEsperada, circulo.getArea());
	}


}
