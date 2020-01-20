package com.basic;

public class FactorialNumber {
	public static int getFactorial(int num)
	{
		int j=1;
		for(int i=1;i<num;i++)
		{
			j += j*i;
		}
		return j;
		
	}
	public static void main(String[] args)
	{
		int result = getFactorial(4);
		System.out.println(result);
		System.out.println(getFactorial(5));
		
	}

}
