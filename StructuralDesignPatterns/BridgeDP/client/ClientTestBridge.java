package DesignPatterns.StructuralDesignPatterns.BridgeDP.client;

import DesignPatterns.StructuralDesignPatterns.BridgeDP.Color;
import DesignPatterns.StructuralDesignPatterns.BridgeDP.Shape;
import DesignPatterns.StructuralDesignPatterns.BridgeDP.impl.Blue;
import DesignPatterns.StructuralDesignPatterns.BridgeDP.impl.Rectangle;
import DesignPatterns.StructuralDesignPatterns.BridgeDP.impl.Red;
import DesignPatterns.StructuralDesignPatterns.BridgeDP.impl.Square;

public class ClientTestBridge {

	public static void main(String[] args) {
		Color blue = new Blue();
		
		Shape square = new Square(blue);
		System.out.println(square.draw());
		
		System.out.println("-----------------------------------------------");
		
		Color red = new Red();
		
		Shape rectangle = new Rectangle(red);
		System.out.println(rectangle.draw());
		

	}

}
