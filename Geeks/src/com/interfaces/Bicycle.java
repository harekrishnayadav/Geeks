package com.interfaces;

public class Bicycle implements Vichile {
	int Speed;
	int Gear;

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
