package DecoratorDesign;

import DecoratorDesign.decoratorExample.Soy;
import DecoratorDesign.decoratorExample.Whip;
import DecoratorDesign.drink.Beverage;
import DecoratorDesign.drink.Espresso;
import DecoratorDesign.drink.HouseBlend;

public class TestDecorator {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + ",$"+beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + ",$" + beverage2.cost());
	}
}
