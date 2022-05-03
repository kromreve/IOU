package IOUApplication.data.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import IOUApplication.models.Bugs;

public class BugMapper implements RowMapper<Bugs> {

    @Override
    public Bugs mapRow(ResultSet rs, int i) throws SQLException {
        // TODO Auto-generated method stub
        return new Bugs(
            rs.getInt("ID"), 
            rs.getString("Description")
        );
    }
    
}
