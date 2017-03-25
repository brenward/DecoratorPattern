package com.bwardweb.decorator.addons;

import com.bwardweb.decorator.cake.Cake;

public class Sprinkles extends AddOnDecorator{

	public Sprinkles(Cake cake) {
		super(cake);
	}

	@Override
	public String getDescription() {
		return cake.getDescription() + " with sprinkles";
	}

	@Override
	public double getCost() {
		double cost = cake.getCost();
		switch(cake.getSize()){
		case SMALL:
			cost += 0.09;
			break;
		case MEDIUM:
			cost += 0.15;
			break;
		case LARGE:
			cost += 0.19;
			break;
		}
		return cost;
	}

}
