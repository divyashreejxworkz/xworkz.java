package com.xworkz.musicalnightdto;

public class MusicalNightDto {
	private String place;
	private String typeOfService;
	private String serviceMode;
	private String minimumOrder;
	private int amount;
	private long phoneNumber;
	private String date;
	private String startTime;
	private String endTime;
	private String whichCountry;
	private String whichState;
	private String musicPlayer;
	private String maleSinger;
	private String femaleSinger;
	private String whichSong;
	private float rate;
	private boolean isEveryDay;
	private String whichActivities;
	private String popularEvents;
	private String whichCategories;
	private boolean isPrivacyIsThere;
	private String upComingEvents;
	private String totalDuration;
	private boolean isItLivePerformance;
	private float discount;

	public MusicalNightDto() {
		System.out.println("No-Argument Constructor");
	}

	public MusicalNightDto(String place, String typeOfService, String serviceMode, String minimumOrder, int amount,
			long phoneNumber, String date, String startTime, String endTime, String whichCountry, String whichState,
			String musicPlayer, String maleSinger, String femaleSinger, String whichSong, float rate,
			boolean isEveryDay, String whichActivities, String popularEvents, String whichCategories,
			boolean isPrivacyIsThere, String upComingEvents, String totalDuration, boolean isItLivePerformance,
			float discount) {
		System.out.println("All-Argument Constructor");
		this.place = place;
		this.typeOfService = typeOfService;
		this.serviceMode = serviceMode;
		this.minimumOrder = minimumOrder;
		this.amount = amount;
		this.phoneNumber = phoneNumber;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.whichCountry = whichCountry;
		this.whichState = whichState;
		this.musicPlayer = musicPlayer;
		this.maleSinger = maleSinger;
		this.femaleSinger = femaleSinger;
		this.whichSong = whichSong;
		this.rate = rate;
		this.isEveryDay = isEveryDay;
		this.whichActivities = whichActivities;
		this.popularEvents = popularEvents;
		this.whichCategories = whichCategories;
		this.isPrivacyIsThere = isPrivacyIsThere;
		this.upComingEvents = upComingEvents;
		this.totalDuration = totalDuration;
		this.isItLivePerformance = isItLivePerformance;
		this.discount = discount;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTypeOfService() {
		return typeOfService;
	}

	public void setTypeOfService(String typeOfService) {
		this.typeOfService = typeOfService;
	}

	public String getServiceMode() {
		return serviceMode;
	}

	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
	}

	public String getMinimumOrder() {
		return minimumOrder;
	}

	public void setMinimumOrder(String minimumOrder) {
		this.minimumOrder = minimumOrder;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getWhichCountry() {
		return whichCountry;
	}

	public void setWhichCountry(String whichCountry) {
		this.whichCountry = whichCountry;
	}

	public String getWhichState() {
		return whichState;
	}

	public void setWhichState(String whichState) {
		this.whichState = whichState;
	}

	public String getMusicPlayer() {
		return musicPlayer;
	}

	public void setMusicPlayer(String musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	public String getMaleSinger() {
		return maleSinger;
	}

	public void setMaleSinger(String maleSinger) {
		this.maleSinger = maleSinger;
	}

	public String getFemaleSinger() {
		return femaleSinger;
	}

	public void setFemaleSinger(String femaleSinger) {
		this.femaleSinger = femaleSinger;
	}

	public String getWhichSong() {
		return whichSong;
	}

	public void setWhichSong(String whichSong) {
		this.whichSong = whichSong;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public boolean isEveryDay() {
		return isEveryDay;
	}

	public void setEveryDay(boolean isEveryDay) {
		this.isEveryDay = isEveryDay;
	}

	public String getWhichActivities() {
		return whichActivities;
	}

	public void setWhichActivities(String whichActivities) {
		this.whichActivities = whichActivities;
	}

	public String getPopularEvents() {
		return popularEvents;
	}

	public void setPopularEvents(String popularEvents) {
		this.popularEvents = popularEvents;
	}

	public String getWhichCategories() {
		return whichCategories;
	}

	public void setWhichCategories(String whichCategories) {
		this.whichCategories = whichCategories;
	}

	public boolean isPrivacyIsThere() {
		return isPrivacyIsThere;
	}

	public void setPrivacyIsThere(boolean isPrivacyIsThere) {
		this.isPrivacyIsThere = isPrivacyIsThere;
	}

	public String getUpComingEvents() {
		return upComingEvents;
	}

	public void setUpComingEvents(String upComingEvents) {
		this.upComingEvents = upComingEvents;
	}

	public String getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(String totalDuration) {
		this.totalDuration = totalDuration;
	}

	public boolean isItLivePerformance() {
		return isItLivePerformance;
	}

	public void setItLivePerformance(boolean isItLivePerformance) {
		this.isItLivePerformance = isItLivePerformance;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String toString() {
		System.out.println("toString is method");
		return "MusicalNight:(place:" + place + " " + " typeOfService:" + typeOfService + " " + "serviceMode:"
				+ serviceMode + " " + "minimumOrder:" + minimumOrder + " " + "amount:" + amount + "" + "phoneNumber:"
				+ phoneNumber + "" + "date:" + date + "" + startTime + "" + "endTime:" + endTime + "" + "whichCountry:"
				+ whichCountry + "" + "whichState:" + whichState + "" + "musicPlayer:" + musicPlayer + ""
				+ "maleSinger:" + maleSinger + "" + "femaleSinger:" + femaleSinger + "" + "whichSong:" + whichSong + ""
				+ "rate:" + rate + "" + "isEveryDay:" + isEveryDay + "" + "whichActivities:" + whichActivities + ""
				+ "popularEvents:" + popularEvents + "" + "whichCategories:" + whichCategories + ""
				+ "isPrivacyIsThere:" + isPrivacyIsThere + "" + "upComingEvents:" + upComingEvents + ""
				+ "totalDuration:" + totalDuration + "" + "isItLivePerformance:" + isItLivePerformance + ""
				+ "discount:" + discount + ")";
	}

	public int hashCode() {
		System.out.println("hashCode is method");
		int totalAmmount = 25000 + 1000;
		return totalAmmount;
	}
	public boolean equals(Object obj)
	{
		if(this==obj) 
			return true;
	return false;
		}
	}
		
		
	


