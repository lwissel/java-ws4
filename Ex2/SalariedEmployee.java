
public class SalariedEmployee extends Employee 
                  implements Holiday{
	
	private double salary;
	private int daysOfHolidays;
	
	public SalariedEmployee(String firstName, String lastName, 
			String nI, int dayOfPayment, double salary, 
			int daysOfHolidays) {
		super(firstName, lastName, nI, dayOfPayment);
		this.salary = salary;
		this.daysOfHolidays = daysOfHolidays;
	}
	
	public void takeHolidays(int days) {
		if (daysOfHolidays >= days) {
			daysOfHolidays = daysOfHolidays - days;
		} else {
                    // throw new IllegalArgumentException();
                    System.out.println("Holidays denied");
		}
	}
	
	@Override
	public double paymentAmount() {
		return salary;
	}
	
	
	public int getDaysOfHolidays() {
		return daysOfHolidays;
	}

  @Override
  public void increaseSalary(double rate) {
    this.salary = this.salary*(1.0+rate);
  }
}
