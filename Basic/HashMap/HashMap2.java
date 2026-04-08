import java.util.*;
class HashMap2
  {
    public static void main(String args[])
    {
      HashMap<Integer,Integer> num = new HashMap<>();
      int arr[] = {1,3,6,3,0,5,8,1,0,55,7};

      for(int i =0;i<arr.length;i++)
        {
          int n = arr[i];
          if(num.containsKey(n))
          {
            int prev = num.get(n);
            num.put(n,prev +1);
          }else
          {
            num.put(n,1);
          }
        }
      for(int nums:num.keySet() )
      {
        System.out.println(nums + "- - >" +num.get(nums));
      }
    }
  }
