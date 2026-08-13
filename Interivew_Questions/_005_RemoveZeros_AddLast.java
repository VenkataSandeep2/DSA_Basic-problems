package com.InterviewQuestions;

public class _005_RemoveZeros_AddLast
{
	public static void main(String[] args) {
		int arr[] = {0,5,03,1,8,6,6,9,15,3,0,15,5,6,0};
		int in;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				System.out.print(arr[i]+ " " );
			}
		}
		
		System.out.println();
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] ==0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
