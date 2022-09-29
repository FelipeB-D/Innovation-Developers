package edu.udea.main.controller;

import edu.udea.main.model.Transaction;
import edu.udea.main.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @GetMapping("/transaction")
    private List<Transaction> lookTransaction(){
        return transactionService.lookTransaction();
    }
    @PostMapping("/transaction")
    private void makeTransaction(@RequestBody Transaction transaction){
        transactionService.makeTransaction(transaction);
    }
    @DeleteMapping("/transaction/{id}")
    private void deleteTransaction(@PathVariable("id") Long id){
        transactionService.deleteTransaction(id);
    }


}
