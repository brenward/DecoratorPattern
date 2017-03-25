package com.bwardweb.decorator.addons;

import com.bwardweb.decorator.cake.Cake;
import com.bwardweb.decorator.size.Size;

public abstract class AddOnDecorator extends Cake {
	Cake cake;
	
	public AddOnDecorator(Cake cake){
		this.cake = cake;
	}
	
	public abstract String getDescription();
	
	public abstract double getCost();
	
	public Size getSize(){
		return cake.getSize();
	}

}
