package com.InterviewQuestions;

public class _002_LargestNumer
{
	 public static void main(String args[])
	    {
	      int arr[] = {10,0,80,96,56,4465,46,465,465,9999,45,465,4,46,4,65};
	      int in;
	      int max = arr[0];

	      for(int i=0;i<arr.length-1;i++)
	        {
	          if(arr[i] > max)
	        	  max=arr[i];
	            
	        }
	      System.out.println(max);
	    }
}
