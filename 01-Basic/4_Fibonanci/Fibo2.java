
public class Fibo2 
{

	public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
		int first = 0;
		int second  = 1;
		int num = 15;
		
		System.out.println(first+" "+second);
		
			for (int  i = 2; i < num ;i++)
			{
				int sum =first + second;
				System.out.println(sum);
				first = second;
				second = sum;
			}
	}
}
