package javaPackage;

public class ReplaceEachWithProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};
		
		int arrfinal[] = new int[arr.length];
		int prod = 1;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					prod = prod * arr[j];
				}
			} 
		}
		
		arrfinal[arr.length] = prod;
		System.out.println("here is the final array");
		
		for(int i=0;i<arrfinal.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
