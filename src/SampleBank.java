import bank.*;
class SampleBank {

	public static void main(String[] args) 
	{
		Account accountObject1 = new Account("Ariesh");
		AccountList.addAccountToList(accountObject1);
		
		Account accountObject2 = new Account(5000, "madhi");
		AccountList.addAccountToList(accountObject2);
		
		ATMOperation atmSession1 =  new ATMOperation(1002);
		System.out.println(String.format("%d has balance: %d", 1002, atmSession1.getCustomerAccountbalance()));
		
		atmSession1.withdrawAmount(1000);
		System.out.println(String.format("%d has balance: %d", 1002, atmSession1.getCustomerAccountbalance()));
		
		NetBankingOperation netsession1 = new NetBankingOperation(1002);
		netsession1.depositAmount(500);
		System.out.println(String.format("%d has balance: %d", 1002, atmSession1.getCustomerAccountbalance()));

	}

}
