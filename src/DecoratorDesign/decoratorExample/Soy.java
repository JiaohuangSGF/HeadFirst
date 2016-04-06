package DecoratorDesign.decoratorExample;

import DecoratorDesign.drink.Beverage;

/**
 * 
 * ClassName: Soy 
 * @Description: 豆浆配料
 * @author Mr.Song
 * @date 2016年4月6日  下午4:18:47
 */
public class Soy extends CondimentDecorator{

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	
	public String getDescription() {
		return beverage.getDescription()+" ,Soy";
	}

	public double cost() {
		return .3 + beverage.cost();
	}

}
