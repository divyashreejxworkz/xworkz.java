package com.xworkz.life.abstractImplementation;

import com.xworkz.life.abstracts.Life;
import com.xworkz.lifeinfo.LifeDto;

public class LifeAbstractImplementation extends Life {

	Object obj[]=new Object[4];//declaring array
	int index=0;
	
	@Override
	public boolean onSave(LifeDto lifeDto) {//new implementation
		if(lifeDto!=null) {
			System.out.println("Dto is not null");
			if(index<obj.length) {
				obj[index]=lifeDto;
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

