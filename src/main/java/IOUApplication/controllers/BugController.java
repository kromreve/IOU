package IOUApplication.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import IOUApplication.domain.BugService;
import IOUApplication.models.Bugs;

@RestController
@RequestMapping("/bug")
public class BugController {
    private final BugService bugService;
    public BugController(BugService bugService){
        this.bugService = bugService;
    }

    @GetMapping
    public List<Bugs> findAll(){
        return bugService.findAll();
    }
}
