package exercise1;

public abstract class Employee {
	private final String name;
	private int workedHours=0;
	private int sales=0;

	protected Employee(String name)
	{
		this.name=name;
	}


	public abstract int computeSalary();  //pour pouvoir faire le polymorphisme entre cette classe là et les 3 autres



	public void sell() {
		sales++;
	}

	public void workOneHour() {
		workedHours++;

	}

	public String getName() {
		return name;
	}


	public int getWorkedHours() {
		return workedHours;
	}

	public int getSales() {
		return sales;
	}
}
