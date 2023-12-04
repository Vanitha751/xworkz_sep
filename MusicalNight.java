package com.xworkz.musicalnights.abstracts;

import com.xworkz.musicalnights.dto.MusicalNightsDto;

public abstract class MusicalNight {

	public abstract boolean onSave(MusicalNightsDto musicalDto);
	
	public abstract void read();
}
