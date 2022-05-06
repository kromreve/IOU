package IOUApplication.domain;


import IOUApplication.data.UserInfoTemplateRepository;
import IOUApplication.models.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    private final UserInfoTemplateRepository userInfoTemplateRepository;

    public UserInfoService(UserInfoTemplateRepository userInfoTemplateRepository){
        this.userInfoTemplateRepository = userInfoTemplateRepository;
    }

    public UserInfo signUp(UserInfo userInfo){
       return userInfoTemplateRepository.signUp(userInfo);
    }

    public Boolean login(UserInfo userInfo){
        UserInfo foundUser = userInfoTemplateRepository.findByName(userInfo.getEmail());

        if(foundUser == null) return false;
        if(foundUser.getPassword().equals(userInfo.getPassword())) return true;

        return false;
    }

    public Boolean updateAccount(UserInfo userInfo){
        return userInfoTemplateRepository.updateAccount(userInfo);
    }
}
