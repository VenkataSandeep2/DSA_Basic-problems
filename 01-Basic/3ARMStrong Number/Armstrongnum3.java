import java.util.*;
class Armstrongnum3
  {
    public static void main(String args[])
    {
      System.out.println("Enter a number :- ");
      Scanner sc =new Scanner(System.in);
      int num = sc.nextInt();
        int orgnum = num;
      int cubenum = 0;

      while(num > 0)
        {
          int remainder = num % 10;
          cubenum = cubenum + (remainder *remainder *remainder);
          num = num/10;
        }
      if(orgnum ==cubenum)
      {
        System.out.println("it's ARM Strong Number");
      }
      else
      {
        System.out.println("it's NOTTT ARM Strong Number");
      }
    }
  }
