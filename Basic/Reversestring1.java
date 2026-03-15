class Reversestring1
{
public static void main(String args[])
	{
	String s = "RamGopal Varma";
	String s1="";
	System.out.println(s.length());
	for(int i=13  ; i>=0 ; i--)
	{
	s1 = s1 + s.charAt(i);
	}
	System.out.println(s1);
	System.out.println(s1.length());
	
	}
}
