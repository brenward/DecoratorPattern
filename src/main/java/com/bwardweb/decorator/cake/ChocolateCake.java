package com.bwardweb.decorator.cake;

import com.bwardweb.decorator.size.Size;

public class ChocolateCake extends Cake{
	public ChocolateCake(Size size){
		this.size = size;
		description = "Chocolate Cake";
	}
	
	@Override
	public double getCost() {
		double cost = 0.00;
		switch(size){
		case SMALL:
			cost = 1.00;
			break;
		case MEDIUM:
			cost = 1.59;
			break;
		case LARGE:
			cost = 1.99;
			break;			
		}
		return cost;
	}

}
