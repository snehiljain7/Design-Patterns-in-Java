package DesignPatterns.StructuralDesignPatterns.AdapterDP.client;

import DesignPatterns.StructuralDesignPatterns.AdapterDP.MobileAdapter;
import DesignPatterns.StructuralDesignPatterns.AdapterDP.WallSocket;
import DesignPatterns.StructuralDesignPatterns.AdapterDP.impl.MobileAdapterImpl;
import DesignPatterns.StructuralDesignPatterns.AdapterDP.impl.WallSocketImpl;
import DesignPatterns.StructuralDesignPatterns.AdapterDP.model.Volt;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WallSocket wallSocket = new WallSocketImpl();
		Volt v240 = wallSocket.getVolts();
		System.out.println(v240);
		
		MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
		Volt v3 = mobileAdapter.get3Volts();
		System.out.println(v3);

	}

}
