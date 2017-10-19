package exercise1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseSalaryPlusCommissionEmployeeTest {

	@Test
	public void computeSalary_with_base_salary_commission_and_sales() {
		Employee employee = Exercise1.buildBaseSalaryPlusCommissionEmployee(2200, 100);
		for (int i = 0; i < 13; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(3500);
	}

	@Test
	public void computeSalary_with_no_salary_and_no_sale() {
		Employee employee = Exercise1.buildBaseSalaryPlusCommissionEmployee(0, 500);
		assertThat(employee.computeSalary()).isEqualTo(0);
	}

	@Test
	public void computeSalary_with_no_salary() {
		Employee employee = Exercise1.buildBaseSalaryPlusCommissionEmployee(0, 500);
		for (int i = 0; i < 14; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(3500);
	}

	@Test
	public void computeSalary_with_no_sale() {
		Employee employee = Exercise1.buildBaseSalaryPlusCommissionEmployee(2500, 100);
		assertThat(employee.computeSalary()).isEqualTo(2500);
	}

	@Test
	public void computeSalary_with_no_commission() {
		Employee employee = Exercise1.buildBaseSalaryPlusCommissionEmployee(4000, 0);
		for (int i = 0; i < 14; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(4000);
	}

	@Test
	public void computeSalary_with_work_hours() {
		Employee employee = Exercise1.buildBaseSalaryPlusCommissionEmployee(2500, 100);
		for (int i = 0; i < 10; i++) {
			employee.sell();
		}
		for (int i = 0; i < 160; i++) {
			employee.workOneHour();
		}
		assertThat(employee.computeSalary()).isEqualTo(3500);
	}
}