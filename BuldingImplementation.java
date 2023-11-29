package com.xworkz.building.abstractImplementation;

import com.xworkz.building.BuildingInfo;
import com.xworkz.building.abstracts.Building;

public class BuldingImplementation extends Building{
Object obj[]=new Object[4];
int index=0;
@Override
public boolean onSave(BuildingInfo buildingInfo)
{
	if(buildingInfo!=null) {
		System.out.println("BuildingInfo is not null");
		if(index<obj.length) {//array name object 
			obj[index]=buildingInfo;
			index++;
			return true;
		}
	}
else {
	System.out.println("BuildingInfo is null");
}
return false;

}
}
