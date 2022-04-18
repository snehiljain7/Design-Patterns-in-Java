package DesignPatterns.StructuralDesignPatterns.AdapterDP.impl;

import DesignPatterns.StructuralDesignPatterns.AdapterDP.model.Volt;

public class WallSocketImpl implements DesignPatterns.StructuralDesignPatterns.AdapterDP.WallSocket {

	@Override
	public Volt getVolts() {
		// TODO Auto-generated method stub
		return new Volt(240);
	}

}
