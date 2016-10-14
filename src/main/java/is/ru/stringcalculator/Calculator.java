package is.ru.stringcalculator;

public class Calculator {
	public static int add(String text) 
	{
		if(text.equals(""))
			return 0;
		else if(text.contains(",|\n")){
			String[] numbers = splitNumbers(text);
			return sum(numbers);
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
		return text.split(",|\n");
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