package ar.unlam.clase3ProgramacionAvanzada2FigurasGeometricas;

import org.junit.Test;

import junit.framework.Assert;

public class PuntoTest {

	
	
	
	@Test
	public void representarUnPuntoEnElPlano() {
		Double coordenadaX = 5.0;
		Double coordenadaY = 10.0;
		Punto figura= dadoQueTengoUnPunto(coordenadaX,coordenadaY);
		Double valorObtenidoX=cuandoConsultoSuCoordenadaX(figura);
		Double valorObtenidoY=cuandoConsultoSuCoordenadaY(figura);
		tengoElPuntoEnElPlano(valorObtenidoX,coordenadaX);
		tengoElPuntoEnElPlano(valorObtenidoY,coordenadaY);
	}

	

	private Double cuandoConsultoSuCoordenadaY(Punto figura) {
		Double coordenada =figura.consultarCoordenadaY();
		return coordenada;
	}

	private Double cuandoConsultoSuCoordenadaX(Punto figura) {
		Double coordenada =figura.consultarCoordenadaX();
		return coordenada;
		
	}

	private void cuandoConsultoSusCoordenadas(Punto figura) {
		figura.consultarCoordendas();
		
	}

	private void tengoElPuntoEnElPlano(Double valorObtenidoX, Double coordenadaX) {
		Assert.assertEquals(valorObtenidoX, coordenadaX);
		
	}

	private Punto dadoQueTengoUnPunto(Double x, Double y) {
		Punto figura = new Punto(x,y);
		return figura;
		
	}
}
