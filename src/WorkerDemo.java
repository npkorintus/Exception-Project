// Author: Nick Korintus


import java.util.*;

public class WorkerDemo
{
	public static void main(String[] args)
	{
		String name;
		String number;
		String hireDate;
		int shift;
		double hourlyPayRate;


		createWorker();

		System.out.println("\n");
	}

	public static void createWorker()
	{
		try
		{
			ProductionWorker worker = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 99.00);
			System.out.println(worker);
		}
		catch(InvalidEmployeeNumber e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidShift e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidPayRate e)
		{
			System.out.println(e.getMessage());
		}
	}
}