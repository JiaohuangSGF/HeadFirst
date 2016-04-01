package DuckDemo;

import DuckDemo.behavior.fly.FlyRocketPowered;
import DuckDemo.entity.Duck;
import DuckDemo.entity.MallardDuck;
import DuckDemo.entity.ModelDuck;


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
