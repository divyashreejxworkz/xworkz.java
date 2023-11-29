package com.xworkz.company.abstractImplementaion;

import com.xworkz.company.abstracts.Company;
import com.xworkz.companyInfo.CompanyInfo;

public class CompanyImplementation extends Company {

	Object obj[]=new Object[4];
	int index=0;
	public boolean onSave(CompanyInfo companyInfo) {
		if(companyInfo!=null) {
			System.out.println("CompanyInfo is not null");
			if(index<obj.length) {
				obj[index]=companyInfo;
				index++;
				return true;
			}
			}
		else {
System.out.println("CompanyInfo is null");			
			
		}
		return false;
		
	}
}
