package com.AlizoneInvoice.Service;
import com.AlizoneInvoice.Repository.TransactionRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AlizoneInvoice.Entity.Transaction;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

	@Override
	public Transaction addTransaction(Transaction invoice) {
		Transaction transaction=new Transaction();
		transaction.setAmount(invoice.getAmount());
		transaction.setDate(invoice.getDate());
		transaction.setDescription(invoice.getDescription());
		transaction.setId(invoice.getId());
		transaction.setType(invoice.getType());
		transactionRepository.save(transaction);
		return transaction;
	}
	@Override
	public Transaction deleteTransaction(Long id) {
		Optional<Transaction> optional=transactionRepository.findById(id);
		Transaction transaction=optional.get();
		transactionRepository.delete(transaction);
		return transaction;
	}
	

}
