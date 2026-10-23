package com.InterviewQuestions;

public class _003__SecondLargest
{
	public static void main(String[] args) {
		
	
	int arr[] = {10,03,50,587,989,100,654,5,888,53,15,99,85};
	int in ;
	int largest =arr[0];
	int seclargest = -1;
	
	for(int i = 0;i<arr.length;i++)
		
	{
		if(arr[i] > largest)
		{
			largest = arr[i];
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i] > seclargest && arr[i] != largest)
		{
			seclargest = arr[i];
		}
	}
	System.out.println("the Second largest is -> "+ seclargest);

}
}
