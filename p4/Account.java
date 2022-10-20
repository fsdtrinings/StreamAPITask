package p4;

import java.util.*;

public class Account {

	private String name;
	private int accountNumber;
	private int balance;
	
	private List<Transcation> allTransactions;

	
	public Account(String name, int accountNumber, int balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Transcation> getAllTransactions() {
		return allTransactions;
	}

	public void setAllTransactions(List<Transcation> allTransactions) {
		this.allTransactions = allTransactions;
	}

	
	
	
}
