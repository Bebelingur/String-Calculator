package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}


	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void testMultipleNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testNewLineWithNumbers(){
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testNegativeNumber(){
		try
		{
			Calculator.add("-1,2");			
		}
		catch(RuntimeException exception)
		{}
	}

	@Test
	public void testNegativeNumbers(){
		try
		{
			Calculator.add("2,-4,3,-5");	
		}
		catch(RuntimeException exception)
		{}		
	}
}