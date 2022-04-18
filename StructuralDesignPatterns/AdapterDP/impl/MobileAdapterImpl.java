package DesignPatterns.StructuralDesignPatterns.AdapterDP.impl;

import DesignPatterns.StructuralDesignPatterns.AdapterDP.MobileAdapter;
import DesignPatterns.StructuralDesignPatterns.AdapterDP.WallSocket;
import DesignPatterns.StructuralDesignPatterns.AdapterDP.model.Volt;

public class MobileAdapterImpl implements MobileAdapter {

	private WallSocket wallSocket;
	
	
	public MobileAdapterImpl(WallSocket wallSocket) {
		super();
		this.wallSocket = wallSocket;
	}


	@Override
	public Volt get3Volts() {
		// TODO Auto-generated method stub
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolt()/80;
		return new Volt(v3);
	}

}
