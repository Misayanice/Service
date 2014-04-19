package com.duck.test;

public class ModelDuck extends Duck{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm Model Duck");
	}
	public ModelDuck(){
		flyBehavior=new FlyNoWay();
		quackBehavior=new Quack();
	}
	
}
