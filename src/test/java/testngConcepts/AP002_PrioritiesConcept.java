package testngConcepts;

//Test NG by default runs test cases in alphabetical order, so test cases need to be prioritised first

import org.testng.annotations.Test;

public class AP002_PrioritiesConcept {
	
    @Test (priority = 1)
	public void Login() {
		System.out.println("********Login Test*******");
		System.out.println("Entered Username");
		System.out.println("Entred Password");
		System.out.println("Clicked on Login Button");
	}
    @Test (priority = 2)
	public void BookTickets() {
    	System.out.println("*********Booking Tickets********");
		System.out.println("Flight dates are selected");
		System.out.println("Flight is selected");
		System.out.println("Credit Card details are entered");
		System.out.println("Tickets are booked");
	}
    @Test (priority = 3)
	public void Logout() {
    	System.out.println("*********Logout Test*******");
		System.out.println("Logout button clicked");
	}
}
