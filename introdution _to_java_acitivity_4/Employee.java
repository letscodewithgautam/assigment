package inheritance;
// creating employee class
public class Employee {
	// problem 1
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double BasicSalary;
	double SpecialAllowance = 250.80;
	double Hra = 1000.50;
	double transportAllowance;
	//double transport allowance
	
	Employee(long Id,String Name,String Address,Long Phone ){
		this.employeeId= Id;
		this.employeeName=Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;
		
	}
	// method for calculating salary
	void calculateSalary() {
		double salary =  BasicSalary + ( BasicSalary * SpecialAllowance/100) + ( BasicSalary * Hra/100);
		System.out.println("salary of "+employeeName+" is "+salary);
	}
	// adding default transport allowance method
	void claculateTransportAllowance() {
		double transportAllowance = 10*BasicSalary/100;
		System.out.println(employeeName+" transport allowance: "+transportAllowance);
		
	}
}
// deriving manager class from Employee class
class Manager extends Employee{
	public Manager(long Id,String Name,String Address,Long Phone, double salary) {
	
		super(Id,Name,Address,Phone);
		super.BasicSalary=salary;
	}
	void calculateTransportAllowance() {
		double transportAllowance = 15*BasicSalary/100;
		System.out.println(employeeName+" transport allowance: "+transportAllowance);	
	}
}
//deriving Trainee class from Employee
class Trainee extends Employee{
	public Trainee(long Id,String Name,String Address,Long Phone, double salary) {
		super(Id,Name,Address,Phone);
		super.BasicSalary=salary;
	}	
}
