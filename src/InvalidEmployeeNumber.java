// Author: Nick Korintus


public class InvalidEmployeeNumber extends IllegalArgumentException
{
	public InvalidEmployeeNumber()
	{
		super("Error: Invalid employee number entry");
	}

	public InvalidEmployeeNumber(String entry)
	{
		super("Error: Invalid employee number entry: " + entry);
	}
}