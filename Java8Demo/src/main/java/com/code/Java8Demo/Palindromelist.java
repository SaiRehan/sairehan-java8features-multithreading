package com.code.Java8Demo;

import java.util.*;
import java.util.stream.IntStream;

public class Palindromelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindromelist s1=new Palindromelist();
		List<String> list2=Arrays.asList("madam","acid","level","score","rotator");
		System.out.println(s1.palindromecheck(list2));

	}
	public List<String> palindromecheck(List<String> list) {
		
		List<String> pl=new ArrayList<String>();
		for (String i:list) { 
			if((IntStream.range(0,i.length()/2).noneMatch(j->i.charAt(j)!=i.charAt(i.length()-j-1)))){
				pl.add(i);
			}
			
		}
		return pl;
	}

}
