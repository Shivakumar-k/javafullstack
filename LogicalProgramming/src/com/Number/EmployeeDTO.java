package com.Number;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class EmployeeDTO {
	private int id;
	private String name;
	private int age;
	private double salary;

	public EmployeeDTO(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "EmployeeDTO [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		List<EmployeeDTO> empList = new ArrayList<>();

		empList.add(new EmployeeDTO(1, "Shiva", 20, 100));
		empList.add(new EmployeeDTO(2, "Ashok", 22, 200));
		empList.add(new EmployeeDTO(3, "Shiva", 22, 300));
		empList.add(new EmployeeDTO(4, "Abhi", 23, 400));
		empList.add(new EmployeeDTO(5, "Ashok", 22, 300));

//		Map<String, Long > empCount=empList.stream().collect(Collectors.groupingBy((EmployeeDTO::getName),Collectors.counting()));
//		System.out.println(empCount);

		Map<Integer, Long> ageList = empList.stream()
				.collect(Collectors.groupingBy(EmployeeDTO::getAge, Collectors.counting()));
		System.out.println(ageList);

		List<Integer> ages = empList.stream().map(EmployeeDTO::getAge).collect(Collectors.toList());
		IntSummaryStatistics max = ages.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println(max.getAverage());

		List<EmployeeDTO> sal = (List<EmployeeDTO>) empList.stream().filter(e -> e.getSalary() > 1)
				.collect(Collectors.groupingBy(EmployeeDTO::getSalary));
		System.out.println(sal);

//		List<EmployeeDTO> sal=empList.stream().map(e->e.getSalary())
//		.sorted(Comparator.reverseOrder())
//		.collect(Collectors.groupingBy(EmployeeDTO::getSalary)).collect
//		;

	}

}
