package com.xworkz.shopping.things;
@override
public class Channel extends Television{
	//overriding method
	public void getChannelInfo(String whichLanguage,int totalChannels) {
		System.out.println("The Channels in Television");
	}
	public void getChannelInfo(int totalChannels,String whichLanguage) {
		System.out.println("The Channels in Television");
	}
	public void getChannelInfo(byte totalChannels,String whichLanguage) {
		System.out.println("The Channels in Television");
	}
}
