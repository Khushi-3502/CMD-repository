package javaPackage;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		str = new StringBuilder(str).reverse().toString();
		
		System.out.println(str);

	}

}
