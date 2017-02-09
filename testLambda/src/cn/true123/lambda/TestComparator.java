package cn.true123.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		Person p1 = new Person("zhansan", 23);
		Person p2 = new Person("lisi", 18);
		Person p3 = new Person("wangwu", 45);
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		Collections.sort(persons, (Person person1, Person person2) -> person1.getName().compareTo(person2.getName()));
		// Lambda supports "target type" witch infers the object type from
		// context in which it is used.
		Collections.sort(persons, (person1, person2) -> person1.getName().compareTo(person2.getName()));

		for (Person p : persons) {
			System.out.println(p);
		}
	}
}
