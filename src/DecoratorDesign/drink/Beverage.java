package DecoratorDesign.drink;

/**
 * 
 * ClassName: Beverage 
 * @Description: 饮料抽象类
 * @author Mr.Song
 * @date 2016年4月6日  下午3:41:06
 */
public abstract class Beverage {

	String description = "Unknow Beverage";
	
	/**
	 * 
	* @Title: getDescription 
	* @Description: 该饮料的描述
	* @return  参数说明 
	* @return String    返回类型 
	* @throws
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 
	* @Title: cost 
	* @Description: 价格 
	* @return  参数说明 
	* @return double    返回类型 
	* @throws
	 */
	public abstract double cost();
}
