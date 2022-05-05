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

    public static UserInfo save(UserInfo userInfo){
        return new UserInfo(userInfo.getUserID(),
                userInfo.getPassword(),
                userInfo.getName(),
                userInfo.getEmail(),
                userInfo.getPhoneNumber(),
                userInfo.getBankAcctNumber(),
                userInfo.getBankAcctName(),
                userInfo.getAcctBalance()
                );
    }
}
