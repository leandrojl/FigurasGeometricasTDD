package ar.unlam.clase3ProgramacionAvanzada2FigurasGeometricas;

import org.junit.Test;

public class ElipseTest {

	
	@Test
	public void cuandoCreoUnElipse() {
		Elipse figura = new Elipse(null, 0.0, 0.0);
	}
	
	@Test
	public void crearUnaELipseEn1_1ConEjeMayor2YEjeMenor1TieneArea6_283() {
		Punto centro = new Punto(1.0,22.0);
		Elipse figuraElipse = new Elipse(centro, 2.0,1.0);
	}
}
