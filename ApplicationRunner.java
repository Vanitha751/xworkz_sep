package com.xworkz.abstraction;

import com.xworkz.abstraction.abstracts.Application;
import com.xworkz.abstraction.things.HikeApplication;

public class ApplicationRunner {
public static void main(String[] args) {
	
	//we canot create an object for abstract
	//Application application=new Application();
	//Abstract class is also called as implementation classes
	//With the help of subclass we can create an object
	
	Application application=new HikeApplication();
	
	application.chat();
	
	
}
}
