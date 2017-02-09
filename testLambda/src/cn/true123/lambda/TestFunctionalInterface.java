package cn.true123.lambda;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		FunctionalInterface functionalInterface = () -> System.out.println("Hi Functional interface!");
		functionalInterface.test();
	}
}
