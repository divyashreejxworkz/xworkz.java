package com.xworkz;

public class SquarePrint {
	public static void main(String[] args) {
		int size=3;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print("#");//print same line
			}
			System.out.println();//moving to the next line after printing each row
		}
		System.out.println("================");
	int size1=3;
	for(int i=0;i<size1;i++) {
		for(int j=0;j<size1-i-1;j++) {
			System.out.print("");//it will print same line
		}
		for(int k=0;k<=i;k++) {
			System.out.print("#");//it will print same line 
		}
		System.out.println("");//moving next line
	}
	System.out.println("=====================");
	int size2=3;
	for(int i=0;i<size2;i++) {
		for(int k=size2;k>i;k--) {
			System.out.print("#");
		}
		for(int j=0;j<size2-i-1;j++)//3-1,2-1,1-1
		{
			System.out.print("");
		}
		System.out.println();//it will go next line
		
	}
	
}
}



