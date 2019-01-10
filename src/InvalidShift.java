// Nick Korintus


public class InvalidShift extends IllegalArgumentException
{
	public InvalidShift()
	{
		super("Error: Invalid shift number entry");
	}

	public InvalidShift(int entry)
	{
		super("Error: Invalid shift number entry: " + entry + "\nShift number can only be 1 or 2");
	}
}