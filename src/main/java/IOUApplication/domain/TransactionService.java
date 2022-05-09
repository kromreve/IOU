package IOUApplication.domain;

import IOUApplication.data.TransactionTemplateRepository;
import IOUApplication.data.UserInfoTemplateRepository;
import IOUApplication.models.MoneyTransaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final TransactionTemplateRepository transactionTemplateRepository;
<<<<<<< HEAD

    public TransactionService(TransactionTemplateRepository transactionTemplateRepository) {
=======
    private final UserInfoTemplateRepository userInfoTemplateRepository;
    public TransactionService(TransactionTemplateRepository transactionTemplateRepository,
                              UserInfoTemplateRepository userInfoTemplateRepository){
>>>>>>> 4725a48ea60417bf9c243c09dd00abefc6cae6ec
        this.transactionTemplateRepository = transactionTemplateRepository;
        this.userInfoTemplateRepository = userInfoTemplateRepository;
    }

    public Boolean transaction(MoneyTransaction mt){
       mt.setSender(userInfoTemplateRepository.findByName(mt.getSenderName()));
       mt.setReceiver(userInfoTemplateRepository.findByName(mt.getReceiverName()));
       return transactionTemplateRepository.transaction(mt);
    }
}
