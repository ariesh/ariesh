package bank;

public class NetBankingOperation 
{
	private int accountNumber;
	private Account customerAccount;
	
	public NetBankingOperation(int accountNumber)
	{
		this.accountNumber = accountNumber;
		customerAccount = AccountList.getAccountDetails(this.accountNumber);
	}
	
	public int getCustomerAccountbalance(){
		return customerAccount.getBalance();
	}
	
	public int withdrawAmount(int amount){
		return customerAccount.withdrawAmount(amount);
	}
	
	public int depositAmount(int amount){
		return customerAccount.depositAmount(amount);
	}
}
