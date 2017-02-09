package cn.true123.lambda;

import java.util.function.Predicate;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		FunctionalInterface functionalInterface = () -> System.out.println("Hi Functional interface!");
		functionalInterface.test();

		Predicate<String> perdicate = s -> s.equals("test");
		System.out.println(perdicate.test("test"));
		System.out.println(perdicate.test("test false"));
	}
}
