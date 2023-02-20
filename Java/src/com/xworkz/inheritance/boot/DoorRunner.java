package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.Door;

public class DoorRunner {
	
	public static void main(String[] args) {
		
		Door door = new Door();
		door.setMaterial("Wood");
		door.setHeight(6.2d);
		door.setPrice(3256);
		door.setHasGlass(true);
		
		
		Door door2 = new Door();
		door2.setMaterial("Steel");
		door2.setHeight(6.5d);
		door2.setPrice(5268);
		door2.setHasGlass(false);
		
		System.out.println(door);
		System.out.println(door.hashCode()+" original hashCode: "+System.identityHashCode(door));
		System.out.println(door.equals(door2));
		door=door2;
		System.out.println(door2);
		System.out.println(door2.hashCode()+" original hashCode: "+System.identityHashCode(door2));
		System.out.println(door.equals(door2));
		
		
	}

}
