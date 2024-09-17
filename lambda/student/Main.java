package com.lambda.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Mohit", 90));
		students.add(new Student("Rohit", 80));
		students.add(new Student("Sup", 100));
		
		//Collections.sort(students, new StudentComparator());
		
		Collections.sort(students, (obj1, obj2) -> {
			if(obj1.marks > obj2.marks)
				return 1;
			else if(obj1.marks < obj2.marks)
				return -1;
			else
				return 0;
		});
		
	}
}
