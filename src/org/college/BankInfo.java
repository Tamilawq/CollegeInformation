package org.college;

public class BankInfo {
	public void savings(int savings) {
		System.out.println("savings amount is :"+savings);
	}
	public void fixed(double fixed) {
		System.out.println("fixed amount is :"+fixed);
		}

	public void deposit(int deposit) {
		System.out.println("deposit amount is:"+deposit);
	}

	public static void main(String[]args) {
		BankInfo b = new BankInfo();
		b.savings(245);
		b.fixed(10000.56);
		b.deposit(2000);
	}
}


