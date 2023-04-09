package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class SoftwareDTO implements Serializable{
	
     private String name;
     private String devolpedby;
     private int size;
     private int id;
     
     public SoftwareDTO() {
    	 System.out.println("no arg constructar");
     }

	public SoftwareDTO(String name, String devolpedby, int size, int id) {
		super();
		this.name = name;
		this.devolpedby = devolpedby;
		this.size = size;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevolpedby() {
		return devolpedby;
	}

	public void setDevolpedby(String devolpedby) {
		this.devolpedby = devolpedby;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(devolpedby, id, name, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwareDTO other = (SoftwareDTO) obj;
		return Objects.equals(devolpedby, other.devolpedby) && id == other.id && Objects.equals(name, other.name)
				&& size == other.size;
	}

	@Override
	public String toString() {
		return "SoftwareDTO [name=" + name + ", devolpedby=" + devolpedby + ", size=" + size + ", id=" + id + "]";
	}
     
     
}
