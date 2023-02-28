package Assigment;

interface BankAccount {
	void deposit();
	void withdraw();
}
class CheckingAccount implements BankAccount {
	
	public void deposit() {
		System.out.println("deposit");
	}
	public void withdraw() {
		System.out.println("withdraw");
	}
}
public interface InterfaceEg2 {
	public static void main(String[] args) {
		BankAccount obj = new CheckingAccount();
		obj.deposit();
		obj.withdraw();
	}

}
