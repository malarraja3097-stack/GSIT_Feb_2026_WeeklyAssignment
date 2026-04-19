package assignments;

public class Week5_Program3 {

	static void moveZero(int arr[])
	{
		int pos =0;
		for(int i=00;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp =arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
				pos++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,2,0,3};
		moveZero(arr);
		for(int num:arr)
			System.out.print(num+"");
	}

}
