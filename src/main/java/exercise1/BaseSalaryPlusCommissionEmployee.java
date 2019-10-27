package exercise1;

import exercise2.Payable;

public class BaseSalaryPlusCommissionEmployee extends Employee implements Payable {
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
