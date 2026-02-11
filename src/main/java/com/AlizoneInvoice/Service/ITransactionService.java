package com.AlizoneInvoice.Service;

import com.AlizoneInvoice.Entity.Transaction;

public interface ITransactionService {
	
	public Transaction addTransaction(Transaction invoice);
	public Transaction deleteTransaction(Long id);

}
