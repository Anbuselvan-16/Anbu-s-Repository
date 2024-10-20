package com.anbu.SpringXmlbasedProject2;

public class Laptop {
	
	public Laptop(Mobile mobile) {
		this.mobile = mobile;
	}

	private Mobile mobile;
	
	public String getLaptopMobileName() {
		return "laptop name :"+"Asusvivobook" +"  "+ "mobilename :"+mobile.getMobileName();
	}
}
	
	
//	public String getLaptopName() {
//		return "Vivobook";
		
//	}
	
//	public String getLaptopPrice() {
//		return "60000";
//		
//	}
	
// }
