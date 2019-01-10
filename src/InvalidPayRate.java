// Author: Nick Korintus


public class InvalidPayRate extends IllegalArgumentException
{
	public InvalidPayRate()
	{
		super("Error: Invalid pay rate entry");
	}

	public InvalidPayRate(double entry)
	{
		super("Error: Invalid pay rate entry: " + entry + "\nPay rate must be non-negative number.");
	}
}