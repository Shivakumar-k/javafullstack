package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Roti;
import com.xworkz.inheritance.thing.ButterRoti;
import com.xworkz.inheritance.thing.JowerRoti;
import com.xworkz.inheritance.thing.Kulcha;
import com.xworkz.inheritance.thing.Naan;
import com.xworkz.inheritance.thing.OnionMasalaRoti;
import com.xworkz.inheritance.thing.OnionRoti;
import com.xworkz.inheritance.thing.RagiRoti;

public class RotiRunner {
	public static void main(String args[]) {
	
	Roti roti=new Roti();
	roti.setShape("Circle");
	
	
	
	Roti roti1=new RagiRoti();
	RagiRoti roti11=new RagiRoti();
	roti11.setCalories(88D);
	double cal=roti11.getCalories();
	System.out.println("calories in ragiroti is :"+cal);
	if(roti1 instanceof RagiRoti) {
		RagiRoti new1=(RagiRoti)roti1;
		new1.setCalories(88D);
		}
	else
	{
		System.err.println("ragi1 is exception");
	}
	
	
	
	
	Roti roti2=new ButterRoti();
	ButterRoti roti22=new ButterRoti();
	roti22.setLength(5.5D);
	double len=roti22.getLength();
	System.out.println("length of butter is :"+len);
	
	if(roti2 instanceof ButterRoti) {
		ButterRoti new1=(ButterRoti)roti2;
		new1.setLength(5.5D);
		}
	else
	{
		System.out.println("ragi2 is exception");
	}
	
	
	
	
	
	Roti roti3= new OnionRoti();
	RagiRoti roti333=new OnionRoti();
	OnionRoti roti33=new OnionRoti();
	roti33.setWeight(20D);
	double wgt=roti33.getWeight();
	System.out.println("weight of onion roti is :"+wgt);
	roti33.setCalories(88D);

	if(roti3 instanceof OnionRoti ) {
		OnionRoti new1=(OnionRoti)roti3;
		new1.setWeight(55D);
		}
	else
	{
		System.err.println("ragi3 is exception");
	}
	if(roti333 instanceof OnionRoti ) {
		OnionRoti new1=(OnionRoti)roti333;
		new1.setWeight(55D);
		}
	else
	{
		System.err.println("ragi3 is exception");
	}
	
	
	
	
	Roti roti4=new JowerRoti();
	ButterRoti roti44=new JowerRoti();
	JowerRoti roti444=new JowerRoti();
	roti444.setPrice(70);
	int prc=roti444.getPrice();
	System.out.println("price of jowerroti is :"+prc);
	roti44.setShape(null);
	if(roti4 instanceof JowerRoti ) {
		JowerRoti new1=(JowerRoti)roti4;
		new1.setPrice(55);
		}
	else
	{
		System.err.println("ragi4 is exception");
	}
	if(roti44 instanceof JowerRoti ) {
		JowerRoti new1=(JowerRoti)roti44;
		new1.setPrice(55);
		}
	else
	{
		System.err.println("ragi44 is exception");
	}
	
	
	
	Roti roti5=new  OnionMasalaRoti();
	RagiRoti roti55=new OnionMasalaRoti();
	OnionRoti roti555=new OnionMasalaRoti();
	OnionMasalaRoti roti5555=new OnionMasalaRoti();
	roti5555.setThickNess(10D);
	roti5555.setCalories(40D);
	roti5555.setWeight(55D);
	roti5555.setShape("square");
	
	double tkns=roti5555.getThickNess();
	System.out.println("thickness of OnionMasalaRoti is:"+tkns);
	if(roti5 instanceof OnionMasalaRoti ) {
		OnionMasalaRoti new1=(OnionMasalaRoti)roti5;
		new1.setThickNess(55);
		}
	else
	{
		System.err.println("ragi5 is exception");
	}
	if(roti55 instanceof OnionMasalaRoti ) {
		OnionMasalaRoti new1=(OnionMasalaRoti)roti55;
		new1.setThickNess(55);
		}
	else
	{
		System.err.println("ragi55 is exception");
	}
	if(roti555 instanceof OnionMasalaRoti ) {
		OnionMasalaRoti new1=(OnionMasalaRoti)roti555;
		new1.setThickNess(55);
		}
	else
	{
		System.err.println("ragi555 is exception");
	}
	
	Roti roti6=new Naan();
	ButterRoti roti66=new Naan();
	Naan roti666=new Naan();
	roti666.setName("Sambar");
	String nm=roti666.getName();
	System.out.println("Naan name is:"+nm);
	roti666.setLength(40D);
	roti666.setShape("marbel");
	if(roti6 instanceof Naan ) {
		Naan new1=(Naan)roti6;
		new1.setName("curry");
		}
	else
	{
		System.err.println("ragi6 is exception");
	}
	if(roti66 instanceof Naan ) {
		Naan new1=(Naan)roti66;
		new1.setName("curry");
		}
	else
	{
		System.err.println("ragi66 is exception");
	}
	
	
	Roti roti7=new Kulcha();
	ButterRoti roti77=new Kulcha();
	Naan roti777=new Kulcha();
	Kulcha roti7777=new Kulcha();
	roti7777.setType("liquid");
	String typ=roti7777.getType();
	System.out.println("type of kulcha:"+typ);	
	roti7777.setLength(65D);
	roti7777.setName("pk");
	roti7777.setShape("rectangle");
	
	if(roti7 instanceof Kulcha ) {
		Kulcha new1=(Kulcha)roti7;
		new1.setType("c");
		}
	else
	{
		System.err.println("ragi7 is exception");
	}
	if(roti77 instanceof Kulcha ) {
		Kulcha new1=(Kulcha)roti77;
		new1.setType("c");
		}
	else
	{
		System.err.println("ragi77 is exception");
	}
	if(roti777 instanceof Kulcha ) {
		Kulcha new1=(Kulcha)roti777;
		new1.setType("c");
		}
	else
	{
		System.err.println("ragi777 is exception");
	}
	}
	}

