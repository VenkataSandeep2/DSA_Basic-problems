class Reversestring1
{
public static void main(String args[])
	{
	String s = "Ram Gopal Varma";
	String s1="";
	System.out.println("The length of the string is :- "+s.length());
	{
	for(int i=13  ; i>=0 ; i--)
	s1 = s1 + s.charAt(i);
	}
	System.out.println("OUTPUT");
	System.out.println(s1);
	
	}
}
