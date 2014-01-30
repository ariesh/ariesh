package bank;

public class ATMOperation 
{

	private int accountNumber;
	private Account customerAccount;
	
	public ATMOperation(int accountNumber){
		this.accountNumber = accountNumber;
		customerAccount = AccountList.getAccountDetails(this.accountNumber);
	}
	
	public int getCustomerAccountbalance(){
		return customerAccount.getBalance();
	}
	
	public int withdrawAmount(int amount){
		return customerAccount.withdrawAmount(amount);
	}


}
