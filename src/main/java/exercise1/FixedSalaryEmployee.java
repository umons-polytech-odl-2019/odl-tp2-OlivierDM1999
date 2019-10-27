package exercise1;

import exercise2.Payable;

public class FixedSalaryEmployee extends Employee implements Payable {
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
