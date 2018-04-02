package com.interfaces;

public class Bike implements Vichile {
	int Gear;
	int Speed;

	@Override
	public void changeGear(int newGear) {

		Gear = newGear;
	}

	@Override
	public void speedUp(int increment) {

		Speed = Speed + increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		Speed = Speed - decrement;

	}

	public void printStates() {
		System.out.println("Speed: " + Speed + " Gear: " + Gear);
	}

}
