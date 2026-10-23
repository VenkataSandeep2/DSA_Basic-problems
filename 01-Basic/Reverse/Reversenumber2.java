public class Reversenumber2 {

	public static void main(String[] args) {
		int  num = -5421;
		int ans = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10)
			{
				System.out.println(0);
				return;
			}
			ans = ans * 10 +digit;
			num = num/10;		
		}
		System.out.print(ans);
	}
}
