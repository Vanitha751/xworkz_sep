package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Books {
	public static void main(String[] args) {
        Map<Integer,String> books = new HashMap<Integer,String>();
        books.put(1, "Java Programming");
        books.put(2, "Clean Code");
        books.put(3, "Effective Java");
        books.put(4, "Head First Design Patterns");
        books.put(5, "Thinking in Java");
        books.put(6, "Java Programming");
        books.put(7, "Clean Code");
        books.put(8, "Effective Java");
        books.put(9, "Head First Design Patterns");
        books.put(10, "Thinking in Java");

        System.out.println(books);
        Set<Integer> set = books.keySet();
        System.out.println(set);
        System.out.println(books.values());
        System.out.println(books.containsValue("Effective Java"));
        System.out.println(books.containsKey(2));
        System.out.println(books.size());
        System.out.println(books.get(1));
        
    }
}
