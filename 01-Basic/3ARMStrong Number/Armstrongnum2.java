public class Armstrongnum2
{
  public static void main(String args[])
  {
  int num =  113;
  int orgnum = num;
  int cubenum = 0;

  while(num > 0)
  {
    int remainder = num % 10;
    cubenum = cubenum + (remainder * remainder *remainder);
    num = num/10;
  }
if(orgnum == cubenum)
{
  System.out.println(orgnum + " number is a ArmStrong number");
}
else{
  System.out.println(orgnum + " number is a NOT armstrong number");
    }
  }
}
