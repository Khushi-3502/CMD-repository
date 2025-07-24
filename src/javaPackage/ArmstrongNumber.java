package javaPackage;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = num;
		double f = 0;
		int countdigit = String.valueOf(num).length();
		
		while(num!=0)
		{
			int rem = num%10;
		    f = f +  Math.pow(rem, countdigit);
			
			num = num/10;
		}
		
        if(f==result)
        {
        	System.out.println(result+ " is armstrong number");
        }
        else
        {
        	System.out.println("not armstrong");
        }
	}

}
