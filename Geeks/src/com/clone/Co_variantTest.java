package com.clone;

public class Co_variantTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Co_VariantClone c=new Co_VariantClone();
		Co_VariantClone c1=c.clone();
		System.out.println(c.x);

	}

}
