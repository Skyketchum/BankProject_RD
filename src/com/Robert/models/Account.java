package com.Robert.models;

public class Account {
	
	private double accountBalance;
	
    private double currentBalance;
    
    private String currentUser;
    
    private double withdrawalAmount;
    
    private double depositAmount;
    
  

    
    
    public void withdrawal() {
    	
    	if(withdrawalAmount <= currentbalance) {
    	
    	currentBalance - withdrawalAmount = AccountBalance;
    	}
    	
    	System.out.println(currentUser+ "has made a withdrawal of: $" + withdrawalAmount );
    }
	
    
 public void deposit() {
    	
    	currentBalance + depositAmount = AccountBalance;
    	
    	System.out.println(currentUser+ "has made a deposit of: $" + depositAmount );
    }
	
	
}
