package com.xworkz.darara1.driver;

import com.xworkz.darara1.things.CricketTeamNames;

public class CricketTeamNamesRunner {
	public static void main(String args[]) {
	CricketTeamNames cricketteamnames=new CricketTeamNames();
	cricketteamnames.getTeamName("Sachin");
	cricketteamnames.getTeamName("Dhoni");
	cricketteamnames.getTeamName("kohily");
	cricketteamnames.getTeamName("Rahul Drawid");
	cricketteamnames.read();
	cricketteamnames.upDate("Sachin","virendra singh");
	cricketteamnames.read();
	cricketteamnames.delete("kohily");
	cricketteamnames.read();
	
	}

}
