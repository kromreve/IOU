package IOUApplication.data;

import IOUApplication.data.mappers.UserInfoMapper;
import IOUApplication.models.UserInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

    public UserInfo signUp(UserInfo userInfo){
        String sql = "";
    }
}
