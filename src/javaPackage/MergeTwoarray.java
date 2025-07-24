package javaPackage;

public class MergeTwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {1,2,3};
		int arr2[]= {45,22,33,35};
		int arr1len = arr1.length;
		int arr2len = arr2.length;
		
		int arr3[] = new int[arr1len+arr2len];
		
		for(int i =0;i<arr1len;i++)
		{
			arr3[i] =arr1[i];
		}
		
		for(int i=0;i<arr2len;i++)
		{
			arr3[i+arr1len] = arr2[i];
		}
		
		for(int i =0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
		
	}

}
