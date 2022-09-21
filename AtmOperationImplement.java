package com.atm.demo;
import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplement implements AtmOperationInterface {
ATM atm=new ATM();
Map<Double,String>mini=new HashMap<>();



	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
	if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance()) {
			mini.put(withdrawAmount," Amount Withdrawn");
			System.out.println("Collecct the Cash " + withdrawAmount ); 
			atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
		}
		 else 
		{
			System.out.println("Insufficent Balance!!");
		}
	}
	else
	{
		System.out.println("Please enter the amount in multipal of 500");
	}
		 
	}

	@Override
	public void depositAmount(double depositAmount) {
		mini.put(depositAmount, " Amount Deposit");
		System.out.println(depositAmount + " Deposited Successfully!!");	
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
	 for(Map.Entry<Double,String>m:mini.entrySet())
	 {
		 System.out.println(m.getKey()+""+m.getValue());
	 }
	}

	
	
	  
}
