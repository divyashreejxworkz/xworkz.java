package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Buyer;
import com.xworkz.shopping.things.Seller;

public class AgricultureRunner {
	public static void main(String[] args) {
		Seller s= new Seller();
		s.sellerInfo();
		s.landInfo();
		s.agricultureInfo();
		Buyer b = new Buyer();
		b.buyerInfo();
		b.landInfo();
		b.agricultureInfo();
		}
	}

