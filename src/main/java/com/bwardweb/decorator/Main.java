package com.bwardweb.decorator;

import com.bwardweb.decorator.addons.ChocolateChips;
import com.bwardweb.decorator.addons.Cream;
import com.bwardweb.decorator.addons.Nuts;
import com.bwardweb.decorator.addons.Sprinkles;
import com.bwardweb.decorator.cake.Cake;
import com.bwardweb.decorator.cake.ChocolateCake;
import com.bwardweb.decorator.cake.LemonCake;
import com.bwardweb.decorator.cake.StrawberryCake;
import com.bwardweb.decorator.size.Size;

public class Main {

	public static void main(String[] args) {
		Cake order1 = new StrawberryCake(Size.MEDIUM);
		order1 = new ChocolateChips(order1);
		order1 = new Cream(order1);
		
		Cake order2 = new LemonCake(Size.LARGE);
		order2 = new Nuts(order2);
		order2 = new Sprinkles(order2);
		order2 = new Cream(order2);
		
		Cake order3 = new ChocolateCake(Size.SMALL);
		order3 = new Nuts(order3);
		order3 = new Sprinkles(order3);
		order3 = new Cream(order3);
		order3 = new ChocolateChips(order3);
		
		System.out.println("Order1: " + order1.getSize().toString() + " " + order1.getDescription() + ". Price: " + order1.getCost());
		System.out.println("---------------------------------------------------");
		System.out.println("Order2: " + order2.getSize().toString() + " " + order2.getDescription() + ". Price: " + order2.getCost());
		System.out.println("---------------------------------------------------");
		System.out.println("Order3: " + order3.getSize().toString() + " " + order3.getDescription() + ". Price: " + order3.getCost());

	}

}
