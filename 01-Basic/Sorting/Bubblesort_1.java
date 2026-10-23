package com.SortingAlogo;

public class Bubblesort_1
{
	public static void main(String args[])
	{
		int arr[] = {1,5,3,7,9};
		int n = arr.length;
		
		for(int i = 0;i<n-1;i++)
		{
			for(int j = 0; j<n-i-1;i++)
			{
				if(arr[j] > arr[i])
				{
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i<n;i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
}
