package com.Functional.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		
		list = list.stream().map(e -> e + 10).collect(Collectors.toList());
		System.out.println(list);
	}
}
