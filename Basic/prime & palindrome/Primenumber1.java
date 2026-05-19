public class Primenumber1 {
	public static void main(String[] args) {
		int num = 61;
		boolean isPrime = true;
		
		if(num<1)
		{
			isPrime = false;
		}
		else 
    {
			  for(int i = 2;i<num;i++)
			{
				if(num % i == 0) 
				{
					isPrime = 	false;
					break;
				}
			}
		}
		System.out.println(isPrime);
	}
}
