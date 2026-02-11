package com.AlizoneInvoice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AlizoneInvoice.Entity.Transaction;
import com.AlizoneInvoice.Service.ITransactionService;
import com.AlizoneInvoice.Service.TransactionService;

@RestController
@RequestMapping("/alizone")
@CrossOrigin(origins = "*")
public class TransactionController implements ITransactionController {
	
	@Autowired
	private TransactionService transactionService;

	@PostMapping("/add")
	@Override
	public Transaction addTransaction(@RequestBody Transaction invoice) {
		
		return transactionService.addTransaction(invoice);
	}

	@DeleteMapping("/dell/{id}")
	@Override
	public Transaction deleteTransaction(@PathVariable Long id) {
	return	transactionService.deleteTransaction(id);
		
	}
	
	@GetMapping("/getall")
	@Override
	public List<Transaction> getallTransactions() {
		return	transactionService.getallTransactions();
		
	}
	

}
