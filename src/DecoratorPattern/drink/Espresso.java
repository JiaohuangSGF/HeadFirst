package DecoratorPattern.drink;


/**
 * ClassName: Espresso 
 * @Description: 浓缩咖啡
 * @author Mr.Song
 * @date 2016年4月6日  下午3:57:57
 */
public class Espresso extends Beverage{

	public Espresso() {
		description = "Espresso";
	}
	
	public double cost() {
		return 1.99;
	}

}
