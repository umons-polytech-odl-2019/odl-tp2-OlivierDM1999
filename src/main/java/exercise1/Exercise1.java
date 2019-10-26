package exercise1;

public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {

		//création classe FixedSalaryEmployee
		//retour newNOMCLASSE avec paramètres
		return new FixedSalaryEmployee(name,fixedSalary);
	}


	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		//création classe BaseSalaryPlusCommissionEmployee
		//retour newNOMCLASSE avec paramètres
		return new BaseSalaryPlusCommissionEmployee(name,baseSalary,commission);
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourRate) {
		//création classe WorkHourSalaryEmployee

		//retour newNOMCLASSE avec paramètres
		return new WorkHourSalaryEmployee(name,hourRate);
	}
}
