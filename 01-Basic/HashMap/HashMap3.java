import java.util.*;

public class HashMap3 {

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> boo =new HashMap<>();
		
		int arr[] = {1,5,3,8,9,1,5,6,7,9,9,9,3};
		
		for(int i = 0 ;i<arr.length;i++)
		{
			int n =arr[i];
			
			if(boo.containsKey(n))
			{
				int prev = boo.get(n);
				boo.put(n,prev-1);
			}else {
				boo.put(n,1);
					}
		}
		
		for(int boom :boo.keySet())
		{
			System.out.println(boom+ "-->" +boo.get(boom));
		}
	}

}
