package com.leetcode;

public class Sellstocks_121 
{
	public static void main(String args[])
	{
		 int prices[] = {7,1,5,3,6,4};
        int n = prices.length;
        int profit  =0;
        for(int i =0 ;i<n-1 ; i++)
        {
            for(int j =i+1;j<n;j++)
            {
               // System.out.println(prices[i]+ "" + prices[j]);
                int temp = prices[j]-prices[i];
                profit = Math.max(profit,temp);
                
            }
        }
        System.out.println(profit);
    }

}
	

