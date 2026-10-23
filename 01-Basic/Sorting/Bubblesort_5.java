package com.SortingAlogo;

public class Bubblesort_5 
{
	public static void main(String args[])
	{
		int [] s = {11,13,154,18,2,89};
		int n =s.length;
		
		for(int i = 0;i<n-1;i++)
		{
			for(int j = 0 ;j<n-i-1;j++)
			{
				if(s[j+1] < s[j])
				{
					int temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i = 0;i<n ;i++)
		{
			System.out.print(" " +s[i]);
		}
	}

}
