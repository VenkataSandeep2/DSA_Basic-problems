package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates 
{
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(10,20,30,50,40,20,50,40,33,10));
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		System.out.println("Before nums" +nums);
		
		for(Integer num: nums)
		{
			if(!result.contains(num))
			{
				result.add(num);
			}
		}
		System.out.println("After nums "+result);
	
	}

}
