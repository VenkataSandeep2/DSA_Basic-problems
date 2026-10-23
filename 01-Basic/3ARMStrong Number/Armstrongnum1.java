class Armstrongnum1
  {
    public static void main(String args[])
    {
      int num = 114;
      int orgnum = num;
      int cubenum = 0;

      while(num>0)
        {
          int remainder = num % 10;
          cubenum = cubenum +(remainder *remainder *remainder);
          num = num/10;
        }
      if(orgnum == cubenum)
      {
        System.out.println(orgnum +" It is armstrong number");
      }
      else
      {
          System.out.println(orgnum +" It is NOT armstrong number");
      }
    }
  }
