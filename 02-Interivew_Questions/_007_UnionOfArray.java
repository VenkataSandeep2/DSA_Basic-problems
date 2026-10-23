package com.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class _007_UnionOfArray 
{
	public static void main(String[] args) {
		int arr[] = {10,20,3,0,5,0,8,55,4,8};
		int arr2[] = {0005,99,98,965,10,20,3,0,5,0,8,55,4,8};
		
		int i ;
		
		Set<Integer> set = new HashSet<>();
		
		 for(i = 0; i < arr.length; i++) 
		 {
	            set.add(arr[i]);
	       }

		for(i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		
		System.out.println("Union");
		
		for(int value :set)
		{
			System.out.print(value+" ");
		}
	}

}
