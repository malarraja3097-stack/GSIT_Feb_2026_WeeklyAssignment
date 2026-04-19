package assignments;

public class Week5_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num[]={0,99,1,4, 2, 2,7, 2, 9, 1};
        
        int small = Integer.MAX_VALUE;
        int secSmall =Integer.MAX_VALUE;
        
        //Finding the smallest
        for(int i=0;i<num.length;i++)
        {
        	if(num[i]<small )
        	{
        		small= num[i];
        	}
        	else if(num[i]>small && num[i]<secSmall)
        	{
        		secSmall =num[i];
        	}
        }
        //when we have an array of same values {2,2,2,2} also we can modify the statement accordingly
        if(secSmall==Integer.MAX_VALUE)
        	secSmall = small;
        System.out.println("Smallest: "+small);
        System.out.println("Second Smallest: "+secSmall);
        
	}

}
