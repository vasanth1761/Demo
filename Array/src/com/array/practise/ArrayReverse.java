package com.array.practise;
import java.util.*;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=a.length-1;i>=0;i--)
		{
//			int sum=a[i];
			System.out.print(a[i]);
		}
//		System.out.println("sum");

	}

}
