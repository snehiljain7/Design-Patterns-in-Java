package DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern.client;

import DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern.factory.Computer;
import DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern.factory.ComputerFactory;
import DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern.factory.LaptopFactory;
import DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern.factory.PCFactory;
import DesignPatterns.CreationalDesignPatterns.AbstractFactoryPattern.factory.ServerFactory;

public class ClientTest {
	 
	public static void main(String[] args) {
		
		//Create Computer with different configurations
		Computer pc = ComputerFactory.getComputer(new PCFactory("16 GB", "120 GB", "2,23 HGZ", true, true));
		System.out.println("PC Config::"+pc);
		
		Computer server = ComputerFactory.getComputer(new ServerFactory("32 GB", "320 GB", "2,29 HGZ", true, true));
		System.out.println("Server Config::"+server);
		
		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("16 GB", "140 GB", "2,23 HGZ", true, true));
		System.out.println("Laptop Config::"+laptop);
	}
 
}