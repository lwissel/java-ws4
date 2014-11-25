
public class SalariedEmployee extends Employee 
                  implements Holiday{
	
	private int salary;
	private int daysOfHolidays;
	
	public SalariedEmployee(String firstName, String lastName, 
			String nI, int dayOfPayment, int salary, 
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
	public int paymentAmount() {
		return salary;
	}
	
	
	public int getDaysOfHolidays() {
		return daysOfHolidays;
	}
}
