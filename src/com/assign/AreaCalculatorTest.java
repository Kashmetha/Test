//Question 01
package com.assign;

import java.util.*;

public class AreaCalculatorTest {

	public static void main(String[] args) {
		
		//initializing input scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Radius");
		
		//user input
		double radius = input.nextDouble();
		
		//generating instance
		AreaCalculator areaCircle = new AreaCalculator();
		AreaCalculator circumferenceCircle = new AreaCalculator();
		
		//assigning the values
		System.out.println("Area: " + areaCircle.getArea(radius)); 
		System.out.println("Circumference: " + circumferenceCircle.getCircumference(radius));
		
	}

}
