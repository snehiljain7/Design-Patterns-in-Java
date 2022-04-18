package DesignPatterns.StructuralDesignPatterns.DecoratorDP.decorators;

import DesignPatterns.StructuralDesignPatterns.DecoratorDP.Shape;

public class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	
	
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
		

	}
	
	

}
