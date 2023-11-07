package com.xworkz.shopping.things;

public class Television {
	public String whichLanguage;
	public int totalChannels;
	//overriding method
	protected void getChannelInfo(String whichLanguage,int totalChannels) {
		System.out.println("The about television");
	}
	protected void getChannelInfo(int totalChannels,String whichLanguage) {
		System.out.println("The about television");
	}
	protected void getChannelInfo(byte totalChannels,String whichLanguage) {
		System.out.println("The about television");
	}
	}
