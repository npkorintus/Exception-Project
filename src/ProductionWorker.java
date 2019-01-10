// Author: Nick Korintus


public class ProductionWorker extends Employee
{
	private int shift;
	private double hourlyPayRate;


	// Default Constructor
	public ProductionWorker() throws InvalidShift, InvalidPayRate
	{
		super();
		shift = 0;
		hourlyPayRate = 0;

		if(shift != 1 || shift !=2)
			throw new InvalidShift();

		if(hourlyPayRate < 0)
			throw new InvalidPayRate();
	}


	// Overloaded constructor
	public ProductionWorker(String name, String number, String hireDate, int shift, double hourlyPayRate) throws InvalidShift, InvalidPayRate
	{
		super(name, number, hireDate);
		this.shift = shift;
		this.hourlyPayRate = hourlyPayRate;

		if(shift != 1 && shift !=2)
			throw new InvalidShift(shift);

		if(hourlyPayRate < 0)
			throw new InvalidPayRate(hourlyPayRate);
	}


	// setShift method
	public void setShift(int shift)
	{
		this.shift = shift;
	}


	// setPayRate method
	public void setPayRate(double hourlyPayRate)
	{
		this.hourlyPayRate = hourlyPayRate;
	}


	// getShift method
	public String getShift(int shift)
	{
		String shiftAsText;

		if (shift == 1)
			shiftAsText = "Day";
		else if (shift == 2)
			shiftAsText = "Night";
		else
			shiftAsText = "Invalid";

		return shiftAsText;
	}


	// getPayRate method
	public double getPayRate()
	{
		return hourlyPayRate;
	}


	// toString method
	public String toString()
	{
		String str = super.toString() + "\nShift: " + getShift(shift) +
						"\nHourly Rate : " + String.format("$%,.2f", getPayRate());

		return str;
	}
}