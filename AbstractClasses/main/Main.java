package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import classes.Employee;
import classes.Person;

class Main {
	
	public static void main(String[] args) { 
	
		Person p1 = new Employee (10, 45);
		p1.setName("Andrew");
		Employee e1 = new Employee("John", 5.0, 20);
		Employee e2 = new Employee("Cailin", 10, 30);
				
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(e1);
		list.add(e2);
		
		e1.calculate();
		
		list.sort(Comparator.comparing(Person::getName));
	
		
		for (Person employee : list) {
			System.out.println(employee);
		}
		
	
	}
}