package com.xworkz.entertainment.things;

import java.util.Comparator;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Entertainment implements Comparator<Entertainment>{

	private String socialMedia;
	private int noOfPlatforms;
	private String typesOfEntertainments;
	private  String website;
	private String timings;
	private String location;
	private Date date;
	@Override
	public int compare(Entertainment o1, Entertainment o2) {
		return 0;
	}
	
}
