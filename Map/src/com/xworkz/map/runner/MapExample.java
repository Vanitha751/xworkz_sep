package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
public static void main(String[] args) {
	Map<Integer,String> name = new HashMap<Integer,String>();
     name.put(1, "vanitha");
     name.put(2, "shiva");
     name.put(3, "vani");
     name.put(4, "shivani");
     name.put(5, "bujji");
     name.put(6, "prakash");
     name.put(7, "vanitha");
     name.put(8, "vanitha");
     name.put(9, "vanitha");
     name.put(12, "vanitha");

     System.out.println(name);
     Set<Integer> set = name.keySet();
     System.out.println(set);
     System.out.println(name.values());
     System.out.println(name.containsValue("Japan"));
     System.out.println(name.containsKey(2));
     System.out.println(name.size());
     System.out.println(name.get(1));
}
}
