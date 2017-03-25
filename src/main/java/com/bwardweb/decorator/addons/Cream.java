package com.bwardweb.decorator.addons;

import com.bwardweb.decorator.cake.Cake;

public class Cream extends AddOnDecorator{

	public Cream(Cake cake) {
		super(cake);
	}

	@Override
	public String getDescription() {
		return cake.getDescription() + " with cream";
	}

	@Override
	public double getCost() {
		double cost = cake.getCost();
		switch(cake.getSize()){
		case SMALL:
			cost += 0.10;
			break;
		case MEDIUM:
			cost += 0.20;
			break;
		case LARGE:
			cost += 0.25;
			break;
		}
		return cost;
	}

}
