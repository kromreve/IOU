package IOUApplication.data.mappers;

import IOUApplication.models.UserInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoMapper implements RowMapper<UserInfo> {

    @Override
    public UserInfo mapRow(ResultSet rs, int i) throws SQLException{

        return new UserInfo(
                rs.getInt("ID"),
                rs.getString("password"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("phoneNumber"),
                rs.getString("bankacct_number"),
                rs.getString("bankacct_name"),
                rs.getDouble("acctBalance")
        );
    }

}
