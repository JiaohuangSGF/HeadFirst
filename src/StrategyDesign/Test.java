package StrategyDesign;

import StrategyDesign.behavior.fly.FlyRocketPowered;
import StrategyDesign.entity.Duck;
import StrategyDesign.entity.MallardDuck;
import StrategyDesign.entity.ModelDuck;


public class Test {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.performQuack();
		
		//给模型鸭安装一个火箭助推器
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		
	}
}
