package com.xworkz.house.abstractImplementation;

import com.xworkz.house.abstracts.House;
import com.xworkz.houseInfo.HouseInfo;

public class HouseImplementation extends House{

	Object obj[]=new Object[4];//declaring array
	int index=0;
	@Override
	public boolean onSave(HouseInfo houseInfo) {//new implementation
		if(houseInfo!=null) {
			System.out.println("Dto is not null");
			if(index<obj.length) {
				obj[index]=houseInfo;
				index++;
				return true;
			}
		}
		else {
			System.out.println("Dto is null");
			}
		return false;
		}
	}




