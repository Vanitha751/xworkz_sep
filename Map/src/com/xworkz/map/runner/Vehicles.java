package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Vehicles {

	public static void main(String[] args) {
		Map<Integer, String> vehicles = new HashMap<Integer,String>();
        vehicles.put(1, "Car");
        vehicles.put(2, "Bike");
        vehicles.put(3, "Truck");
        vehicles.put(4, "Scooter");
        vehicles.put(5, "Bus");
        vehicles.put(6, "Car");
        vehicles.put(7, "Bike");
        vehicles.put(8, "Truck");
        vehicles.put(9, "Scooter");
        vehicles.put(10, "Bus");
        
        System.out.println(vehicles);
        Set<Integer> set = vehicles.keySet();
        System.out.println(set);
        System.out.println(vehicles.values());
        System.out.println(vehicles.containsValue("Scooter"));
        System.out.println(vehicles.containsKey(2));
        System.out.println(vehicles.size());
        System.out.println(vehicles.get(1));
    }
	}


