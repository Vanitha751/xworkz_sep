package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fruits {
	public static void main(String[] args) {
        Map<Integer,String> fruits = new HashMap<Integer,String>();
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Orange");
        fruits.put(4, "Grapes");
        fruits.put(5, "Mango");
        fruits.put(6, "kiwi");
        fruits.put(7, "strawBerry");
        fruits.put(8, "promogranate");
        fruits.put(9, "BlackBerry");
        fruits.put(10, "papaya");

        System.out.println(fruits);
        Set<Integer> set = fruits.keySet();
        System.out.println(set);
        System.out.println(fruits.values());
        System.out.println(fruits.containsValue("Grapes"));
        System.out.println(fruits.containsKey(2));
        System.out.println(fruits.size());
        System.out.println(fruits.get(1));
    }
}
