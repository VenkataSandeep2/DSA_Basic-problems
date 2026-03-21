
public class Palandrome2 {
	public static void main(String[] args) {
		String s = "BaaB";
		String ans ="";
		{
			for(int i = s.length()-1;i>=0;i--)

			{
				ans = ans + s.charAt(i);
			}
			System.out.println(ans);
		}
		if(s.equals(ans))
		{
			System.out.println("it's a palandrome");
		}
		else
		{
			System.out.println("It's not a palandrome");
		}
	}
}
