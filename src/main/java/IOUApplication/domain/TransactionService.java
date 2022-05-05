package IOUApplication.domain;


import IOUApplication.data.TransactionTemplateRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final TransactionTemplateRepository transactionTemplateRepository;

    public TransactionService(TransactionTemplateRepository transactionTemplateRepository){
        this.transactionTemplateRepository = transactionTemplateRepository;
    }
}
