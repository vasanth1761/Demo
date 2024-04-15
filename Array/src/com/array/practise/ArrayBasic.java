package com.array.practise;
import java.util.*;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
		int a[] =new int[n];
		for( int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		
		}
		for (int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
