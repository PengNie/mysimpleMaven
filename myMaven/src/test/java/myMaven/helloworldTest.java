package myMaven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class helloworldTest {

	  protected int value1, value2;
	   @Before
	   // assigning the values
	   public void setUp(){
	      value1 = 3;
	      value2 = 3;
	   }
	   @Test
	   // test method to add two values
	   public void testAdd(){
	      double result = value1 + value2;
	      assertTrue(result == 6);
	   }
}
