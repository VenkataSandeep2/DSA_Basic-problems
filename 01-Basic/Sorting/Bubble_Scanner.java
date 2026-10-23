package com.SortingAlogo;

import java.util.*;
public class Bubble_Scanner 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] s =  new int[n];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i <n;i++)
		{
			s[i] =sc.nextInt();
		}
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
			System.out.print(" " +s[i]+ " ");
		}
		sc.close();
	}

}
