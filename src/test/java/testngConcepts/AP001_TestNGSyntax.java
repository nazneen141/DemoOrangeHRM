package testngConcepts;

import org.testng.annotations.Test;
//When test is executed successfully, it automatically reports as PASSED or Failed
//Methods in TestNG should be non-static
public class AP001_TestNGSyntax {
	
    @Test //Is an annotation to run TestNG code
	public void displaymsg() {
		System.out.println("My name is Nazneen");
	}
    @Test
    public void DisplayName() {
    	System.out.println("Nazneen Shaik");
    }
}
