package DecoratorPattern.drink;

/**
 * 
 * ClassName: HouseBlend 
 * @Description: 黑咖啡（混合咖啡）
 * @author Mr.Song
 * @date 2016年4月6日  下午4:01:26
 */
public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	public double cost() {
		return .89;
	}

}
