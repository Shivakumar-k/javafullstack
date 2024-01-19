package com.Number;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Shiva", 22, 300));
		employees.add(new Employee("Abhi", 20, 450));
		employees.add(new Employee("Vinod", 28, 400));

		List<Employee> sorted = employees.stream().sorted((o1, o2) -> (o1.getAge() - o2.getAge()))
				.collect(Collectors.toList());

		System.out.println(sorted);

		List<Employee> sorted1 = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(sorted1);

	}

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return (int) (o1.getSalary()-o2.getSalary());
//	}

//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return o.;
//	}

}
