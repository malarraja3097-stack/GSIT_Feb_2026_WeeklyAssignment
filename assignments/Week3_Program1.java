package assignments;

public class Week3_Program1 {

	public static void main(String[] args) {
			//Problem Statement A student scored 87.6 marks in an exam (stored in a float). Perform the following operations:
			//Convert the float marks into: double,int
			//Print all three values.
			//Convert the final integer value into a character using ASCII and print it.
					float marks = 87.6f;
					System.out.println("Float value: " +marks);
					
					//upcasting
					double marks1 = (double) marks ;
					System.out.println("Double value: " +marks1);
					
					//Downcasting
					int marks2 = (int)marks1;
					System.out.println("Integer Value:" +marks2);

					char ch = (char)marks2;
					System.out.println("Character Value:" +ch);

	}

}
