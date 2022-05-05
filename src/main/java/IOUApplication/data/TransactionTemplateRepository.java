package IOUApplication.data;


import IOUApplication.data.mappers.TransactionMapper;
import IOUApplication.models.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
