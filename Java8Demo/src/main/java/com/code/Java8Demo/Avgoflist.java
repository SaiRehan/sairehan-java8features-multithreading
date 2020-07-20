package com.code.Java8Demo;
import java.util.*;

public class Avgoflist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avgoflist a1=new Avgoflist();
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		System.out.println(a1.average(list1));

	}
	public Double average(List<Integer> list) {
		
		return list.stream().mapToInt(i->i).average().getAsDouble();
	}

}
