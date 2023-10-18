package com.xworkz.darara1.things;

public class CountryName {
	int index=0;
	String[] countryList=new String[3];
	public void getName(String name) {
	System.out.println("The country names:"+name);
		if(index<countryList.length) {
			countryList[index]=name;
			index++;
			}else {
				System.out.println("The save countryList is full");
			}
		}
		
		public void getCountry() {
			for(int i=0;i<countryList.length;i++) {
				System.out.println("The read the country names:"+countryList[i]);
			}
		}
		public void upDate(String oldName,String newName) {
			System.out.println("the up date the country names");
			for(int i=0;i<countryList.length;i++) {
				if(countryList[i]==oldName) {
					countryList[i]=newName;
				}
			}
			}
			public void delete(String name) {
				System.out.println("The delete the names");
				for(int i=0;i<countryList.length;i++) {
					if(countryList[i]==name)
						countryList[i]=null;
			if(i==(countryList.length-1)&&countryList[i]!=name) {
				}
					
			}
	}

}
