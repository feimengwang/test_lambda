package cn.true123.lambda;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		Function<Person, String> firstLast = p -> p.getFirstName() + " " + p.getLastName();
		Function<Person, String> lastFirst = p -> p.getLastName() + " " + p.getFirstName();

		print(firstLast, new Person(22, "lala", "youyou"));
		print(lastFirst, new Person(18, "lala", "youyou"));
	}

	public static void print(Function<Person, String> function, Person p) {
		System.out.println(function.apply(p));
	}
}
