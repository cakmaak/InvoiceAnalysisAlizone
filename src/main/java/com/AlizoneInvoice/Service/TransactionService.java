package com.AlizoneInvoice.Service;
import com.AlizoneInvoice.Repository.TransactionRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.time.ZoneId;

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
		transaction.setTutar(invoice.getTutar());
		transaction.setFaturaTarihi(invoice.getFaturaTarihi());
		transaction.setAciklama(invoice.getAciklama());
		transaction.setId(invoice.getId());
		transaction.setType(invoice.getType());
		transaction.setEklenmetarihi(
			    LocalDateTime.now(ZoneId.of("Europe/Istanbul"))
			);
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
	
	@Override
	public List<Transaction> getallTransactions() {
		List<Transaction> transactions=transactionRepository.findAll();
		return transactions;
	}
	

}
