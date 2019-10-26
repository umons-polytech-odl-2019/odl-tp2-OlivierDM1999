package exercise1;

public class FixedSalaryEmployee extends Employee {
	private int Salary;

	public FixedSalaryEmployee(String name, int fixedSalary)
	{
		super(name);
		this.Salary=fixedSalary;
	}


	@Override
	public int computeSalary() {
		return this.Salary ;
	}

}
