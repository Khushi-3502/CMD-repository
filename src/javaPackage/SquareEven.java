package javaPackage;

public class SquareEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,4,3,6,8};
		
		//int answer[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				arr[i] = arr[i] * arr[i];
 			}
			else
			{
				arr[i] = arr[i];
			}
		}
		
		System.out.println("The final array is");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
