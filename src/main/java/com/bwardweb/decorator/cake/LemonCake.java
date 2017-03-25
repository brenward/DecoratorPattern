package com.bwardweb.decorator.cake;

import com.bwardweb.decorator.size.Size;

public class LemonCake extends Cake{
	public LemonCake(Size size){
		this.size = size;
		description = "Lemon Cake";
	}
	
	@Override
	public double getCost() {
		double cost = 0.00;
		switch(size){
		case SMALL:
			cost = 0.79;
			break;
		case MEDIUM:
			cost = 1.39;
			break;
		case LARGE:
			cost = 1.69;
			break;			
		}
		return cost;
	}

}
