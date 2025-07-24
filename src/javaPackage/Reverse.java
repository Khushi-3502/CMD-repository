package javaPackage;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1234;
		
		int reverse = 0;
		while(a!=0)
		{
		int rem = a%10;   //rem= 4,3,2,1
		
		reverse = (reverse*10) + rem; //reverse=4321
		
		a = a/10; //a=0
		
		}

		System.out.println(reverse);  //4321
	}

}
