package javaPackage;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String strnew = new StringBuilder(str).reverse().toString();
		
		if(str.equals(strnew))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not palindrom");
		}
	}

}
