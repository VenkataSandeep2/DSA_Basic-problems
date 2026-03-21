
public class Paladrome1 {

	public static void main(String[] args) {
		String s = "aba";
		String ans = "";
		{
			for (int i = s.length()-1 ; i>= 0;i--)
				{
					ans = ans + s.charAt(i);
				}
		}
		if(ans.equals(s)) 
    {
		System.out.println("paladrome true");
		}
else 
    {
			System.out.println("Not a palandrome");
    }
	}
}
