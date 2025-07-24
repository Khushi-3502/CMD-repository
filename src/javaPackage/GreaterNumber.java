package javaPackage;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //35
		int b = sc.nextInt(); //21
		int c = sc.nextInt();//4
		
		if(a>b&& a >c)
		{
			System.out.println(a + "is greater than b and c");
		}
		else if(b>c && b >a)
		{
			
			System.out.println(b + "is greater");
		}
		else
		{
			System.out.println(c);
		}

	}

}
