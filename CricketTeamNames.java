package com.xworkz.darara1.things;

public class CricketTeamNames {
	int index=0;
	String[] teamList=new String[3];
	public void getTeamName(String name) {
		System.out.println("The Save The IPL cricket team list:"+name);
		if(index<teamList.length) {
			teamList[index]=name;
			index++;
			}else {
				System.out.println("The IPL cricket team list is full");
			}
		}
	public void read()
	{
		for(int i=0;i<teamList.length;i++) {
			System.out.println("The read the team list:"+teamList[i]);
			
		}
	}
	public void upDate(String oldName,String newName) {
		System.out.println("The update the team list");
		for(int i=0;i<teamList.length;i++) {
			if(teamList[i]==oldName){
				teamList[i]=newName;
			}
		}
	}
	public void delete(String name) {
		System.out.println("The Delete the team list name");
		for(int i=0;i<teamList.length;i++) {
			if(teamList[i]==name) {
				teamList[i]="fhh";
				if(i==(teamList.length-1)&&teamList[i]!=name)
				{
				}
				}
				}
		}
		
	}


