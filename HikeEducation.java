package com.xworkz.abstraction.things;

import com.xworkz.abstraction.abstracts.Education;

public class HikeEducation extends Education{

	@Override
	public void institutionName() {
		System.out.println("InstituteName method from the Hiking Education");
	}

	@Override
	public void course() {
		System.out.println("Course method from the Hiking Education");
		
	}

	@Override
	public void location() {
		System.out.println("Location method from the hiking education");
		
	}

	@Override
	public void duration() {
		System.out.println("duration Method from the hiking education");
	}

}
