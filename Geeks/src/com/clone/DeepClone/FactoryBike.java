package com.clone.DeepClone;

public class FactoryBike {

	public static void main(String[] args) throws CloneNotSupportedException {
		Bike b = new Bike(1234, 2018, "Bullet", 99865);
		b.setBikeNo(9984);
		Bike b1 = b.clone();
		System.out.println(b);
		
		System.out.println(b1);

	}

}
