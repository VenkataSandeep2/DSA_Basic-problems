
import java.util.HashMap;

public class HashMap1 
{
	public static void main(String args[])
	{
		HashMap<Integer,Integer> s =new HashMap<>();
		s.put(3,9);
		s.put(8, 11);
		
		int prev = s.get(3);
		
		s.put(3,prev+1);
		
		System.out.println(s.get(3));
	}

}
