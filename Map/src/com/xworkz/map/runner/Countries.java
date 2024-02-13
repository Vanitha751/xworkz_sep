package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Countries {
public static void main(String[] args) {
	Map<Integer,String> countries = new HashMap<Integer,String>();
    countries.put(1, "India");
    countries.put(2, "USA");
    countries.put(3, "Japan");
    countries.put(4, "Germany");
    countries.put(5, "Australia");
    countries.put(9, "India");
    countries.put(6, "USA");
    countries.put(3, "Japan");
    countries.put(8, "Germany");
    countries.put(10, "Australia");
    
    System.out.println(countries);
    Set<Integer> set = countries.keySet();
    System.out.println(set);
    System.out.println(countries.values());
    System.out.println(countries.containsValue("Japan"));
    System.out.println(countries.containsKey(2));
    System.out.println(countries.size());
    System.out.println(countries.get(1));
}
}
