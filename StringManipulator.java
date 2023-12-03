package project1;


public class StringManipulator {

	
	public String toUppercase(String input)
	{
        return input.toUpperCase();
    }

    public boolean isPalindrome(String input)
    {
        StringBuilder reversed = new StringBuilder(input).reverse();
        return input.equalsIgnoreCase(reversed.toString());
    }

    public String reverseString(String input)
    {
        return new StringBuilder(input).reverse().toString();
    }
    
}
