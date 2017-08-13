
public class Employee 
{
	
	double salary;
	String name;
	double bonus;
	public Employee()
	{
		System.out.println("Hello!!");
	}
	
	public Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}

	public void bonus(double salary)
	{
		bonus=salary+salary*0.5;
	System.out.println(bonus);
	}
}




