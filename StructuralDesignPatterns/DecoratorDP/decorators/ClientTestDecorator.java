package DesignPatterns.StructuralDesignPatterns.DecoratorDP.decorators;

import DesignPatterns.StructuralDesignPatterns.DecoratorDP.Shape;
import DesignPatterns.StructuralDesignPatterns.DecoratorDP.Square;

public class ClientTestDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape square = new Square();
		System.out.println("Normal Square drawing");
		square.draw();
		
		System.out.println("-------------------------------------------");
		
		ShapeDecorator redShapeDecorator = new RedShapeDecorator(new Square());		//using decorated class without disturbing original class
		System.out.println("Decorated Square drawing");
		redShapeDecorator.draw();

	}

}
