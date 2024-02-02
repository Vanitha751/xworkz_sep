package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.collections.things.WatchDto;

public class WatchRunner {
public static void main(String[] args) {	
	LinkedList<WatchDto> watch=new LinkedList<WatchDto>();	
	WatchDto dto=new WatchDto("sonata",10000, "black","round","good","online");
	System.out.println("dto list:"+dto.toString());
	
	WatchDto dto1=new WatchDto("titan",20000, "black","round","good","online");
	System.out.println("dto list:"+dto1.toString());
	
	WatchDto dto2=new WatchDto("fasttrack",30000, "black","round","good","online");
	System.out.println("dto list:"+dto2.toString());
	
	WatchDto dto3=new WatchDto("sonata",20000, "black","round","good","online");
	System.out.println("dto list:"+dto3.toString());
	
	WatchDto dto4=new WatchDto("sonata",10000, "white","round","good","online");
	System.out.println("dto list:"+dto4.toString());
	
	WatchDto dto5=new WatchDto("sonata",20000, "red","round","good","online");
	System.out.println("dto list:"+dto5.toString());
	
	WatchDto dto6=new WatchDto("sonata",10000, "black","round","good","online");
	System.out.println("dto list:"+dto6.toString());
	
	WatchDto dto7=new WatchDto("sonata",30000, "black","round","good","online");
	System.out.println("dto list:"+dto7.toString());
	
	WatchDto dto8=new WatchDto("sonata",90000, "white","round","good","online");
	System.out.println("dto list:"+dto8.toString());
	
	WatchDto dto9=new WatchDto("sonata",20000, "green","round","good","online");
	System.out.println("dto list:"+dto9.toString());
	
	ArrayList<WatchDto> arraylist=new ArrayList<WatchDto>();
	
	arraylist.add(dto);
	arraylist.add(dto1);
	arraylist.add(dto2);
	arraylist.add(dto3);
	arraylist.add(dto4);
	arraylist.add(dto6);
	System.out.println(arraylist);
	

	arraylist.add(5,dto);
	System.out.println(arraylist);
	System.out.println(arraylist.clone());
	System.out.println(arraylist.contains(dto1));
	System.out.println("equals:"+arraylist.equals(arraylist));
	System.out.println(arraylist.get(4));
	System.out.println(arraylist.hashCode());
	System.out.println(arraylist.indexOf(dto2));
	System.out.println(arraylist.isEmpty());
	System.out.println(arraylist.lastIndexOf(dto3));
	System.out.println(arraylist.set(4,dto));
	System.out.println(arraylist);
	System.out.println(arraylist.size());
	System.out.println(arraylist.iterator());
	System.out.println(arraylist.spliterator());
	System.out.println(arraylist.listIterator());
	System.out.println(arraylist.listIterator(1));
	System.out.println(arraylist.subList(0, 3));
	System.out.println(arraylist.toArray());

arraylist.clear();
System.out.println( arraylist);
                    
}

}
	
}
}
