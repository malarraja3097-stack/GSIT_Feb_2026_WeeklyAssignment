package assignments;
class Employee
{
	int id;
	String name;
	double basicSalary;
	double totalSalary;
	
	Employee(int id, String name, double basicSalary)
	{
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		
	}
	void calculateSalary()
	{
		double hra = 0.20 * basicSalary;
        double bonus = 0.10 * basicSalary;
        totalSalary = basicSalary + hra + bonus;
	}
	void display()
	{
		System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + totalSalary);
    }
}
public class Week6_Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(123,"Malar",25000);
		employee.calculateSalary();
		employee.display();
	}

}
