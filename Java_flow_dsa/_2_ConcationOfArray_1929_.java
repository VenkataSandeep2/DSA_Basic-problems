package leercode_practise;

public class _2_ConcationOfArray_1929 
{
	public static void main(String[] args) {
		
	
	int [] arr = {1,2,3};
	
	int ans[] = new int[6];
	
	ans[0] = arr[0];
	ans[1] = arr[1];
	ans[2] = arr[2];
	ans[3] = arr[0];
	ans[4] = arr[1];
	ans[5] = arr[2];
	
	for(int i =0;i<arr.length;i++)
	{
	//	System.out.println(arr[i]);
		System.out.print("array of the original Array"+ans[i]+" ");
	}
	System.out.println();
	System.out.println();
	
	for(int i =0;i<ans.length;i++)
	{
	//	System.out.println(arr[i]);
		System.out.print(ans[i]+" ");
	}
	
	}
	
}



//2nd MODE





package leercode_practise;

public class _2_ConcationOfArray_1929_
{
	public static void main(String[] args) 
	{
		int[] nums = {1,2,4,3};
		int n = nums.length;
		int[] ans = new int[2*n];
		
		for(int i=0;i<n;i++)
		{
			ans[i]=nums[i];
			ans[i+n] =nums[i];
			
			System.out.println(i+" "+n);
			System.out.println("---------------"+nums[i]);
		}
		
		for(int i =0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
		
	}




  

}
