package com.xworkz.musicalnights.abstractimplementation;

import com.xworkz.musicalnights.abstracts.MusicalNight;
import com.xworkz.musicalnights.dto.MusicalNightsDto;

public class MusicalNightImplementation extends MusicalNight {
	
	Object obj[]= new Object[4];
	int index=0;
	@Override
	public boolean onSave(MusicalNightsDto musicalDto) {
		if(musicalDto!=null) {
			System.out.println("Dto is not null");
			if(index<obj.length) {
				obj[index]=musicalDto;
				index++;
				return true;
			}
		}else {
			System.out.println("Dto is null");
		}
		return false;
	}
	@Override
	public void read() {
		for(Object object:obj) {
			System.out.println("MusicalNight obj is:"+obj);
		}
		
		
	}

}
