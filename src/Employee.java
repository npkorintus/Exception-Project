// Author: Nick Korintus


public class Employee
{
	private String name;
	private String number;
	private String hireDate;


	// Default Constructor
	public Employee() throws InvalidEmployeeNumber
	{
		name = "";
		number = "";
		hireDate = "";

		for(int i = 0; i < 3; i++)
		{
			if ((number.charAt(i) >= 0 || number.charAt(i) <= 9))
				number = number;
			else
				throw new InvalidEmployeeNumber(number);
		}

		if ((number.charAt(4) >= 'A' && number.charAt(4) <= 'M'))
			number = number;
		else
			throw new InvalidEmployeeNumber(number);
	}


	// Overloaded constructor
	public Employee(String name, String number, String hireDate) throws InvalidEmployeeNumber
	{
		this.name = name;
		this.number = number;
		this.hireDate = hireDate;

		for(int i = 0; i < 3; i++)
		{
			if ((number.charAt(i) >= 0 || number.charAt(i) <= 9))
				number = number;
			else
				throw new InvalidEmployeeNumber(number);
		}

		if ((number.charAt(4) >= 'A' && number.charAt(4) <= 'M'))
			number = number;
		else
			throw new InvalidEmployeeNumber(number);
	}


	// setName method
	public void setName(String name)
	{
		this.name = name;
	}


	// setEmployeeNumber method
	public void setEmployeeNumber(String number)
	{
		this.number = number;
	}


	// setHireDate method
	public void setHireDate(String hireDate)
	{
		this.hireDate = hireDate;
	}


	// getName method
	public String getName()
	{
		return name;
	}


	// getEmployeeNumber method
	public String getEmployeeNumber()
	{
		isValidEmpNum();
		return number;
	}


	// getHireDate method
	public String getHireDate()
	{
		return hireDate;
	}


	// isValidEmpNum method
	public void isValidEmpNum()
	{
		for(int i = 0; i < 3; i++)
		{
			if ((number.charAt(i) >= 0 || number.charAt(i) <= 9))
				number = number;
			else
				number = "Invalid";
		}

		if ((number.charAt(4) >= 'A' && number.charAt(4) <= 'M'))
			number = number;
		else
			number = "Invalid";
	}


	// toString method
	public String toString()
	{
		String str = "Employee name: " + getName() + "\nEmployee Number: " + getEmployeeNumber() +
						"\nHire Date: " + getHireDate();

		return str;
	}
}