package is.ru.stringcalculator;

public class Calculator {
	public static int add(String text) {
			if(text.equals(""))
				return 0;
			else if(text.contains(",")){
				String [] numbers = splitNumbers(text);
				return toInt(numbers[0]) + toInt(numbers[1]);
			}
			else
				return 1;
	}

	private static int toInt(String text){
		return Integer.parseInt(text);
	}

	private static String [] splitNumbers(String text){
		return text.split(",");
	}

}