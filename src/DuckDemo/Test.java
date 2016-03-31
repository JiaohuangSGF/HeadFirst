package DuckDemo;

import DuckDemo.entity.Duck;
import DuckDemo.entity.MallardDuck;


public class Test {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
	}
}
