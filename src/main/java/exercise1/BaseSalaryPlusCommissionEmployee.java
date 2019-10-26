package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee{
	private int baseSalary;
	private int commission;

	protected BaseSalaryPlusCommissionEmployee(String name,int baseSalary,int commission) {
		super(name);
		this.baseSalary=baseSalary;
		this.commission=commission;
	}

	@Override
	public int computeSalary() {
		return baseSalary+(commission*getSales());
	}
}
