package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Animals {

	public static void main(String[] args) {
		 Map<Integer,String> animals = new HashMap<Integer,String>();
	        animals.put(1, "Lion");
	        animals.put(2, "Tiger");
	        animals.put(3, "Elephant");
	        animals.put(4, "Giraffe");
	        animals.put(5, "Zebra");
	        System.out.println(animals);
	        Set<Integer> set = animals.keySet();
	        System.out.println(set);
	        System.out.println(animals.values());
	        System.out.println(animals.containsValue("Elephant"));
	        System.out.println(animals.containsKey(2));
	        System.out.println(animals.size());
	        System.out.println(animals.get(1));
	    }
	}