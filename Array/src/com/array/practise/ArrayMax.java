package com.array.practise;
import java.util.*;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		 int max=a[0];
		for(int i=1;i<n;i++)
			
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.print("The maximum value is:" +max);
		
		

	}

}
