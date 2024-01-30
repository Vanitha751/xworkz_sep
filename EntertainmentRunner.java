package com.xworkz.entertainment.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.xworkz.entertainment.things.Entertainment;

public class EntertainmentRunner {
public static void main(String[] args) {
	
	List<Entertainment> listOfArray=new ArrayList<Entertainment>();
	Entertainment entertainment=new Entertainment("Instagram",1,"Reels","instragram websites","9","Mobile",new Date());
	Entertainment entertainment1=new Entertainment("Youtube",2,"WebSeries","Utube","12","Laptop",new Date());
	listOfArray.add(entertainment1);
	listOfArray.add(entertainment);
	
	Entertainment entertainment2=new Entertainment("Circus",3,"Dance","nill","9","Daminedu",new Date());
	Entertainment entertainment3=new Entertainment("Google",4,"Movie","ibommaWebsites","9","Mobile",new Date());
	Entertainment entertainment4=new Entertainment("Facebook",5,"Post","FbWebsites","9","Mobile",new Date());
	Entertainment entertainment5=new Entertainment("StarMaker",6,"Songs","SmWebsites","23","MobilApp",new Date());
	Entertainment entertainment6=new Entertainment("SubaySuuff",7,"Playing","Game","9","MobileApp",new Date());
	Entertainment entertainment7=new Entertainment("Templerun",8,"Playing","Game","9","MobileApp",new Date());
	Entertainment entertainment8=new Entertainment("Home",9,"M&f&B&s","nill","9","Home",new Date());
	Entertainment entertainment9=new Entertainment("Friends",10,"WhatsApp","videocall","9","Mobile",new Date());
	
	listOfArray.add(entertainment3);
	listOfArray.add(entertainment2);
	listOfArray.add(entertainment4);
	listOfArray.add(entertainment5);
	listOfArray.add(entertainment6);
	listOfArray.add(entertainment7);
	listOfArray.add(entertainment8);
	listOfArray.add(entertainment9);
	
//	List<Integer> list=new ArrayList<Integer>();
//	list.add(1);
//    list.add(2);
//    list.add(3);
//    list.add(4);
//    list.add(5);
  //  Collections.sort(list);
    listOfArray.sort(Comparator.comparing(Entertainment::getDate).reversed());
    System.out.println("listOfArray:"+listOfArray);
 //   System.out.println("Sorted List is:"+list);
}
}