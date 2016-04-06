package DecoratorDesign.decoratorExample;

import DecoratorDesign.drink.Beverage;

/**
 * 
 * ClassName: CondimentDecorator 
 * @Description: 调料抽象类
 * @author Mr.Song
 * @date 2016年4月6日  下午3:50:48
 */
public abstract class CondimentDecorator extends Beverage{

	public abstract String getDescription();
}
