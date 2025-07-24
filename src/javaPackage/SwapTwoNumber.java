package javaPackage;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12;
		int b = 67;
		int c=3;
		int d=4;
		int temp;
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("a " + a);
		System.out.println("b " + b);
		
		System.out.println("Without Third variable");
		
		c = c+d;   
		d = c-d;   
		c = c-d;
		System.out.println("c "+c);
		System.out.println("d "+d);
	}

}
