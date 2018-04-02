package com.interfaces;

public class TestClass {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.applyBrakes(2);
		bicycle.speedUp(3);
		System.out.println("Bicycle present state :");
		bicycle.printStates();
		Bike bike = new Bike();
		bike.changeGear(3);
		bike.applyBrakes(2);
		bike.speedUp(3);
		System.out.println("Bicycle present state :");
		bicycle.printStates();

	}

}
