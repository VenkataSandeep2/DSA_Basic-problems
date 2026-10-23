import java.util.*;
class BubbleSortOptmization
  {
    public static void main(String args[])
    {
      int[] rollno = {11,12,31,54,3,54,45,2,9,40};
      int n = rollno.length;

      Arrays.sort(rollno);
      System.out.println("Sorted array");
      for(int i =0; i<n ; i++)
        {
          System.out.print(rollno[i]+ " " );
        }
    }
  }
