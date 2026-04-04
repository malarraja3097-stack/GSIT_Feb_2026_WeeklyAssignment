package assignments;

public class Week4_Program2 {

	public static void main(String[] args) {
		int count =100;
		int num1=0,num2=1,i=1;
		System.out.print(num1+" "+num2+" ");
		count = count-2;
		
		while(i<=count)
		{
			int num3=num1+num2;
			if(num3>100)
				break;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			i++;
		}

	}

}
