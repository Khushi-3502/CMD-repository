package javaPackage;

public class LargestEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,2,45,32,12,43,67,12};
		
		int max = a[0];
		int min = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		System.out.println("Max element of array is: "+ max);

		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min = a[j];
			}
		}
		
		System.out.println("Min element of array is: "+min);
	}

}
