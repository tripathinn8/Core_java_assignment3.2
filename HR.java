
public class HR extends Employee
{

	public HR()
	{
		super();
	System.out.println("HR");
	}
	public void bonus(double salary)
	{
		bonus=salary*0.05;
		System.out.println(bonus);
		super.bonus(10000);
	}
	public String toString()
	{
		return name + " " + salary;
	}
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		HR obj= new HR();
		//System.out.println(obj);
		obj.bonus(1500);
		
		
	}

}
