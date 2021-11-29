package paint;

import java.awt.*;

/*
 * Circle class to add Circles
 */
class Circle {
	private Point		center;
	private int			radius;
	private Color		fill;
	
	//Constructor
	Circle(Point center, int radius, Color fill){
		this.center = center;
		this.radius = radius;
		this.fill = fill;
	}
	
	//toString
	public String toString(){
		return "Circle at " + center + ", radius = " + radius + ", fill color = " + fill;
	}
	
	//Paint
	void paint(Graphics g){
		g.setColor(fill);
		g.fillOval(center.x-radius, center.y-radius, 2*radius, 2*radius);
	}
}
