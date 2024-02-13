package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Vegetables {
	public static void main(String[] args) {
        Map<Integer,String> vegetables = new HashMap<Integer,String>();
        vegetables.put(1, "Carrot");
        vegetables.put(2, "Tomato");
        vegetables.put(3, "Spinach");
        vegetables.put(4, "Potato");
        vegetables.put(5, "Broccoli");
        vegetables.put(6, "Carrot");
        vegetables.put(7, "Tomato");
        vegetables.put(8, "Spinach");
        vegetables.put(9, "Potato");
        vegetables.put(10, "Broccoli");
        
        System.out.println(vegetables);
        Set<Integer> set = vegetables.keySet();
        System.out.println(set);
        System.out.println(vegetables.values());
        System.out.println(vegetables.containsValue("Potato"));
        System.out.println(vegetables.containsKey(2));
        System.out.println(vegetables.size());
        System.out.println(vegetables.get(1));
    }
}
