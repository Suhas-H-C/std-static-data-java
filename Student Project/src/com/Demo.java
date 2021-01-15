package com;

import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Employee e1 = new Employee(2, "B");
		Employee e2 = new Employee(3, "A");
		Employee e3 = new Employee(1, "C");

		ArrayList<Employee> l = new ArrayList<Employee>();		
		l.add(e1);
		l.add(e2);
		l.add(e3);

		//Collections.sort(l, new SortEmployeeById());
		
		SortEmployeeByName name = new SortEmployeeByName();
		Collections.sort(l, name);
		
		for(Employee emp : l) {
			System.out.println(emp);
		}
	}
}
