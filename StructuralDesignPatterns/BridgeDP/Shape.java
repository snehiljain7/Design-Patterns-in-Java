package DesignPatterns.StructuralDesignPatterns.BridgeDP;

public abstract class Shape {														//This  is main class which is acting as bridge between color and shape

	protected Color color;

	public Shape(Color color) {		
		super();
		this.color = color;
	}
	
	public abstract String draw();
}
