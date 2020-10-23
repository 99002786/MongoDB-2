package com.training;

import java.util.function.Consumer;
import java.util.function.Predicate;

interface Calculator{
	void calculate(int x, int y);
}

public class Demo {
	public static void main(String[] args) {
		Calculator calc=(int x, int y)->System.out.println(x*y);
		calc.calculate(10,30);
		
		Consumer<String> con=(s)->System.out.println(s.toUpperCase());
		con.accept("Hello");
		Consumer<Integer> in=(t)->System.out.println("Sq "+t*t);
		in.accept(10);
		
		Predicate<String> pred=(s)->s.length()>5;
		pred.test("Hello");
		pred=(s)->s.toLowerCase().equals("welcome");
		System.out.println(pred.test("WELCOME"));
	}

}
