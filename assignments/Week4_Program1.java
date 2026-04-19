package assignments;

public class Week4_Program1 {

	public static void main(String[] args) {
		int num = 57243;
		String newNum = "";
		int pos =0;
		while( num>0) 
		{
			pos++;
			int lastdigit = num%10;
			if(pos%2!=0 && lastdigit<=4 ) 
			{
				newNum = newNum+""+lastdigit*2;
			}
			else if(pos%2!=0 && lastdigit>4)
			{
				newNum = newNum+""+lastdigit;
			}
			else if(pos%2==0)
			{
				newNum = newNum+""+1;
			}
			num=num/10;
		}	
		System.out.println("Applying logic: "+newNum);
		//it is in String format
		StringBuilder sb=new StringBuilder(newNum);
		System.out.println("In string format: "+sb.reverse());
		//converted to String format add "" to any datatype will convert it into String
		//cause Integer.parseInt does not take string builder value
		int output = Integer.parseInt(sb+"");
		System.out.println("Final expected o/p: "+output);
	}
}
