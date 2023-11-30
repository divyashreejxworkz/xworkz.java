package ccom.xworkz.musicalnight.abstractimplementation;

import com.xworkz.musicalnight.abstracts.MusicalNight;
import com.xworkz.musicalnightdto.MusicalNightDto;

public class MusicalNightImplementation extends MusicalNight{
	Object obj[]=new Object[4];
	int index=0;
@Override
	public boolean onSave(MusicalNightDto musicalNightDto)
	{
		if(musicalNightDto!=null) {
			System.out.println("musicalNightDto is not null");
			if(index<obj.length) {//array name object 
				obj[index]= musicalNightDto;
				index++;
				return true;
			}
		}
	else {
		System.out.println("musicalNightDto is null");
	}
	return false;

	}
	public void read()//this is enum method
	{
		for(Object object:obj) {//for each nothing but for loop
			System.out.println("Object is:"+object);
		}
	}

	}



