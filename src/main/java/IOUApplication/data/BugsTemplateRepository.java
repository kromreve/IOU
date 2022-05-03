package IOUApplication.data;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import IOUApplication.data.mappers.BugMapper;
import IOUApplication.models.Bugs;

@Repository
public class BugsTemplateRepository {
    private final JdbcTemplate jdbcTemplate;
    public BugsTemplateRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }



    public List<Bugs> findAllBugs(){
        String sql = "SELECT ID, `Description` from bugs;";
        return jdbcTemplate.query(sql, new BugMapper());
    }
}
