package com.xworkz.musicalnight.runner;

import com.xworkz.musicalnight.abstracts.MusicalNight;
import com.xworkz.musicalnightdto.MusicalNightDto;

import ccom.xworkz.musicalnight.abstractimplementation.MusicalNightImplementation;

public class MusicalNightRunner {
	public static void main(String[] args) {
	MusicalNight m= new MusicalNightImplementation();
	MusicalNightDto d=new MusicalNightDto();
	d.setAmount(2500);
d.setWhichState("Karnataka");
d.setWhichSong("Sapthasagaradache yello");
d.setWhichCountry("India");
d.setWhichCategories("celabrities");
d.setWhichActivities("dancing");
d.setServiceMode("offline");
d.setTotalDuration("9hours");
d.setStartTime("8pm");
d.setTypeOfService("Event Management");
d.setTotalDuration("2days");
d.setRate(4.6f);
d.setPrivacyIsThere(true);
d.setPopularEvents("Musical Shows");
d.setPlace("Banglore");
d.setPhoneNumber(9876587676l);
d.setMusicPlayer("A.R.Rahaman");
d.setMinimumOrder("1day");
d.setMaleSinger("sona nigam");
d.setItLivePerformance(true);
d.setFemaleSinger("Shreya goshal");
d.setEveryDay(false);
d.setEndTime("12pm");
d.setDiscount(10.0f);
d.setDate("1/12/2023");
d.setUpComingEvents("Ladies function.DIVYSHREE.toString()");//enum
m.onSave(d);
System.out.println("save:"+m.onSave(d));
m.read();
		}
}
