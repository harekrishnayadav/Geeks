package com.clone.DeepClone;

public class Bike implements Cloneable {
	private int engNo;
	private int modNo;
	private String type;
	private int bikeNo;

	public Bike(int engNo, int modNo, String type, int bikeNo) {

		this.engNo = engNo;
		this.modNo = modNo;
		this.type = type;
		this.bikeNo = bikeNo;
	}

	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}

	public Bike clone() throws CloneNotSupportedException {
		return (Bike) super.clone();

	}

	@Override
	public String toString() {
		return "Bike [engNo=" + engNo + ", modNo=" + modNo + ", type=" + type + ", bikeNo=" + bikeNo + "]";
	}

}
