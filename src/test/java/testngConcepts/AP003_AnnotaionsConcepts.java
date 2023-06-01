package testngConcepts;
//Assertions compare and verify if test is pass or fail
//Hard Assertion : when assertion fails, t does not continue further
//Soft Assertions: to continue execution further even after assertion is failed

import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AP003_AnnotaionsConcepts {
	
	@Test
	public void CheckValues() {
      int no1 = 100, no2 = 200;      
      String Actname = "Nazneen", Expname="Nazneen";      
      boolean expstatus = true, actstatus = false;
      
      SoftAssert sa = new SoftAssert();//Continues execution even after a assertion fails
      sa.assertEquals(no1, no2, "Numbers are not matching");
      sa.assertEquals(Actname, Expname, "Names are not matching");
      System.out.println("Names are matching");
      sa.assertEquals(actstatus, expstatus, "Link is not displayed");
      
      sa.assertAll();
      
     // Assert.assertEquals(actstatus, expstatus, "Link is displayed");
      //System.out.println("Link is displayed");
      
      Assert.assertTrue(actstatus, "Status is not matching");
      System.out.println("Status is matching");
      
        Assert.assertEquals(Actname, Expname, "Values are not matching");
        //Assert.assertEquals(Actname, Expname, "Values are not matching");
        System.out.println("Values are matching");
        
        Assert.assertEquals(no1, no2, "Numbers do not match");
        System.out.println("Numbers are matching");
	}
        
        
        
		 
}
