package DesignPatterns.CreationalDesignPatterns.FactoryMethodPattern.Example;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Choose your plan from: ");
		String string = scanner.next();
		
		ElectricityPlan electricityPlan = GetPlanFactory.getInstance(string);
		System.out.print("Enter Units: ");
		int units = scanner.nextInt();
		electricityPlan.calculateBill(units);

	}

}
