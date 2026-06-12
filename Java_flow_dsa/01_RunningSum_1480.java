//Actually Doesn't use the number for class name but know the flow thats why use the numbers

public class RunningSum_1480 
{
	public static void main(String[] args) 
	{
		int[] nums = {1, 2, 3, 4};

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
       // System.out.print(sum);
	for(int i = 0 ;i<nums.length;i++)
	{
		System.out.print(nums[i]);
		
		if(i < nums.length-1)
		
		
		{
			System.out.print(",");
		}
	}
	System.out.println();
	
	}

}

//OUTPUT
/*
Total sum is :-> 10
1,3,6,10
*/

/*

[1,2,3,4]
  target is 1,3,6,10


  now we will see the loop 
  add the index value add the next nummber
  1,1+2,3,4
  1,3,1+2+3,4
  1,3,6,1+2+3+4
  1,3,6,10


  */
