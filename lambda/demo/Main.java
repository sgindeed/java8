package com.lambda.demo;

public class Main {
	public static void main(String[] args) {
		
		MathematicalOperation add = new Addition();
		System.out.println(add.operate(5, 7));
		
		MathematicalOperation mutiply = (x1, y1) -> {return x1*y1;};
		System.out.println(mutiply.operate(4, 5));
		
		MathematicalOperation divide = (a, b) -> {return a/b;};
		System.out.println(divide.operate(79, 7));
	}
}
