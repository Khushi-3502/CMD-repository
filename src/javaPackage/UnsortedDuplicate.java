package javaPackage;

import java.util.Arrays;

public class UnsortedDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,1,3,78,34,12,32,3,1,34,56};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		System.out.println(" ");
		System.out.println("After removing duplicates in the array");
		
		int temp[] = new int[a.length];
		int j = 0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j] = a[i];
				j++;
			}
		}
		
		temp[j] = a[a.length-1];
		
		for(int i = 0;i<j;i++)
		{
			System.out.print(temp[i]+ " ");
		}
		
	}

}
