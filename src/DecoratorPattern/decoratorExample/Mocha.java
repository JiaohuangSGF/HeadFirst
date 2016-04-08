package DecoratorPattern.decoratorExample;

import DecoratorPattern.drink.Beverage;

/**
 * 
 * ClassName: Mocha 
 * @Description: 摩卡
 * @author Mr.Song
 * @date 2016年4月6日  下午4:11:23
 */
public class Mocha extends CondimentDecorator{

	//引入一个实例变量当作被装饰者
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	/*
	 * 
	* <p>Title: getDescription</p> 
	* <p>Description: 详情描述该实例的饮料加入了摩卡</p> 
	* @return 
	* @see DecoratorDesign.decoratorExample.CondimentDecorator#getDescription()
	 */
	public String getDescription() {
		return beverage.getDescription() + " ,Mocha";
	}

	/*
	 * 
	* <p>Title: cost</p> 
	* <p>Description: 摩卡的价格+上了实例饮料的价格</p> 
	* @return 
	* @see DecoratorDesign.drink.Beverage#cost()
	 */
	public double cost() {
		return .2+beverage.cost();
	}

}
