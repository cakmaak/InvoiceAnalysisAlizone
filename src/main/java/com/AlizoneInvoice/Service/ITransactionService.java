package com.AlizoneInvoice.Service;

import java.util.List;

import com.AlizoneInvoice.Entity.Transaction;

public interface ITransactionService {
	
	public Transaction addTransaction(Transaction invoice);
	public Transaction deleteTransaction(Long id);
	public List<Transaction> getallTransactions();

}
