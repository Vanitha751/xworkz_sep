package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Languages {

	public static void main(String[] args) {
		 Map<Integer,String> languages = new HashMap<Integer,String>();
	        languages.put(1, "Java");
	        languages.put(2, "Python");
	        languages.put(3, "C++");
	        languages.put(4, "JavaScript");
	        languages.put(5, "Ruby");
	        languages.put(6, "C");
	        languages.put(7,"C++");
	        languages.put(8,"AI");

	        Set<Integer> set = languages.keySet();
	        System.out.println(set);
	        System.out.println(languages.values());
	        System.out.println(languages.containsValue("C++"));
	        System.out.println(languages.containsKey(2));
	        System.out.println(languages.size());
	        System.out.println(languages.get(1));

}
}