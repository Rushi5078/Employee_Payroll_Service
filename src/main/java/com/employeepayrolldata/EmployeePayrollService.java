/**
 * 
 */
package com.employeepayrolldata;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author RUSHIKESH BHOSLE
 *
 */
public class EmployeePayrollService
{
	
	public enum IOService 
	{
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	private ArrayList<EmployeePayRollData> employeePayrollList;

	public EmployeePayrollService(ArrayList<EmployeePayRollData> employeePayrollList) 
	{
		this.employeePayrollList = employeePayrollList;
	}
	/**
	 * Purpose: Employee payroll service to read and write
	 * Return:
	 */
	private void readEmployeePayrollData(Scanner consoleInputReader) 
	{
		//Get user input
        System.out.println("Enter the Employee Id : ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter the Employee Name : ");
		String name = consoleInputReader.next();
		System.out.println("Enter the Employee Salary : ");
		double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayRollData(id, name, salary));
	}
//create the method for employee payroll list
	private void writeEmployeePayrollData()
	{
		System.out.println("\nWriting Employee Payroll Roster to Console\n" + employeePayrollList);
	}

	public static void main(String[] args)
	{
        System.out.println("---------- Welcome To Employee Payroll Application ----------\n");
		ArrayList<EmployeePayRollData> employeePayrollList = new ArrayList<EmployeePayRollData>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
//calling the function
		employeePayrollService.readEmployeePayrollData(consoleInputReader);

		employeePayrollService.writeEmployeePayrollData();
    }
}  