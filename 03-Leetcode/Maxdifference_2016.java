class Maxdifference_2016 {

	public static void main(String[] args) 
	{
		int[] num = {7,1,5,4};
		int ans = 0;
		int length= num.length;
		
		for(int  i = 0; i<length-1 ;i++) 
		{
			for(int j =i+1 ;j<length; j++)
			{
			//System.out.println(i+""+j);
			int temp = num[j]-num[i];
			ans = Math.max(ans, temp);
			//System.out.println(i+ " "+j);		
			}
		}
		System.out.println(ans);
	}
}

          /*

          OR
          */
// input nums = [7,1,5,4]; nums= [9,4,3,2] ;  nums = [1,5,2,10]
class Solution {
    public int maximumDifference(int[] nums) 
    {
      //int nums[] = {7,1,5,4};
      int ans = -1;
		int length= nums.length;
		
		for(int  i = 0; i<length-1 ;i++) 
		{
			for(int j =i+1 ;j<length; j++)
			{
				int a = nums[i];
				int b = nums[j];
				if(a<b) 
                {
					int temp = b-a;
					ans = Math.max(ans,temp);
				}
				
			}
		}
		return(ans);
	}
}
