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
		ArrayList<String> negativeNumbers = new ArrayList<String>(array.length);

		for(String number : array)
		{
			if(toInt(number) < 0)
			{
				negativeNumbers.add(number);
				negativeNumbers.add(",");				
			}
		}
		if(negativeNumbers.size() > 0)
		{
			throw new RuntimeException("Negatives not allowed: ", negativeNumbers);
		}
		int totalSum = 0;
		for(String number : array)
		{
			
			totalSum += toInt(number);
		}
		return totalSum;
	}

}