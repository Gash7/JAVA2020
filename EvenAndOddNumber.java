package com.basic;

public class EvenAndOddNumber {
	static void checkType(int num)
	{
		if(num%2 == 0)
		{
			System.out.println("Even Number is= "+num);
		}
		else if(num%2 == 1)
		{
			System.out.println("Odd Number is= "+num);
		}
		else
		{
			System.out.println("Neither Even nor Odd");
		}
	}
	public static void main(String[] args)
	{
		checkType(0);
	}

}
