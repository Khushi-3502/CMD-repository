package javaPackage;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String strnew = str.toUpperCase();
		int vow=0,cos=0;
		for(int i =0;i<strnew.length();i++)
		{
			char c = strnew.charAt(i);
			
			if(c!=' ')
			{
				if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				{
					vow++;
				}
				
				else
				{
					cos++;
				}
			}
		}
		
		System.out.println("Total number of vow are: "+vow);
		System.out.println("Total number of cos are: "+cos);

	}

}
