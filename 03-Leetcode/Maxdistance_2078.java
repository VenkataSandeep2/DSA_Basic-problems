package com.leetcode;

public class Maxdistance_2078
{
	public static void main(String args[])
	{
		int colors[] = {1,1,1,6,1,1,1};
		int max = 0;
		int n = colors.length;
		
		for(int i = 0; i<n-1;i++) 
		{
			for(int j =i+1; j<n;j++) 
			{
				if(colors[i] != colors[j])
				{
					int diff= j-i;
					max=Math.max(max, diff);
				}
			}
		}
		System.out.println(max);
	}
}
		/*

		OR

			*/
class Solution {
    public int maxDistance(int[] colors) {
    int max = 0;
		int n = colors.length;
		
		for(int i = 0; i<n-1;i++) 
		{
			for(int j =i+1; j<n;j++) 
			{
				if(colors[i] != colors[j])
				{
					int diff= j-i;
					max=Math.max(max, diff);
				}
			}
		}
		return(max);
	}

}

		/*

		OR

			*/
package com.leetcode;

public class Maxdistance1 {

	public static void main(String[] args) {
		int[] arr = {1,2,4,1,5,8};
		int n = arr.length;
		int ans  = 0;
		
		for(int i = 0; i<n-1; i++) {
			for(int j =1; j<n;j++)
			{
				//System.out.println(arr[j]+ ""+arr[i]);
				if(arr[i] != arr[j]) 
				{
					int diff =j-i;
					ans = Math.max(ans, diff);
				}
			}
		}
		System.out.println("The answer is : " + ans);
	}

}

