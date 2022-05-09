package IOUApplication.controllers;


import IOUApplication.domain.TransactionService;
import IOUApplication.models.MoneyTransaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @PutMapping
    public boolean transaction(@RequestBody MoneyTransaction mt){
        return transactionService.transaction(mt);
    }
}
