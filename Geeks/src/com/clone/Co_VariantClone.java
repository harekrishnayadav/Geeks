package com.clone;

public class Co_VariantClone {
	int x = 10;
	int y = 20;

	public Co_VariantClone clone() throws CloneNotSupportedException {
		return (Co_VariantClone) super.clone();
	}

	

}
