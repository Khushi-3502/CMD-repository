package javaPackage;

import java.util.Scanner;

public class CalculatorSwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for mulitplication");
		System.out.println("Press 4 for divison");
		System.out.println("Press 5 for Modulus");
		Scanner sc = new Scanner(System.in);
			
		int a = sc.nextInt();
		
		int b=8,c=16;
		
		switch(a)
		{
		case 1:
			int d = b+c;
			System.out.println("addition is: " +d);
			break;
		case 2:
			int e = b-c;
			System.out.println("Subtraction is: " +e);
			break;
		case 3:
			int f = b+c;
			System.out.println("Multiplication is: " +f);
			break;
		case 4:
			int g = b+c;
			System.out.println("division is: " +g);
			break;
		case 5:
			int h = b+c;
			System.out.println("addition is: " +h);
			break;
		default:
		{
			System.out.println("you press invalid number");
		}
			
		}
		
		
	}

}
