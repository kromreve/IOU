package IOUApplication.domain;


import IOUApplication.data.UserInfoTemplateRepository;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    private final UserInfoTemplateRepository userInfoTemplateRepository;

    public UserInfoService(UserInfoTemplateRepository userInfoTemplateRepository){
        this.userInfoTemplateRepository = userInfoTemplateRepository;
    }
}
