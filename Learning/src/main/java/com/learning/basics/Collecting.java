package com.learning.basics;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collecting {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(2, "abc");
		map.put(1, "Shivam");
		map.put(1, "xyz");
		
		
		System.out.println(map);
		// LinkedList<Integer> values = new LinkedList<Integer>();
		Set<Integer> values = new TreeSet<Integer>();
		//Map<Integer, String>
		// values.add("hello");
		// values.addAll("ye lo");
		values.add(123);
		values.add(567);
		values.add(453);
		values.add(453);
		values.add(567);
		values.add(453);
		values.add(567);

		for (Integer values1 : values) {

			System.out.println(values1);

		}
		System.out.println(values);

	}

}
