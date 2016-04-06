package DecoratorDesign.decoratorExample;

import DecoratorDesign.drink.Beverage;

/**
 * 
 * ClassName: Whip 
 * @Description: 奶泡配料
 * @author Mr.Song
 * @date 2016年4月6日  下午4:20:29
 */
public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " ,Whip";
	}

	public double cost() {
		return .4 + beverage.cost();
	}

}
