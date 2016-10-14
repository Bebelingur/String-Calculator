package is.ru.stringcalculator;

public class Calculator {
	public static int add(String text) 
	{
		if(text.equals(""))
			return 0;
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String text)
	{
		return Integer.parseInt(text);
	}

	private static String [] splitNumbers(String text)
	{
		return text.split(",");
	}

	private static int sum(String [] array)
	{	
		int totalSum = 0;
		for(String number : array)
		{
			totalSum += toInt(number);
		}
		return totalSum;
	}

}