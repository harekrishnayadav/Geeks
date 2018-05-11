package com.collections.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ForLoopTest {

	public static void main(String[] args) {
	List<Integer> l=new LinkedList<>();
	l.add(1);
	l.add(2);
	l.add(3);
	List<Integer> l1=new LinkedList<>();
	l1.add(4);
	l1.add(5);
	l1.add(5);
	/*for (Iterator i = l.iterator(); i.hasNext();) {
		for (Iterator i1 = l1.iterator(); i1.hasNext();) {
		if(i.next()<i1.next()){
			System.out.println();
		}
			
		}
		
	}
*/
	for (Integer i1 : l) {
		for (Integer i2 : l1) {
			if(i1<i2){
				System.out.print(i1+" ");
			}
			
		}
		
		
	}
	}

}
