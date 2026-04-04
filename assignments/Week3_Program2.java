package assignments;

public class Week3_Program2 {

	public static void main(String[] args) {
		//Write a Java program that:Takes a character input from the user (e.g., 'A').
	    //Finds and prints its ASCII value.
	    //Adds 5 to the ASCII value.
	    //Converts the new value back to a character and prints it	
			
			char cha = 'A';
			int digit = (int)cha;
			System.out.println("ASCII Value: " +digit);
			
			int digit2 = digit+5;
			System.out.println("New ASCII value:" +digit2);
			
			char digit3 = (char)digit2;
			System.out.println("New character:" +digit3);

	}

}
