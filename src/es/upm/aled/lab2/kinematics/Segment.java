package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa los segmentos
 * @author daniel
 */
public class Segment {
	
	private double length;
	private double angle;
	private List <Segment> children; 
	
	/**
	 * 
	 * @param length longitud del segmento
	 * @param angle
	 */
	
	public Segment (double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<>();  
	}
	
	public double getLength() { 
		return length;   
	}

	public double getAngle() {
		return angle; 
	}
	
	public void setAngle(double angle) { 
		this.angle = angle;
	}

	public List<Segment> getChildren() {
		return children;
	}
	
	//Solo añade un nuevo child, si este no está ya contenido en children
	public void addChild(Segment child) { 
		if(!this.children.contains(child)) {  
			this.children.add(child); 
		}		
	}

	

}
