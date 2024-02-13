package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Games {

	public static void main(String[] args) {
    Map<Integer,String> game=new HashMap<Integer,String>();
    game.put(1,"kabadi");
    game.put(2,"kho-kho");
    game.put(3, "valleyBall");
    game.put(4, "FootBall");
    game.put(5, "BasketBall");
    game.put(6, "Hockey");
    game.put(7, "Tennis");
    game.put(8, "Batmenton");
    game.put(9, "Cricket");
    game.put(10, "Shortput");
    
    System.out.println(game);
    Set set=game.keySet();
    System.out.println(set);
    System.out.println(game.values());
    System.out.println(game.containsValue("FootBall"));
    System.out.println(game.containsKey(2));
    System.out.println(game.size());
    System.out.println(game.get(1));
	}

}
