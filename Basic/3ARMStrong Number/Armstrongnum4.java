import java.util.*;
class Armstrongnum4
  {
    public static void main(String args[])
    {
      System.out.println("Enter a number");
      Scanner sc=  new Scanner(System.in);
      int number = sc.nextInt();
      int orgnum = number;
      int cubenum = 0 ;

      while(number  > 0)
        {
          int remainder  = number % 10 ;
          cubenum = cubenum +(remainder * remainder * remainder);
          number  = number/10;
        }
      if(orgnum == cubenum)
      {
        System.out.println(orgnum + " It is a Armstrong number");
      }
      else{
        System.out.println(orgnum + " It is a NOT armstrong number");
      }
    }
  }
