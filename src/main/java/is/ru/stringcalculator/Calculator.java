package is.ru.stringcalculator;

import java.util.ArrayList;

public class Calculator {
	
	public static int add(String text) 
	{
		if(text.equals(""))
			return 0;
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else
			return toInt(text);
	}

	private static int toInt(String text)
	{
		return Integer.parseInt(text);
	}

	private static String [] splitNumbers(String text)
	{
		return text.split("(,|\n)");
	}

	private static int sum(String [] array)
	{	
		ArrayList<Integer> negativeNumbers = new ArrayList<Integer>(array.length);

		for(String number : array)
		{
			if(toInt(number) < 0)
			{
				negativeNumbers.add(toInt(number));			
			}
		}
		if(negativeNumbers.size() > 0)
		{
			throw new IllegalArgumentException("Negatives not allowed: " + string.Join(",", negativeNumbers));
		}
		int totalSum = 0;
		for(String number : array)
		{
			
			totalSum += toInt(number);
		}
		return totalSum;
	}

}