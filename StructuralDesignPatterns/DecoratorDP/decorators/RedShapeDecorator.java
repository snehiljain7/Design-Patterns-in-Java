package DesignPatterns.StructuralDesignPatterns.DecoratorDP.decorators;

import DesignPatterns.StructuralDesignPatterns.DecoratorDP.Shape;

public class RedShapeDecorator extends ShapeDecorator {			//decorated class without disturbing original class features just extending more

	public RedShapeDecorator(Shape decoratedShape) {		
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		decoratedShape.draw();
		setBorderColor(decoratedShape);
	}

	private void setBorderColor(Shape decoratedShape) {
		// TODO Auto-generated method stub
		System.out.println("Setting border color red of " + decoratedShape);
		
	}

}
