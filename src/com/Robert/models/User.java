package com.Robert.models;

public class User extends Person {
	
	private String userName;
	private String userPassWord;
	private boolean doesQualifyForLoan;
	private double accountBalance;
	
	//list of transactions
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		
		this.userName = userName;
		
	}
	public String getUserPassWord() {
		return this.userPassWord;
	}
	
	public void setUserPassWord(String userPassWord) {
		
		this.userPassWord = userPassWord;
		
	}
	
	public boolean getDoesQualifyForLoan() {
		return this.doesQualifyForLoan;
	}

	public void setDoesQualifyForLoan(boolean doesQualifyForLoan) {
		this.doesQualifyForLoan = doesQualifyForLoan;
	}
	
	public double getAccountBalance() {
		return this.accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
