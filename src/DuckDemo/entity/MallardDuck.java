package DuckDemo.entity;

import DuckDemo.behavior.fly.FlyWithWings;
import DuckDemo.behavior.quack.Quack;

/**
 * 
 * ClassName: MallardDuck  
 * @Description: 绿头鸭
 * @author Mr.Song
 * @date 2016年3月31日  下午3:46:47
 */
public class MallardDuck extends Duck{

	public void display() {
		System.out.println("我是一个绿头鸭");
	}

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
}
