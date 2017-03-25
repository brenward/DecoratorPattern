package com.bwardweb.decorator.cake;

import com.bwardweb.decorator.size.Size;

public class StrawberryCake extends Cake{
	public StrawberryCake(Size size){
		this.size = size;
		description = "Strawberry Cake";
	}
	
	@Override
	public double getCost() {
		double cost = 0.00;
		switch(size){
		case SMALL:
			cost = 1.10;
			break;
		case MEDIUM:
			cost = 1.69;
			break;
		case LARGE:
			cost = 2.20;
			break;			
		}
		return cost;
	}

}
