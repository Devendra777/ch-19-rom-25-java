class BankAccountRunner {

      public static void main(String[] accounts){
	   System.out.println("main started");
	  
	     // methodName();
		   BankAccount.credit(200.00);
		   
		   	   System.out.println("The Current Balance is " + BankAccount.balance)  ;
		   
		   BankAccount.debit(100.00);
	   
	   
	   System.out.println("The Current Balance is " + BankAccount.balance)  ;
	          
	   
	    System.out.println("main ended");
	   
   }

}