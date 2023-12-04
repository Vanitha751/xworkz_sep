package com.xworkz.musicalnights.runner;

import com.xworkz.musicalnights.abstractimplementation.MusicalNightImplementation;
import com.xworkz.musicalnights.abstracts.MusicalNight;
import com.xworkz.musicalnights.dto.MusicalNightsDto;

public class MusicalNightRunner {
	public static void main(String[] args) {
		MusicalNightsDto musicalDto=new MusicalNightsDto();
	    MusicalNight music=new MusicalNightImplementation();
	    music.read();
	    musicalDto.setAttire("abcd");
	    musicalDto.setCapacity(20);
	    musicalDto.setContactInfo("20122info");
	    musicalDto.setFeaturedSongs("AnyBodyCanDance");
	    musicalDto.setGenres("20");
	    musicalDto.setLiveStreamAvailable(false);
	    musicalDto.setOrganizer("Shivani");
	    musicalDto.setOutdoor(false);
	    musicalDto.setPerformers(02101212154l);
	    musicalDto.setPosterImageURL("http//njhaujdnajhu");
	    musicalDto.setReviews("2m");
	    musicalDto.setSchedule("20");
	    musicalDto.setSocialMediaLinks("instashivani@");
	    musicalDto.setSoldOut(false);
	    musicalDto.setSpecialGuest("svsv");
	    musicalDto.setSponsors("abc");
	    musicalDto.setTheme("hhgyjiu");
	    musicalDto.setTicketed(false);
	    musicalDto.setTicketPrice(200);
	    musicalDto.setVenue("abcd");
	}
   
}
