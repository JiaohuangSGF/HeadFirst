package StrategyDesign.entity;

import StrategyDesign.behavior.fly.FlyNoWay;
import StrategyDesign.behavior.quack.Quack;

/**
 * ClassName: ModelDuck 
 * @Description:  * 模型鸭
 * @author Mr.Song
 * @date 2016年4月1日  下午1:44:33
 */
public class ModelDuck extends Duck{

	public void display() {
		System.out.println("I'm a model duck");
	}

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
}
