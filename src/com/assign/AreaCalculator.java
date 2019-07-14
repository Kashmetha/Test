
package com.assign;

import java.lang.Math;

public class AreaCalculator{
	
	//calculating area
	public double getArea(double r ) {
		
		return Math.PI * Math.pow(r, 2);
		
	}
	
	//calculation circumference
	public double getCircumference(double r) {
		
		return  2 * Math.PI * (r);
		
	}

}
