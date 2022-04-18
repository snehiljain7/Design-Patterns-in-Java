package DesignPatterns.StructuralDesignPatterns.BridgeDP.impl;

import DesignPatterns.StructuralDesignPatterns.BridgeDP.Color; 
import DesignPatterns.StructuralDesignPatterns.BridgeDP.Shape;

public class Square extends Shape {									//This class is acting as bridge between color and shape

	public Square(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Square drawn " + color.fill();
	}

}
