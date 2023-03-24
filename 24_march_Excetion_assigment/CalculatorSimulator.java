package Assigment;

class CountryNotValidException extends Exception{  // creating country_not_valid_Exception by extending exception
	public CountryNotValidException(String msg) {  // constructor
		super(msg);  // passing message (msg) to super class
	}
}

class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String msg) {
		super(msg);
	}
}

class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String msg) {
		super(msg);
	}
}

class TaxCalculator{  // creating tax calculator class
	public double calculateTax(String empName, boolean isIndian, double empSal) throws Exception{
		double amount = 0;
		if(isIndian == false) {  // checking condition
			throw new CountryNotValidException("The employee should be an citizen for calculating tax");
		}
		else if (empName == null) {
			throw new EmployeeNameInvalidException ("The employee name cannot be empty");
		}
		else if(empSal>10000 && isIndian ==true) {
			amount = (empSal*8)/100;  // assigning calculated value to amount
		}
		else if (empSal>50000 && empSal < 100000 && isIndian == true) {
			amount = (empSal*6)/100;
		}
		else if (empSal>30000 && empSal < 50000 && isIndian == true) {
			amount = (empSal*5)/100;
		}
		else if (empSal>10000 && empSal < 300000 && isIndian == true) {
			amount = (empSal*4)/100;
		}
		else {  // if any condition don't match this line will execute
			throw new TaxNotEligibleException("The employee does not to pay tax ;");
		}
		return amount;
	}
}
public class CalculatorSimulator {  // main class
	public static void main(String[] args) throws Exception {  // main method
		TaxCalculator taxCalculator = new TaxCalculator();  // creating calculator object
		try {  // code here may throw exception
			System.out.println(taxCalculator.calculateTax("ron",false,3400));
		}
		catch (Exception ex) {  // catch block
			System.out.println(ex.getMessage());
		}
		try {
			System.out.println(taxCalculator.calculateTax("Tim",true,100));
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			System.out.println(taxCalculator.calculateTax("Jack",true,55000));
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			System.out.println(taxCalculator.calculateTax(null,true,3400));
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}

