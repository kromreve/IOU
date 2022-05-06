package IOUApplication.data;

import IOUApplication.data.mappers.UserInfoMapper;
import IOUApplication.models.UserInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class UserInfoTemplateRepository {
    private final JdbcTemplate jdbcTemplate;

    public UserInfoTemplateRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public UserInfo login(int userID){
        String sql = "select id, password from UserInfo where id = ?;";
        return jdbcTemplate.query(sql, new UserInfoMapper(), userID).stream()
                .findFirst().orElse(null);
    }

    public UserInfo findByName(String name){
        String sql = "Select `id`, `password`, `name`, `email`, `phoneNumber`, " +
                "`bankacct_number`, `bankacct_name`, `acctBalance` from UserInfo where `email` = ?;";
        return jdbcTemplate.query(sql, new UserInfoMapper(), name).stream()
                .findFirst().orElse(null);
    }

    public UserInfo signUp(UserInfo userInfo){
        String sql = "INSERT INTO UserInfo (`password`, `name`, `email`, `phoneNumber`," +
                " `bankacct_number`, `bankacct_name`, `acctBalance`) VALUES (?, ?, ?, ?, ?, ?, ?);";


        KeyHolder keyHolder = new GeneratedKeyHolder();
        int rowsAffected = jdbcTemplate.update(con ->{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, userInfo.getPassword());
            ps.setString(2, userInfo.getName());
            ps.setString(3, userInfo.getEmail());
            ps.setString(4, " ");
            ps.setString(5, " ");
            ps.setString(6, " ");
            ps.setDouble(7, 0);
            return ps;
        },keyHolder);

        if(rowsAffected <= 0){
            return null;
        }
        userInfo.setUserID(keyHolder.getKey().intValue());
        return userInfo;
    }

    public Boolean updateAccount(UserInfo userInfo){
        String sql = "update UserInfo set `name` = ?, `password` = ?, `phoneNumber` = ? where `id` = ?;";

        return jdbcTemplate.update(sql,
                userInfo.getName(),
                userInfo.getPassword(),
                userInfo.getPhoneNumber(),
                userInfo.getUserID()) > 0;
    }
}
