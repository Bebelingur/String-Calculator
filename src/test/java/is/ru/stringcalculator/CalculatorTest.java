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
		catch(IllegalArgumentException exception)
		{
			assertEquals("Negatives not allowed: -1", exception.getMessage());
		}

	}

	@Test
	public void testNegativeNumbers(){
		try
		{
			Calculator.add("2,-4,3,-5");	
		}
		catch(IllegalArgumentException exception)
		{
			assertEquals("Negatives not allowed: -4,-5", exception.getMessage());

		}		
	}

	@Test
	public void testNumbersBiggerThanThousand(){
		assertEquals(2, Calculator.add("1001,2"));
	}

	@Test
	public void testDifferentDelimiters(){
		assertEquals(3, Calculator.add("//;\n1;2"));
	}
}