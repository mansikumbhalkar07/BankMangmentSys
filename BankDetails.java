package com.Bank;

import java.util.*;

public class BankDetails {
	private String acNo;
	private String name;
	private String ac_type;
	private long balance;
	
	Scanner sc = new Scanner(System.in);
    public void openAccount() {
    	
    	System.out.println("Enter Account No :  ");
    	System.out.println("--------------------");
    	acNo = sc.next();
    	
    	System.out.println("Enter Account Type : ");
    	System.out.println("---------------------");
    	ac_type = sc.next();
    	
    	System.out.println("Enter  Customer Name :  ");
    	System.out.println("------------------------");
    	name = sc.next();
    	
    	System.out.println("Enter Amount  :  ");
    	System.out.println("----------------- ");
    	balance = sc.nextLong();
    	
    }
     
    public void showAccount() {
    	System.out.println("Name of Account Holder :"+ name);
    	
    	System.out.println("Account No :"+ acNo);
    	
    	System.out.println("Account Type :"+ ac_type);
    	
        System.out.println("Balance :" + balance);
        
    }
    
    public void deposit() {
    	
    	 long amt;
    	 System.out.println("Enter the amount you want to deposit :  ");
    	 System.out.println("----------------------------------------");
    	 amt = sc.nextLong();
    	 balance = balance + amt;
    }
    
    public void withdrawal() {
    	
    	long amt ;
    	System.out.println("Enter the amount you want to withdraw :  ");
    	System.out.println("-----------------------------------------");
    	amt = sc.nextLong();
    	
    	if(balance>=amt) {
    		balance = balance-amt;
    		System.out.println("Blance after withdrawal :"+ balance);	
    	}else {
    		System.out.println("Your blance is less than"+amt +" \tTransction failed...!!");
    	}	
    }
    
    public boolean search (String acc_no) {
    	if (acNo.equals(acc_no)) {
    		showAccount();
    		return(true);
    	}
    	return(false);
    }
}
