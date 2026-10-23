//                     DESCENDING ORDER
class Bubblesort_4
  {
    public static void main(String args[])
    {
      int[] ages = {15,22,35,42,26,59,21,18};
      int n= ages.length;
      for(int i = 0 ; i<n; i++)
        {
          for(int j=0;j<n-i-1; j++)
          {
            if(ages[j]<ages[j+1])
            {
              int temp = ages[j];
              ages[j] =ages[j+1];
              ages[j+1] = temp;
          
            }
        }
    }
      for(int i = 0;i<n;i++)
        {
          System.out.print(ages[i]+ " ");
        }
    }
  }
