package com.lambda.student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.marks > o2.marks)
				return 1;
		else if(o1.marks < o2.marks)
			return -1;
		else
			return 0;
	}
}

