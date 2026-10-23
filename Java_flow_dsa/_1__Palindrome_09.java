package leetcode_prblms;
public class _1__Palindrome_09 
{
	public static void main(String[] args) 
	{
		int num = 122221;
		int org = num;
		int rev =0;
		while(num > 0)
		{
			int digit = num % 10;
			rev = rev *10+ digit;
			num = num /10;
		}
		System.out.println(org == rev);
		
	}

}

// LEETCODE MODE
class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        return false;

        int origina = x;
        int reverse = 0;

        while(x > 0)
        {
            int digit = x % 10;
            reverse = reverse *10 + digit;
            x = x/10; 
        }
        return origina == reverse;
        
    }
}
