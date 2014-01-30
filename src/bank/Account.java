package bank;

public class Account 
{
	
	 private int bal;
	 private static int accNoCounter = 1000;
	 private int accountNumber;
	 private String accountHolderName;
	 
	 public int getBalance(){
		 return this.bal;
	 }
	 
	 public int getAccountNumber(){
		 return this.accountNumber;
	 }
	 
	 public String getAccountHolderName(){
		 return this.accountHolderName;
	 }
	 
	 public Account(String customerName)
	 {
		 this(0,customerName);
	 }
	 
	 public Account(int openingBalance, String customerName){
		 accNoCounter++;
		 bal = openingBalance;
		 accountHolderName = customerName;
		 accountNumber = accNoCounter;
	 }
	 
	 public int depositAmount(int amount){
		 if(amount > 0)
		 {
			 bal += amount;
		 }
		 return bal;
	 }
	 
	 public int withdrawAmount(int amount){
		 if(amount > 0 && bal > 0)
		 {
		 
			 bal -= amount;
		 }
		 return bal;
	 }
	 
	}
	
	




