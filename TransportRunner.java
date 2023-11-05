package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.BussTransport;
import com.xworkz.shopping.things.CarTransport;
import com.xworkz.shopping.things.RailTransport;
import com.xworkz.shopping.things.Transport;

public class TransportRunner {
	public static void main(String[] args) {
	Transport t = new Transport();
	t.getTransport();
	RailTransport r=new RailTransport();
	r.getTrainDetails();
	BussTransport b=new BussTransport();
	b.getBussDetails();
	CarTransport c=new CarTransport();
	c.getCarDetails();
	}
	}
