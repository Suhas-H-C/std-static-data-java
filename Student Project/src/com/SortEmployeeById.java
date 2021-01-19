package com;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee>{
	@Override
	public int compare(Employee a, Employee b) {
		return a.id - b.id;
	}
}
