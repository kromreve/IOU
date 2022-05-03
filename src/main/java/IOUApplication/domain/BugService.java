package IOUApplication.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import IOUApplication.data.BugsTemplateRepository;
import IOUApplication.models.Bugs;

@Service
public class BugService  {
    private final BugsTemplateRepository bugsTemplateRepository;
    public BugService(BugsTemplateRepository bugsTemplateRepository){
        this.bugsTemplateRepository = bugsTemplateRepository;
    }

    public List<Bugs> findAll(){
        return bugsTemplateRepository.findAllBugs();
    }
}
