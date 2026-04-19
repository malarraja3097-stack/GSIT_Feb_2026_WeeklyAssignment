package assignments;
class Person
{
	int age;
	String name;
	
	Person(int age,String name)
	{
		this.age = age;
		this.name = name;
	}

	
}
class Student extends Person
{
	int marks;
	Student(int age,String name,int marks)
	{
		super(age,name);
		this.marks = marks;
	}
	void display()
	{	//this keyword is used to access the variable n methods within the class
		System.out.println("Student Name: "+super.name);
		System.out.println("Student Age: "+super.age);
		System.out.println("Student Marks: "+this.marks);
		
	}
}

public class Week6_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student person = new Student(29,"Malar",99);
        person.display();
        
	}

}
