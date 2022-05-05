package IOUApplication.controllers;


import IOUApplication.domain.UserInfoService;
import IOUApplication.models.UserInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {
    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService){
        this.userInfoService = userInfoService;
    }

    @PostMapping
    public ResponseEntity<UserInfo> add(@RequestBody UserInfo newUserInfo){
        UserInfo userInfo = UserInfoService.save(newUserInfo);
        if(userInfo != null){
            return new ResponseEntity<>(userInfo, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(userInfo, HttpStatus.BAD_REQUEST);
    }
}
