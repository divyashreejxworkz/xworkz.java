package com.xworkz.education.abstractsImplementation;

import com.xworkz.education.abstracts.Education;
import com.xworkz.educationInfo.EducationInfo;

public class EducationImplementation extends Education {
	Object obj[]=new Object[0];
	int index=0;
	public boolean onSave(EducationInfo educationInfo) {
		if(educationInfo!=null) {
			System.out.println("Education is not null");
		if(index<obj.length) {
			obj[index]=educationInfo;
			index++;
			return true;
		}
	}
else {
System.out.println("Education is null");
}
return false;
}

}
