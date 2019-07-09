package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account("SB121");
		Account sec = new Account("SB121");

		first.deposit(5000);
		sec.deposit(2500);
		System.out.println("first account");
		System.out.println("Balance : " + first.getBalance());

		System.out.println("second account");
		System.out.println("Balance : " + sec.getBalance());
		System.out.println("**********************************");

		Account geetha = new Account("SB007");
		Account nikhil = new Account("SB013");
		Account ujwala = geetha;

		if (ujwala == geetha) {
			System.out.println("uju and geethu are same");
		}

		if (geetha.equals(ujwala)) {
			System.out.println("uju and geethu are still same");
		}
	}

}
