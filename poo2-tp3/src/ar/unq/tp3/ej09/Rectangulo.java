package ar.unq.tp3.ej09;

import ar.unq.tp3.ej08.Point;

public class Rectangulo extends Figura {
	
	public Rectangulo(Point point, int height, int width) throws Exception {
		
		super(point, height, width, getValidacion(height, width));
	}
	
	private static Validacion getValidacion(int height, int width) {
		
		String message = "Esta intentando crear un cuadrado";
		Boolean validacionBooleana = height == width;
		
		Validacion validacion = new Validacion(message, validacionBooleana);
		
		return validacion;
	}
	
}
