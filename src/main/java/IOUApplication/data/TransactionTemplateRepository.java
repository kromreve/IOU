package IOUApplication.data;


import IOUApplication.data.mappers.TransactionMapper;
import IOUApplication.models.MoneyTransaction;
import IOUApplication.models.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TransactionTemplateRepository {

    private final JdbcTemplate jdbcTemplate;

    public TransactionTemplateRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Transaction deposit(int userID, double amount){
        String sql = "Update 'IOUDatabase' . 'UserInfo' SET 'acctBalance = ? where id = ?";
        return jdbcTemplate.query(sql, new TransactionMapper(), userID, amount).stream()
                .findFirst().orElse(null);
    }

    @Transactional
    public boolean transaction(MoneyTransaction mt){
        String sql = "Update UserInfo set acctbalance = ? where id = ?;";
        double newBalance = mt.getSender().getAcctBalance() - mt.getAmount();
        jdbcTemplate.update(sql, newBalance, mt.getSender().getUserID());

        newBalance = mt.getReceiver().getAcctBalance() + mt.getAmount();
        return jdbcTemplate.update(sql, newBalance, mt.getReceiver().getUserID()) > 0;
    }
}
