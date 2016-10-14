package is.ru.stringcalculator;

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

	private static int sum(String [] array) throws Exception
	{	
		for(String number : array)
		{
			if(toInt(number) < 0)
			{
				throw new Exception("Negatives not allowed: ")
			}
		}
		int totalSum = 0;
		for(String number : array)
		{
			
			totalSum += toInt(number);
		}
		return totalSum;
	}

}