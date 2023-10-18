package com.xworkz.darara1.driver;

import com.xworkz.darara1.things.EngeneeringBranchNames;

public class EngeneeringBranchNameRunner {
	public static void main(String[] args) {
		EngeneeringBranchNames engineeringbranchname=new EngeneeringBranchNames();
		engineeringbranchname.branch("CS");
		engineeringbranchname.branch("IS");
		engineeringbranchname.branch("EC");
		engineeringbranchname.branch("CIVIL");
		engineeringbranchname.Read();
		engineeringbranchname.upDate("IS","MECH");
		engineeringbranchname.Read();
		engineeringbranchname.delete("EC");
		engineeringbranchname.Read();
		
	}

}
