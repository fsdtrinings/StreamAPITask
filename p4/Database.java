package p4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Database {

	public static List<Account> populateFromDatabase()
	{
		
		Account a1 = new Account("Ramesh",101,2600);
		
		Transcation a1t1 = new Transcation(200, "22/1/2022", "Deposit");
		Transcation a1t2 = new Transcation(1200, "22/1/2022", "ATM Widthrwal");
		Transcation a1t3 = new Transcation(400, "22/1/2022", "Fund Transfer");
		
		List<Transcation> allT1 = Arrays.asList(a1t1,a1t2,a1t3);
		a1.setAllTransactions(allT1);
		
		
		
		Account a2 = new Account("Suresh",102,12600);
		Transcation a2t1 = new Transcation(800, "22/1/2022", "Deposit");
		Transcation a2t2 = new Transcation(900, "22/1/2022", "ATM Widthrwal");
		Transcation a2t3 = new Transcation(700, "22/1/2022", "Fund Transfer");
		
		List<Transcation> allT2 = Arrays.asList(a1t1,a1t2,a1t3);
		a2.setAllTransactions(allT2);
		
		
		// add few more accounts like above
		
		
		
		List<Account> allAccounts = Arrays.asList(a1,a2);
		
		return allAccounts;
		
	}
}
