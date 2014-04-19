package com.duck.test;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
		}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm real Mallard duck");
	}

}
