package ar.unq.tp3.ej08;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void movePointX(int number) {
		x = number;
	}
	
	public void movePointY(int number) {
		y = number;
	}
	
	public void movePoint(Point newPoint) {
		this.movePointX(newPoint.getX());
		this.movePointX(newPoint.getY());
	}
	
	public Point additionPoint(Point newPoint) {
		
		int pointX = this.getX() + newPoint.getX();
		int pointY = this.getY() + newPoint.getY();
		
		return new Point(pointX, pointY);
	}

}
