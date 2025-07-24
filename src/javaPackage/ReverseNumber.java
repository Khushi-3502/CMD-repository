package javaPackage;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String str = String.valueOf(a);
		String Strnew = new StringBuilder(str).reverse().toString();
		
		int b = Integer.parseInt(Strnew);
		System.out.println("Reverse number is: "+b);

	}

}
