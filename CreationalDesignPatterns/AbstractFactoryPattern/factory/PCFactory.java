package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern.factory;

import DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern.impl.PC;

public class PCFactory implements AbstractComputerFactory{

	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	

	public PCFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}



	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	}

	
}
