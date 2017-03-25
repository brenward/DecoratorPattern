package com.bwardweb.decorator.addons;

import com.bwardweb.decorator.cake.Cake;

public class ChocolateChips extends AddOnDecorator{

	public ChocolateChips(Cake cake) {
		super(cake);
	}

	@Override
	public String getDescription() {
		return cake.getDescription() + " with chocolate chips";
	}

	@Override
	public double getCost() {
		double cost = cake.getCost();
		switch(cake.getSize()){
		case SMALL:
			cost += 0.15;
			break;
		case MEDIUM:
			cost += 0.25;
			break;
		case LARGE:
			cost += 0.30;
			break;
		}
		return cost;
	}

}
