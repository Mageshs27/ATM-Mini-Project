package com.atm.demo;
import java.util.*;

public class MainClass {
public static void main(String[] args) {
  AtmOperationInterface op=new AtmOperationImplement();
	int atmnumber=1234;
	int atmpin=123;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Welcome to ATM Machine!!!");
	System.out.println("Enter Atm Number :");
	int number=s.nextInt();
	System.out.println("Enter Atm Pin :");
	int pin=s.nextInt();
	
	if((atmnumber==number)&&(atmpin==pin))
		{
		 while(true) {
		 
			 System.out.println("1. View Available Balance\n2.Withdraw Amount\n3. Deposit Amount\n4.View Ministatement\n5.Exit"); 
			 System.out.println("Enter the Choice :");
			 int choice=s.nextInt();
			 if(choice==1)
			 {
				 op.viewBalance();
			 }
			 else if(choice==2)
			 {
				System.out.println("Enter Amount To Withdraw :"); 
				double withdrawAmount=s.nextDouble();
			    op.withdrawAmount(withdrawAmount);
			 
			 }
			 else if(choice==3) {
				 System.out.println("Enter Amount To Deposit :");
				 double deposit=s.nextDouble(); //5000
				 op.depositAmount(deposit);
			  
			 
			 }
			 else if(choice==4)
			 {
				 op.viewMiniStatement();
			 }
			 else if(choice==5)
			 {
				 System.out.println("Collect your ATM Card\nThank you for visiting ATM");
				 System.exit(0);
			 }
			 else
			 {
				 System.out.println("Please enter Correct Choice");
			 }
			 
			 
	    }
		}
	
	else
		{
		System.out.println("Incorrect Atm Number or Pin Number");
		System.exit(0);
		}
}
}
