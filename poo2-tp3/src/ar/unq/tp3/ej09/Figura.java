package ar.unq.tp3.ej09;

import ar.unq.tp3.ej08.Point;

public class Figura {
	
	private Point point;
	private int height;
	private int width;
	
	public Figura(Point point, int height, int width, Validacion validacion) throws Exception {
		
		if(validacion.getValidacion()) {
			throw new Exception(validacion.getMessage());
		}
		
		this.point = point;
		this.height = height;
		this.width = width;
	}
	
	private int getHeight() {
		return height;
	}
	
	private int getWidth() {
		return width;
	}
	
	public int getArea() {
		return getHeight() * getWidth();
	}
	
	public int getPerimetro() {
		return (getHeight() * 2) + (getWidth() * 2);
	}
	
	public Point getPoint() {
		return point;
	}
	
	public String getPosicionamiento() {
		
		String posicionamiento = "Horizontal";
		
		if(getHeight() > getWidth()) {
			posicionamiento = "Vertical";
		}
		
		return posicionamiento;
	}
}
