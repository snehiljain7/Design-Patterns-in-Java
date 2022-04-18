package DesignPatterns.StructuralDesignPatterns.DecoratorDP;

public class Square implements Shape {							//Concrete class

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square");

	}

	@Override
	public String toString() {
		return "Square []";
	}

	
}
