package is.ru.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public static int add(String text) 
	{
		if(text.equals(""))
			return 0;
		else if(text.startsWith("//"))
		{
			return sum(splitNumbersTakeTwo(text));
		}
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

	private static string [] splitNumbersTakeTwo(String text)
	{
			String delimiter, textWithoutDelimiter;
			int indexOfDelimeter = text.indexOf("//") + 2;
			delimiter = text.substring(indexOfDelimeter, indexOfDelimeter + 1);
			textWithoutDelimiter = text.substring(text.indexOf("n") + 1);
			return text.split(delimiter);
	}
	private static String [] splitNumbers(String text)
	{		
			return text.split("(,|\n)");
	}

	private static int sum(String [] array)
	{	
		int totalSum = 0;
		List negativeNumbers = new ArrayList();

		for(String number : array)
		{
			int intNumber = toInt(number);
			if(intNumber < 0)
			{
				negativeNumbers.add(intNumber);			
			}			
			else if(intNumber <= 1000)
			{
				totalSum += intNumber;
			}
		}
		if(negativeNumbers.size() > 0)
		{
			throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString().replace("[", "").replace("]", "").replace(" ", ""));
		}
		return totalSum;
	}

}