package com.xworkz.musicalnights.dto;

import java.util.Arrays;

public class MusicalNightsDto {
	private String venue;
    private String organizer;
    private String theme;
    private long performers;
    private String schedule;
    private boolean isTicketed;
    private int capacity;
    private boolean isOutdoor;
    private String sponsors;
    private String contactInfo;
    private String genres;
    private String featuredSongs;
    private String attire;
    private boolean isLiveStreamAvailable;
    private String socialMediaLinks;
    private String reviews;
    private int ticketPrice;
    private boolean isSoldOut;
    private String specialGuest;
    private String posterImageURL;
	@Override
	public String toString() {
		return "MusicalNightsDto [venue=" + venue + ", organizer=" + organizer + ", theme=" + theme + ", performers="
				+ performers + ", schedule=" + schedule + ", isTicketed=" + isTicketed + ", capacity="
				+ capacity + ", isOutdoor=" + isOutdoor + ", sponsors=" + sponsors + ", contactInfo=" + contactInfo
				+ ", genres=" + genres + ", featuredSongs=" + featuredSongs + ", attire=" + attire
				+ ", isLiveStreamAvailable=" + isLiveStreamAvailable + ", socialMediaLinks=" + socialMediaLinks
				+ ", reviews=" + reviews + ", ticketPrice=" + ticketPrice + ", isSoldOut=" + isSoldOut
				+ ", specialGuest=" + specialGuest + ", posterImageURL=" + posterImageURL + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return ticketPrice;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicalNightsDto other = (MusicalNightsDto) obj;
		return true;
	}
	public MusicalNightsDto() {
	System.out.println("No-Args constructor");
	}
	public MusicalNightsDto(String venue, String organizer, String theme, long performers, String schedule,
			boolean isTicketed, int capacity, boolean isOutdoor, String sponsors, String contactInfo, String genres,
			String featuredSongs, String attire, boolean isLiveStreamAvailable, String socialMediaLinks, String reviews,
			int ticketPrice, boolean isSoldOut, String specialGuest, String posterImageURL) {
		this.venue = venue;
		this.organizer = organizer;
		this.theme = theme;
		this.performers = performers;
		this.schedule = schedule;
		this.isTicketed = isTicketed;
		this.capacity = capacity;
		this.isOutdoor = isOutdoor;
		this.sponsors = sponsors;
		this.contactInfo = contactInfo;
		this.genres = genres;
		this.featuredSongs = featuredSongs;
		this.attire = attire;
		this.isLiveStreamAvailable = isLiveStreamAvailable;
		this.socialMediaLinks = socialMediaLinks;
		this.reviews = reviews;
		this.ticketPrice = ticketPrice;
		this.isSoldOut = isSoldOut;
		this.specialGuest = specialGuest;
		this.posterImageURL = posterImageURL;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public long getPerformers() {
		return performers;
	}
	public void setPerformers(long performers) {
		this.performers = performers;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public boolean isTicketed() {
		return isTicketed;
	}
	public void setTicketed(boolean isTicketed) {
		this.isTicketed = isTicketed;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isOutdoor() {
		return isOutdoor;
	}
	public void setOutdoor(boolean isOutdoor) {
		this.isOutdoor = isOutdoor;
	}
	public String getSponsors() {
		return sponsors;
	}
	public void setSponsors(String sponsors) {
		this.sponsors = sponsors;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getFeaturedSongs() {
		return featuredSongs;
	}
	public void setFeaturedSongs(String featuredSongs) {
		this.featuredSongs = featuredSongs;
	}
	public String getAttire() {
		return attire;
	}
	public void setAttire(String attire) {
		this.attire = attire;
	}
	public boolean isLiveStreamAvailable() {
		return isLiveStreamAvailable;
	}
	public void setLiveStreamAvailable(boolean isLiveStreamAvailable) {
		this.isLiveStreamAvailable = isLiveStreamAvailable;
	}
	public String getSocialMediaLinks() {
		return socialMediaLinks;
	}
	public void setSocialMediaLinks(String socialMediaLinks) {
		this.socialMediaLinks = socialMediaLinks;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public boolean isSoldOut() {
		return isSoldOut;
	}
	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}
	public String getSpecialGuest() {
		return specialGuest;
	}
	public void setSpecialGuest(String specialGuest) {
		this.specialGuest = specialGuest;
	}
	public String getPosterImageURL() {
		return posterImageURL;
	}
	public void setPosterImageURL(String posterImageURL) {
		this.posterImageURL = posterImageURL;
	}
}
