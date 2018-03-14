package org.test;

public class PaymentService {

	 public String processPayment(String message) {
		 
		 System.out.println("Message to Payment Service from client:"+message);
		 
	        return "Echo Message - " + message;
	    }
	
}
