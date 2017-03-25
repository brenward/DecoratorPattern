package com.bwardweb.decorator.addons;

import com.bwardweb.decorator.cake.Cake;

public class Nuts extends AddOnDecorator{

	public Nuts(Cake cake) {
		super(cake);
	}

	@Override
	public String getDescription() {
		return cake.getDescription() + " with nuts";
	}

	@Override
	public double getCost() {
		double cost = cake.getCost();
		switch(cake.getSize()){
		case SMALL:
			cost += 0.20;
			break;
		case MEDIUM:
			cost += 0.30;
			break;
		case LARGE:
			cost += 0.40;
			break;
		}
		return cost;
	}

}
