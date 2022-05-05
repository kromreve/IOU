package IOUApplication.data.mappers;

import IOUApplication.models.Transaction;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TransactionMapper implements RowMapper<Transaction>{

    @Override
    public Transaction mapRow(ResultSet rs, int i) throws SQLException{
        return new Transaction(
                rs.getInt("ID"),
                rs.getDouble("amount"),
                rs.getBoolean("sent"),
                rs.getString("message")
        );
    }
}
