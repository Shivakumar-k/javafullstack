package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.Paint;

public class PaintRunner {
	
	public static void main(String[] args) {
		
	Paint paint =  new Paint();

	paint.setName("Asian paints");
	paint.setPainter("Gough");
	paint.setYear(2023);
	paint.setPrice(4525.54f);
	
	Paint paint2 =  new Paint();

	paint2.setName("jsw");
	paint2.setPainter("Venci");
	paint2.setYear(2022);
	paint2.setPrice(6523.54f);
	
	
	System.out.println(paint);
	System.out.println(paint.hashCode()+" Original hashCode: "+System.identityHashCode(paint));
	System.out.println(paint.equals(paint2));
	paint=paint2;
	System.out.println(paint2);
	System.out.println(paint.equals(paint2));
	
}
}