package exercise1;

public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {

//Ok
		return new FixedSalaryEmployee(name,fixedSalary);
	}


	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {

		return new BaseSalaryPlusCommissionEmployee(name,baseSalary,commission);
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourRate) {

		return new WorkHourSalaryEmployee(name,hourRate);
	}
}
