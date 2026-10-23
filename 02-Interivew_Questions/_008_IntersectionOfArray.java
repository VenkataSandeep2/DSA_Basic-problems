package com.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class _008_IntersectionOfArray
{
	public static void main(String[] args) {
		int arr[] = {10,20,35,45,8,98,115};
		int arr2[] = {5,10,15,2,5,8,98,20,35,81,661,52};
		Set<Integer> set =new HashSet<>();
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr[i] == arr2[j])
				{
					set.add(arr[i]);
				}
			}
		}
		System.out.println("Intersection Array");
		  for (int value : set) 
		  {
	            System.out.print(value+" "); 
		}
	}

}
