class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();

        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[j]==arr2[i])
                {
                    ar1.add(arr1[j]);
                }
            }
            
        }
        for(int i:arr1)
        {
            if(!ar1.contains(i))
            {
                ar2.add(i);
            }
        }
            Collections.sort(ar2);
            ar1.addAll(ar2);
        
        
        int [] ab=new int[ar1.size()];

        for(int i=0;i<ab.length;i++)
        {
            ab[i]=ar1.get(i);
        }
        return ab;
    }
}






package com.relative.sort;

import java.util.*;

public class RelativeSortArray {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        // Step 1: Store frequency of every element in arr1
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Index for inserting elements into arr1
        int index = 0;

        // Step 3: Follow the order given by arr2
        for (int num : arr2) {

            int count = map.get(num);

            // Put the element according to its frequency
            while (count > 0) {
                arr1[index] = num;
                index++;
                count--;
            }

            // Remove because we have already processed it
            map.remove(num);
        }

        // Step 4: Store remaining elements
        List<Integer> remaining = new ArrayList<>();

        for (int num : map.keySet()) {

            int count = map.get(num);

            while (count > 0) {
                remaining.add(num);
                count--;
            }
        }

        // Step 5: Sort remaining elements
        Collections.sort(remaining);

        // Step 6: Put remaining elements into arr1
        for (int num : remaining) {
            arr1[index] = num;
            index++;
        }

        return arr1;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};

        int[] arr2 = {2, 1, 4, 3, 9, 6};

        int[] result = relativeSortArray(arr1, arr2);

        System.out.println("Relative Sorted Array:");

        System.out.println(Arrays.toString(result));
    }
}







class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        Map<Integer, Integer> map = new HashMap<>();
         for (int num : arr1) 
         {
            map.put(num, map.getOrDefault(num,0)+1);

         }
         int index =0;


         for (int num : arr2)
         {
            int count = map.get(num);
            while(count > 0)
            {
                arr1[index++] = num;
                count--;
            }
            map.remove(num);
        }

        List<Integer> remaining= new ArrayList();
        for (int num : map.keySet()) 
        {
            int count = map.get(num);

            while (count > 0) 
            {
                remaining.add(num);
                count--;
            }
        }
        Collections.sort(remaining);
        for (int num : remaining) 
        {
            arr1[index++] = num;
        }

        return arr1;
    }
}
