package DesignPatterns.StructuralDesignPatterns.BridgeDP.impl;

import DesignPatterns.StructuralDesignPatterns.BridgeDP.Color;
import DesignPatterns.StructuralDesignPatterns.BridgeDP.Shape;


public class Rectangle extends Shape {											//This class is acting as bridge between color and shape

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Rectangle drawn " + color.fill();
	}

}
