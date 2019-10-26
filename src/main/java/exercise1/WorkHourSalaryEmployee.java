package exercise1;

public class WorkHourSalaryEmployee extends Employee
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
