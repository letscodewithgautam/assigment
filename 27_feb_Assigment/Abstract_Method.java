package com.cognizant.tax;

abstract class BankAccount {
	int accont_number = 5456565;
	int balance = 30000;
	abstract void Deposit();
	abstract void withdraw();
}
class CheckingAccount extends BankAccount {
	void Deposit() {
		int Deposit = 1000;
		System.out.println("Amount Deposit "+(balance+Deposit));
	}
	void WithDraw() {
		int WithDraw = 500;
		System.out.println("Amount WithDraw "+(balance-WithDraw));
	}
	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		
	}
}
public class Abstract_Method {
	public static void main(String[] args) {
		BankAccount obj = new CheckingAccount();
		obj.Deposit();
		obj.withdraw();
	}

}
