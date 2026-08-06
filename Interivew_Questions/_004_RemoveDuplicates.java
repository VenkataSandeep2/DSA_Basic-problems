package com.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class _004_RemoveDuplicates
{
	public static void main(String[] args) {
		int[] arr = {10,20,30,50,30,80,10,5,6,15,10,10,};
		
		System.out.println("Original Array");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		Set<Integer> set = new HashSet<Integer>();				//Set used the duplicate s are not allowed
		
		for(int i = 0;i<arr.length;i++)
		{
			int num = arr[i];
			set.add(num);			
		}
		System.out.println();
		System.out.println("Array After removing Duplicate Data");
		System.out.println("Size of the array -> "+set.size());
		System.out.println(set);
	}

}
