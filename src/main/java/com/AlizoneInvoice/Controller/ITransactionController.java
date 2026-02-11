package com.AlizoneInvoice.Controller;

import java.util.List;

import com.AlizoneInvoice.Entity.Transaction;

public interface ITransactionController {
	public Transaction addTransaction(Transaction invoice);
	public Transaction deleteTransaction(Long id);
	public List<Transaction> getallTransactions();

}
