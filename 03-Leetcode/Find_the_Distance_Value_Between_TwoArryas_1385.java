package com.leet;

public class Find_the_Distance_Value_Between_TwoArryas_1385 {

	public static void main(String[] args) {
		int[] arr1= {4,5,8,};
		int[] arr2 = {10,9,1,8};
		int d = 2;
		int count=0;
		boolean isValid = true;

		nested_for_loop(arr1, arr2, d, count, isValid);

		forEach_loop(arr1, arr2, d, count, isValid);
	}

	public static void forEach_loop(int[] arr1, int[] arr2, int d, int count, boolean isValid) {
		for(int ar : arr1)
		{
			for(int arr :arr2)
			{
				if(Math.abs(ar -arr) <= d)
				{
					isValid = false;
					break;
				}
			}
			if(isValid)
			{
				count++;
			}
			System.out.println(count);
		}
	}

	public static void nested_for_loop(int[] arr1, int[] arr2, int d, int count, boolean isValid) {
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=1;j<arr2.length;j++)
			{
				if(Math.abs(arr1[i] - arr2[j]) <=d)
					{
					isValid = false;
						break;
					}
			}
		if(isValid)
		{
			count++;
		}
		System.out.println(count);
		}
	}

}
