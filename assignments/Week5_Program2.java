package assignments;

public class Week5_Program2 {
	
	static boolean isSorted(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i+1]>arr[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,5,4};
		System.out.println("The Array is sorted:"+isSorted(num));

	}

}
