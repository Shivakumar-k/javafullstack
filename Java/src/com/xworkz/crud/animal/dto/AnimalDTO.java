package com.xworkz.crud.animal.dto;

import java.io.Serializable;
import java.util.Objects;

public class AnimalDTO implements Serializable{
	
   private String name;
   private int lifeSpan;
   private String habitat;
   private String color;
   private double weight;
   
   
   public AnimalDTO() {
        System.out.println("No-arg constructor");
}


public AnimalDTO(String name, int lifeSpan, String habitat, String color, double weight) {
	super();
	this.name = name;
	this.lifeSpan = lifeSpan;
	this.habitat = habitat;
	this.color = color;
	this.weight = weight;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getLifeSpan() {
	return lifeSpan;
}


public void setLifeSpan(int lifeSpan) {
	this.lifeSpan = lifeSpan;
}


public String getHabitat() {
	return habitat;
}


public void setHabitat(String habitat) {
	this.habitat = habitat;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public double getWeight() {
	return weight;
}


public void setWeight(double weight) {
	this.weight = weight;
}


@Override
public int hashCode() {
	return Objects.hash(color, habitat, lifeSpan, name, weight);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AnimalDTO other = (AnimalDTO) obj;
	return Objects.equals(color, other.color) && Objects.equals(habitat, other.habitat) && lifeSpan == other.lifeSpan
			&& Objects.equals(name, other.name)
			&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
}


@Override
public String toString() {
	return "AnimalDTO [name=" + name + ", lifeSpan=" + lifeSpan + ", habitat=" + habitat + ", color=" + color
			+ ", weight=" + weight + "]";
}
   
   
   

}
