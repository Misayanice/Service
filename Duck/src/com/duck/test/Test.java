package com.duck.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String args[]) {
		// Duck duck=new MallardDuck();
		// duck.performFly();
		// duck.performQuack();
		//
		// Duck modelDuck=new ModelDuck();
		// FlyBehavior flyBehavior=new FlyRocketPowered();
		// modelDuck.setFlyBehavior(flyBehavior);
		// modelDuck.performFly();
		// String smsbody="本次验证码：333845(为了dfasdfasd121212fasdfadsfa保证你的安全)";
		// String regEx="[^0-9]";
		// Pattern p=Pattern.compile(regEx);
		// Matcher m=p.matcher(smsbody);
		// String smsContent=m.replaceAll("").trim().toString();
		// System.out.println(smsContent);
		f2();
	}

	public static void f2() {
		int h = 0;

		 for (int k = 0; k < 5; k++) {

			System.out.println("label3 第一层");

			for (int m = 0; m < 5; m++) {

				System.out.println("label3 第二层");

				h++;

				if (m == 2) {

					break ;

				}

				System.out.println(h);

			}
		}

	}
}
