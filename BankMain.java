package com.Bank;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner bm = new Scanner(System.in);
		System.out.println(" _____________________ ");
		System.out.println("| WELCOME TO ABC BANK |");
		System.out.println("|_____________________|");
		System.out.println("                              ");
		System.out.println("                              ");
		
	    System.out.println(" Enter Number Of Account Holder   : ");
	    System.out.println("------------------------------------");
	    
	    int n= bm.nextInt();
	   
	    BankDetails D[]= new BankDetails[n];
	    
	    for (int i=0; i<D.length; i++) {
	    	D[i] = new BankDetails();
	    	D[i].openAccount();
	    }
	    
	    int ch;
	    do {
	    	System.out.println("\t  _______________________________ ");	
	    	System.out.println("\t |      ABC BANK SERVICES        |");
	    	System.out.println("\t |_______________________________|");
	    	System.out.println("\t | 1.Display Account Details     |");
	    	System.out.println("\t | 2.Search Account Number       |");
	    	System.out.println("\t | 3.Deposit The Amount          |");
	    	System.out.println("\t | 4.Withdraw The Amount         |");
	    	System.out.println("\t | 5.Exit                        |");
	    	System.out.println("\t |_______________________________|");
	    	
	    	ch = bm.nextInt();
	    	
	    	switch(ch) {
	    	case 1: 
	    		for (int i=0;i<D.length;i++) {
	    		    D[i].showAccount(); 
	         	    }
	            break;
	        
	    	case 2:
	    		System.out.println("<<< Search Account_No : >>>");
	    		String ac_no = bm.next();
	    		boolean found = false ;
	    		   for (int i=0; i<D.length; i++) {
	    			   found = D[i].search(ac_no);
	    			   if(found) {
	    			   break;
	    			 }
	    		    }	
	    		     if(!found) {
	    			   System.out.println(" Account don't exist..!! ");
	    		    }
	    		    
	    		    break;
	    			
	        case 3:
	        	 System.out.println("Enter Account_No");
	        	 ac_no = bm.next();
	        	 found = false;
	        	 for ( int i=0; i<D.length; i++) {
	        		 found = D[i].search(ac_no);
	        		 if (found) {
	        			 D[i].deposit();
	        			 break;
	        		   }
	        	      } 
	    		     if (!found) {
	    		    	System.out.println(" Account don't exist..!! ");
	    		      }
	    		     break;
	    		     
	        case 4:
	        	 System.out.println(" Enter Account_No ");
	        	 ac_no = bm.next();
	        	 found = false;
	        	 for ( int i=0; i<D.length; i++) {
	        		 found = D[i].search(ac_no);
	        		 if (found) {
	        			 D[i].withdrawal();
	        			 break;
	        		   }
	        	      } 
	    		     if (!found) {
	    		    	System.out.println("|XXX| Account don't exist..!!|XXX| ");
	    		      }
	    		     break;
	    		
	        case 5:
	        	 System.out.println(" ___________________________");
	        	 System.out.println("|---Thank You For Visting---|");
	        	 System.out.println("|___________________________|");
	        	 break;
	    	}
	    }while (ch!=5);
	    ch=1;
	    bm.close();
	}
}
