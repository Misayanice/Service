package com.duck.test;

public abstract class DuckTest {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public DuckTest() {
	};

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	};

	public void performQuack() {
		quackBehavior.quack();
		
		
		
	};

	public void swim() {
		System.out.println("All ducks float,even decoys!");
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
