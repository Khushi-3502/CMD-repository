package javaPackage;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
			for(int i =2;i<a;i++)
			{
				if(a%i==0)
				{
					System.out.println("Not a Prime");
					break;
				}
				else
				{
					System.out.println("Prime");
					break;
				}
				
				
			}	
			
			
	
	}

}
