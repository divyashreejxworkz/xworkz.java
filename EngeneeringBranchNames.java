package com.xworkz.darara1.things;

public class EngeneeringBranchNames {
	int index=0;
	String[] branchList=new String[3];
	public void branch(String name) {
		System.out.println("The Branch name:"+name);
		if(index<branchList.length) {
			branchList[index]=name;
			index++;
		}else {
			System.out.println("The save countryList is full");	
		}
		}
	public void Read() {
		for(int i=0;i<branchList.length;i++)
		{
			System.out.println("The Branch name list:"+branchList[i]);
		}
	}
		public void upDate(String oldName,String newName)
		{
		System.out.println("The update the branch names");
		for(int i=0;i<branchList.length;i++) {
			if(branchList[i]==oldName)
			{
				branchList[i]=newName;
			}
		}
		}
		public void delete(String name) {
			System.out.println("The delete the names");
			for(int i=0;i<branchList.length;i++) {
				if(branchList[i]==name) {
					branchList[i]="hgf";
					if(i==(branchList.length-1)&&branchList[i]!=name) {
					}
					}
				}
				
		}
}