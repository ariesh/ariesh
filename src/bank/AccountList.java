package bank;

public class AccountList 
{

	private static Account[] accountList;
	private static int arrayCount = 0;

	static
	{
		accountList = new Account[10];
	}

	public static void addAccountToList(Account accountObject)
	{
		if(arrayCount < 10)
		{
			accountList[arrayCount] = accountObject;
			arrayCount++;
		}
	}
	
	public static Account getAccountDetails(int accountNumber){
		Account accountObject = null;
		
		for(int i = 0 ; i < 10; i++)
		{
			if(accountList[i].getAccountNumber() == accountNumber)
			{
				accountObject = accountList[i];
				break;
			}
			else
			{
				continue;
			}
		}
		
		return accountObject;
	}


}


