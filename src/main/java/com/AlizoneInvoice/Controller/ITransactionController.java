package com.AlizoneInvoice.Controller;

import com.AlizoneInvoice.Entity.Transaction;

public interface ITransactionController {
	public Transaction addTransaction(Transaction invoice);
	public Transaction deleteTransaction(Long id);

}
