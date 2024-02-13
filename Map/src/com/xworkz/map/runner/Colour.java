package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Colour {
public static void main(String[] args) {
    Map<Integer,String> colour=new HashMap<Integer,String>();
    colour.put(1,"green");
    colour.put(2,"blue");
    colour.put(3,"black");
    colour.put(4,"white");
    colour.put(5,"red");
    colour.put(6, "yellow");
    colour.put(7, "grey");
    colour.put(8, "orange");
    colour.put(9, "purple");
    colour.put(10, "skyBlue");
    
    System.out.println(colour);
    Set<Integer> set=colour.keySet();
    System.out.println(set);
    System.out.println(colour.values());
    System.out.println(colour.containsValue("white"));
    System.out.println(colour.containsKey(2));
    System.out.println(colour.size());
    System.out.println(colour.get(1));
    
}
}
