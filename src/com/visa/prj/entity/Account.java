package com.visa.prj.entity;

/**
 * This is an class to represent account data
 * 
 * @author Mohankumar
 * @version 1.0
 *
 */

public class Account {
	private double balance; // state of object [ instance variable]
	private String accNo;
	private static int count;
	
	public Account(String no) {
		count++;
		this.setAccNo(no);
	}
	
	/**
	 * method to credit amount into account
	 * 
	 * @param amt amount to be credited
	 */
	public void deposit(double amt) {
		balance +=amt;
	}
	
	/**
	 * given the status of current balance
	 * 
	 * @return current balance
	 */
	public double getBalance() {
		return balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	@Override
	public boolean equals(Object obj) {
		Account other = (Account) obj;
		return this.accNo.equals(other.accNo);
	}

}
