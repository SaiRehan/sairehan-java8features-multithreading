package com.code.Java8Demo;

import java.util.*;
import java.util.stream.Collectors;

public class ListofStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListofStrings s1=new ListofStrings();
		List<String> list1=Arrays.asList("app","acid","axe","Anu");
		System.out.println(s1.start_a(list1));

	}
	public List<String> start_a(List<String> list) {
		
		return list.stream()
				.filter(s->s.startsWith("a"))
				.filter(s->s.length()==3)
				.collect(Collectors.toList());
	}

}
