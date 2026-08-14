package com.InterviewQuestions;

public class _003_SecondLargest
{
	public static void main(String[] args) {
		int arr[] = {10,03,50,587,989,100,654,5,888,53,15,99,85};
		int largest = Integer.MIN_VALUE;
		int SecLargest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				SecLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > SecLargest && arr[i] != largest)
			{
				SecLargest = arr[i];
				
			}
		}
		System.out.println("Largest number -->" +largest);
		System.out.println("Second Largest -->  "+SecLargest);
	}

}
