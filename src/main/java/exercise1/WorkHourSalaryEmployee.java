package exercise1;

import exercise2.Payable;

public class WorkHourSalaryEmployee extends Employee implements Payable
{

	private int hourRate;

	protected WorkHourSalaryEmployee(String name,int hourRate) {
		super(name);
		this.hourRate=hourRate;

	}


	public int computeSalary(){
		return hourRate*getWorkedHours();
	}

}
