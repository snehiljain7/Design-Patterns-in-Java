package DesignPatterns.StructuralDesignPatterns.BridgeDP.impl;

import DesignPatterns.StructuralDesignPatterns.BridgeDP.Color;

public class Red implements Color {

	@Override
	public String fill() {
		return "Red";
	}

}
