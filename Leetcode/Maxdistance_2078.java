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
