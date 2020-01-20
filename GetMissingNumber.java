package com.basic;

public class GetMissingNumber {
	 static int missingNumber(int[] a)
	{
		int total = 0;
		int sum = 0;
		int num = a.length;
		total = (num+1)*(num+2)/2;
		for(int i=0;i<num;i++)
			total -= a[i];
			return total;
		

	}
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,6,7};
		System.out.println(missingNumber(a));
	}

}
