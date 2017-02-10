package cn.true123.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		Person p1 = new Person(23,"zhan","san");
		Person p2 = new Person(17,"li","si");
		Person p3 =new Person(24,"wang","wu");
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		Collections.sort(persons, (Comparator<Person>) (Person person1, Person person2) -> person1.getFirstName().compareTo(person2.getFirstName()));
		// Lambda supports "target type" witch infers the object type from
		// context in which it is used.
		Collections.sort(persons, (person1, person2) -> person1.getFirstName().compareTo(person2.getFirstName()));

		for (Person p : persons) {
			System.out.println(p);
		}
	}
}
