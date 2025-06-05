package assignments;

public class ValidNumber {
	
	public static boolean isNumber(String str)
	{
//		try {
//			Integer.parseInt(str);
//			return true;
//		}
//		
//		catch(NumberFormatException e)
//		{
//			return false;
//		}
		
		try {
			Float.parseFloat(str);
			return true;
		}
		
		catch(NumberFormatException e)
		{
			return false;
		}
		
		
		
		
	}
	
	public static void main(String[] args)
	{
//		String input="12345";
		String input1="12345.88";
//		boolean isValid=isNumber(input);
		boolean isValid=isNumber(input1);
		if(isValid)
		{
			System.out.println("number is valid");
		}
		else
		{
			System.out.println("not a valid number");
		}
	}

}

