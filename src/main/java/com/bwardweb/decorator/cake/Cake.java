package com.bwardweb.decorator.cake;

import com.bwardweb.decorator.size.Size;

public abstract class Cake {
	protected String description;
	protected Size size;
	
	public abstract double getCost();
	
	public String getDescription() {
		return description;
	}	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Size getSize() {
		return size;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}

	
}
