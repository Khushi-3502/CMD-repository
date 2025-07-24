package javaPackage;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {23,12,56,43,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<(a.length)-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("This is the sorted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
