package edu.udea.main.service;

import edu.udea.main.model.Transaction;
import edu.udea.main.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    public List<Transaction> lookTransaction(){
        List<Transaction> transactions = new ArrayList<Transaction>();
        transactions.addAll(transactionRepository.findAll());
        return transactions;

    }
    public void makeTransaction(Transaction transaction){
        transactionRepository.save(transaction);

    }
    public void deleteTransaction(Long id){
        transactionRepository.deleteById(id);
    }
}
