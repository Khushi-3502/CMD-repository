package javaPackage;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"* "+i+"= "+ (a*i));
		}
		
		System.out.println("Now we check for the odd and even number");
		
		oddEven();
		
		System.out.println("now we check for the leap and binleap year");
		
		leapYear();
	}
	
	public static void oddEven()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd numbers");
		}
	}
	
	public static void leapYear()
	{
		Scanner sc = new Scanner(System.in);
	     int c = sc.nextInt();
	     
	     if((c % 4 == 0 && c % 100 !=0) || c%400==0)
	     {
	    	 System.out.println("Leap Year");
	     }
	     else
	     {
	    	 System.out.println("Not a leap year");
	     }
	}

}
